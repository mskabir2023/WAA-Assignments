package san.edu.lab8.service.security;


import san.edu.lab8.domain.User;
import san.edu.lab8.dto.RegistrationDTO;
import san.edu.lab8.dto.UserDTO;

public interface UserService {

    //public User save(User u);
    public RegistrationDTO save(UserDTO u);

}
