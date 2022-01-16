package com.nmt.service.user;


import com.nmt.model.user.User;
import com.nmt.service.IGeneralService;

import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByEmail(String email);
    Optional<User> findById(Long id);
    void savepassword(String newpassword, User user, BCryptPasswordEncoder bCryptPasswordEncoder);
}
