package com.example.service.serviceImpl;

import com.example.bean.User;
import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zfc
 * @Package com.example.service.serviceImpl
 * @date 2020/10/26 16:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User selectById(Integer id) {
        User user = userDao.getUser(id);
        return user;
    }
}
