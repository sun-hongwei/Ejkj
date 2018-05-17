package com.ejkj.service.impl;

import com.ejkj.dao.UserMapper;
import com.ejkj.entity.User;
import com.ejkj.entity.UserExample;
import com.ejkj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询用户
     * @param id 用户 ID
     * @return
     */
    public User getUserById(int id) {

        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    public int insert(User user) {

        return userMapper.insert(user);
    }

    /**
     * 查询用户集合
     * @param userExample
     * @return
     */
    public List<User> getUserByExample(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    /**
     * 更新用户信息
     * @param record
     * @param example
     * @return
     */
    public int updateByExample(User record, UserExample example) {
        return userMapper.updateByExampleSelective(record, example);
    }
}
