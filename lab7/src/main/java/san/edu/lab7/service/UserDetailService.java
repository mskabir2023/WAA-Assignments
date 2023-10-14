package san.edu.lab7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import san.edu.lab7.domain.User;
import san.edu.lab7.repository.UserRepository;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u = userRepository.findByEmail(username).get();
        if (u == null) {
            throw new UsernameNotFoundException(username);
        } else {

            return org.springframework.security.core.userdetails.User
                    .withUsername(u.getEmail())
                    .password(u.getPassword())
                    .authorities(u.getRoles().stream().map(s -> new SimpleGrantedAuthority(s)).collect(Collectors.toList()))
//                    .roles(u.getRoles().stream().collect(Collectors.joining(","))) //ROLE_USER,ADMIN
                    .build();
        }
    }
}
