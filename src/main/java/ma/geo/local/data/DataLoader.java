package ma.geo.local.data;

import ma.geo.local.entities.UserEntity;
import ma.geo.local.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 1; i < 10; i++)
            userRepository.save(new UserEntity("ahmed" + i, passwordEncoder.encode("123"), "a@gmail.com"));
    }
}
