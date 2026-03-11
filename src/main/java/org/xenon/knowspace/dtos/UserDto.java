package org.xenon.knowspace.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    private String id;
    private String name;
    private String email;
}
