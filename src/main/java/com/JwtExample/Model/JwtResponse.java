package com.JwtExample.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class JwtResponse {
    String jwtToken;
    String username;
}
