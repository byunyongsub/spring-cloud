package com.example.cloud.auth;

import com.example.cloud.auth.entity.Address;
import com.example.cloud.auth.entity.User;
import com.example.cloud.auth.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertNewUser() {
        userRepository.save(User.builder()
                .uid("byunyongsub@naver.com")
                .password(passwordEncoder.encode("1q2w3e4r!@"))
                .name("yongsub")
                .roles(Collections.singletonList("ROLE_USER"))
                .build());
    }
}
