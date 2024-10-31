package edu.travelmore.crm.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {

    private String id;
    private String userName;
    private String email;
    private String password;
    private String role;
}
