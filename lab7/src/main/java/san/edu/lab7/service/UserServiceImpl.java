package san.edu.lab7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import san.edu.lab7.domain.User;
import san.edu.lab7.dto.RegistrationDTO;
import san.edu.lab7.dto.UserDTO;
import san.edu.lab7.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public RegistrationDTO save(UserDTO u) {
        User user = new User();
        user.setEmail(u.getEmail());
        user.setPassword(passwordEncoder.encode(u.getPassword()));
        user.setRoles(u.getRoles());
        user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        User newUser = userRepository.save(user);
        RegistrationDTO registrationDTO = new RegistrationDTO();
        registrationDTO.setEmail(newUser.getEmail());
        registrationDTO.setId(newUser.getId());
        registrationDTO.setFirstName(user.getFirstName());
        registrationDTO.setFirstName(user.getLastName());

        return registrationDTO;
    }
}
