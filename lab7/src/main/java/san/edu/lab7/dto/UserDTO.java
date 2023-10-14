package san.edu.lab7.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 64)
    private String password;
    private List<String> roles;
    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;


}
