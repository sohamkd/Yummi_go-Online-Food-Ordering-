package com.YummiGo.service;

import com.YummiGo.config.JwtProvider;
import com.YummiGo.model.User;
import com.YummiGo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {

        String email=jwtProvider.getEmailFromJwtToken(jwt);
        User user=findUserByEmail(email);
        return user;
    }

    @Override
    public User findUserByEmail(String email) throws Exception {

        User user = userRepository.findByEmail(email);

        if(user==null)
        {
            throw new Exception("user not found");
        }
        return user;
    }
}
