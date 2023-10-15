package san.edu.lab8.service.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import san.edu.lab8.domain.User;
import san.edu.lab8.dto.RegistrationDTO;
import san.edu.lab8.dto.UserDTO;
import san.edu.lab8.repository.UserRepository;

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
        user.setRole(u.getRole());
        user.setName(u.getName());
        User newUser = userRepository.save(user);
        RegistrationDTO registrationDTO = new RegistrationDTO();
        registrationDTO.setEmail(newUser.getEmail());
        registrationDTO.setId(newUser.getId());
        registrationDTO.setName(user.getName());
        return registrationDTO;
    }
}
