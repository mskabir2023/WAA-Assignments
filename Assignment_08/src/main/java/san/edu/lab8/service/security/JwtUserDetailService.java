package san.edu.lab8.service.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import san.edu.lab8.domain.User;
import san.edu.lab8.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JwtUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        org.springframework.security.core.userdetails.User springUser = null;
        User user = userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User with email: " + username +" Not Found"));
        if(user != null && user.getRole()!=null) {
            List<SimpleGrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(user.getRole()));

            /*
            org.springframework.security.core.userdetails.User springUser = null;
            User user = userService.loadUserByUsername(username);
            if(user != null){
                List<SimpleGrantedAuthority> authorities = null;
                List<Role> roles = user.getRoles();
                if(roles != null){
                    authorities = new ArrayList<>();
                    for(Role currentRole: roles){
                        authorities.add(new SimpleGrantedAuthority(currentRole.name()));
                    }
                }
                springUser = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
            }
            return springUser;
            */
//            springUser = new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),true,true,true,true, authorities);
        }
        return user;
    }
}
