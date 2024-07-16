package com.dmitrysmmm.spring_boot_312.service;



import com.dmitrysmmm.spring_boot_312.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void dropUser(long id);

    List<User> getAll();

    User show(long id);

    void updateUser(User user, long id);

}
