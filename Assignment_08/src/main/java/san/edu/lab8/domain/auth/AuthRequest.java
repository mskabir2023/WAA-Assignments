package san.edu.lab8.domain.auth;

import lombok.Data;

@Data
public class AuthRequest {

    private String email;
    private String password;

}
