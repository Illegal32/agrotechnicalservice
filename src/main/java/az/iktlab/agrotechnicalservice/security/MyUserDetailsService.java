package az.iktlab.agrotechnicalservice.security;

import az.iktlab.agrotechnicalservice.dao.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UsersRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new MyUserDetails(repository
                .findByUsername(username)
                .orElseThrow(
                        () -> new UsernameNotFoundException("Not Found: " + username)
                )
        );
    }
}
