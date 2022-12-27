package com.springboot.sec.user;


import lombok.*;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @developer Shahidul Hasan
 * class User
 * Model
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "sec_users")
public class User implements Serializable {

    @Id
    private String id;
    private Boolean enabled;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String contactNumber;

    private String password;
    private String passwordSalt;
}