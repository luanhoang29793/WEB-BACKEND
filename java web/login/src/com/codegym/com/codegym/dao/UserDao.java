package com.codegym.com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User us1 = new User();
        us1.setAge(23);
        us1.setName("luan");
        us1.setAccount("luan123");
        us1.setPassword("luan123");
        us1.setEmail("luan1993123");
        users.add(us1);
        User us2 = new User();
        us2.setAge(22);
        us2.setName("cuong");
        us2.setAccount("cuong123");
        us2.setPassword("cuong123");
        us2.setEmail("cuong1997123");
        users.add(us2);
        User us3 = new User();
        us3.setAge(20);
        us3.setName("thanh");
        us3.setAccount("thanh123");
        us3.setPassword("thanh123");
        us2.setEmail("thanh1996123");
        users.add(us3);
    }

    public static User checkLogin(Login login) {
        for (User u : users) {
            if (u.getAccount().equals(login.getAccount())
                    && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}


