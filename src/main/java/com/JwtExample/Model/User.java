package com.JwtExample.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User {
    private String userId;
    private String name;
    private String mail;
}
