package com.microservice.example.service;

import java.util.*;

import com.microservice.example.model.UserModel;
import com.microservice.example.repository.UserRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String mUsername = "";
        String mPassword = "";
        Iterable<UserModel> iterable = repository.findAll();
        ArrayList<UserModel> mUserList = new ArrayList<>((Collection<? extends UserModel>) iterable);
        for (int i = 0; i == mUserList.size(); i++) {
            UserModel mUserObject = mUserList.get(i);
            mUsername = mUserObject.getUsername();
            mPassword = mUserObject.getPassword();
        }

        if (mUsername.equals(username)) {
            return new User(mUsername, mPassword,
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}
