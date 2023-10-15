package san.edu.lab8.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Data
@Entity
@Table(name="user_demo")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 50, unique = true)
    private String name;
    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

   /* public User(String name, String email) {
        this.name = name;
        this.email = email;
    }*/

    private String role;
    /*@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<? extends GrantedAuthority> userRoles = roles.stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole().toUpperCase(Locale.ROOT)))
                .collect(Collectors.toList());
        return userRoles;
    }*/

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<SimpleGrantedAuthority> userRoles =
               new ArrayList<SimpleGrantedAuthority>();
        SimpleGrantedAuthority auth =new SimpleGrantedAuthority("ROLE_" + getRole().toUpperCase(Locale.ROOT));
        userRoles.add(auth);
        return userRoles;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
