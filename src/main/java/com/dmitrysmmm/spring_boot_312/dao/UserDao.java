package com.dmitrysmmm.spring_boot_312.dao;



import com.dmitrysmmm.spring_boot_312.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void dropUser(long id);

    List<User> getAll();

    User show(long id);

    void updateUser(User user, long id);



}
