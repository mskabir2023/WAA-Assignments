package san.edu.lab8.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class RegistrationDTO {
    private String email;
    private String name;
    private Integer id;
}
