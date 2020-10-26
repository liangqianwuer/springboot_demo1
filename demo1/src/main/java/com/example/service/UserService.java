package com.example.service;

import com.example.bean.User;

/**
 * @author zfc
 * @Package com.example.service
 * @date 2020/10/26 16:52
 */
public interface UserService {
    User selectById(Integer id);
}
