package org.xenon.knowspace.services;

import io.jsonwebtoken.Claims;

import javax.crypto.SecretKey;
import java.util.Date;

public class Jwt {
    private final Claims claims;
    private final SecretKey secretKey;

    public Jwt(Claims claims, SecretKey secretKey){
        this.claims = claims;
        this.secretKey = secretKey;
    }

    public boolean isExpired(){
         return claims.getExpiration().before(new Date());
    }
}
