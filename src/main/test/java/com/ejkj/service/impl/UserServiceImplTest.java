package com.ejkj.service.impl;

import com.ejkj.entity.User;
import com.ejkj.entity.UserExample;
import com.ejkj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void getUserById() {
        try {
            User user = userService.getUserById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @Transactional
    public void insert() {

        User user = new User();
        user.setUsername("雷军456");

        try {
            userService.insert(user);

            int i = 9/0;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void getUserByExample() {
        UserExample userExample = new UserExample();

        UserExample.Criteria criteria = userExample.createCriteria();

        criteria.andUsernameEqualTo("王五");

        try {
            List<User> userByExample =
                    userService.getUserByExample(userExample);

            System.out.println(userByExample.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void updateByExample() {
        UserExample userExample = new UserExample();

        UserExample.Criteria criteria = userExample.createCriteria();

        criteria.andUsernameEqualTo("张三");

        User user = new User();
        user.setUsername("老罗");

        try {
            int i = userService.updateByExample(user, userExample);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}