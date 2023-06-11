package ma.geo.local.services;

import ma.geo.local.entities.UserEntity;
import ma.geo.local.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserServiceDetailImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUserName(userName);
        if(userEntity==null){
            throw new UsernameNotFoundException("User Name Introuvable");
        }
        User user= new User(userEntity.getUserName(),userEntity.getPassword(),new ArrayList<>());
        return user;
    }
}
