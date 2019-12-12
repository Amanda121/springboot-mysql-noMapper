package com.example.mysql.Service;

import com.example.mysql.Entity.User;

import java.util.List;

public interface UserService {
    List <User> selectUserInfo();
}
