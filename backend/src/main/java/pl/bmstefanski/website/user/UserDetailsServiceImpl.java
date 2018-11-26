package pl.bmstefanski.website.user;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.bmstefanski.website.role.Role;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository userRepository;

  @Autowired
  public UserDetailsServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<User> user = this.userRepository.findByUsername(username);

    if (!user.isPresent()) {
      throw new UsernameNotFoundException("No user found with that username");
    }

    return new pl.bmstefanski.website.user.UserDetails(
        user.get(),
        user.get().getUsername(),
        user.get().getPassword(),
        this.getAuthoritiesByRoles(user.get().getRoles())
    );
  }

  private Set<? extends GrantedAuthority> getAuthoritiesByRoles(Collection<Role> roles) {
    return roles.stream()
        .map(role -> new SimpleGrantedAuthority(role.getName()))
        .collect(Collectors.toSet());
  }

}
