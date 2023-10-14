package san.edu.lab7.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RegistrationDTO {
    private String email;
    private String firstName;

    private String lastName;

    private Long id;
}
