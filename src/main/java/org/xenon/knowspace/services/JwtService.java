package org.xenon.knowspace.services;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import org.xenon.knowspace.config.JwtConfig;
import org.xenon.knowspace.entities.User;

import java.util.Date;

@AllArgsConstructor
public class JwtService {
    private final JwtConfig jwtConfig;

    private Jwt generateToken(User user, long tokenExpiration){
         var claims = Jwts.claims()
                 .subject(user.getId().toString())
                 .add("email",user.getEmail())
                 .add("name",user.getName())
                 .add("role",user.getRole().toString())
                 .issuedAt(new Date())
                 .expiration(new Date(System.currentTimeMillis() + tokenExpiration*1000))
                 .build();

         return new Jwt(claims, jwtConfig.getSecretKey());
    }

    private Claims getClaims(String token){
        return Jwts.parser()
                .verifyWith(jwtConfig.getSecretKey())
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}
