package com.ejkj.service;


import com.ejkj.entity.User;
import com.ejkj.entity.UserExample;

import java.util.List;

public interface UserService {

    User getUserById(int id) throws Exception;

    int insert(User user) throws Exception;

    List<User> getUserByExample(UserExample userExample) throws Exception;

    int updateByExample(User user, UserExample example) throws Exception;

}
