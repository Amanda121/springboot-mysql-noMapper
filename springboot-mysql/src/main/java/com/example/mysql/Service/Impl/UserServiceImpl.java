package com.example.mysql.Service.Impl;

import com.example.mysql.Entity.User;
import com.example.mysql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List <User> selectUserInfo() {
        String sql = "SELECT ID,NAME,PASSWORD,AGE FROM USER";
        return (List<User>) jdbcTemplate.query(sql, new RowMapper <User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user1 = new User();
                user1.setAge(resultSet.getInt("AGE"));
                user1.setId(resultSet.getLong("ID"));
                user1.setPassword(resultSet.getString("PASSWORD"));
                user1.setName(resultSet.getString("NAME"));
                return user1;
            }

        });
    }



}
