package san.edu.lab7.service;


import san.edu.lab7.dto.RegistrationDTO;
import san.edu.lab7.dto.UserDTO;

public interface UserService {

    //public User save(User u);
    public RegistrationDTO save(UserDTO u);

}
