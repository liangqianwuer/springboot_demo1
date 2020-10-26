package com.example.dao;

import com.example.bean.User;
import org.jboss.logging.Param;

/**
 * @author zfc
 * @Package com.example.dao
 * @date 2020/10/26 16:28
 */
public interface UserDao {
    public User getUser(@Param Integer id);

    public int addUser(@Param User user);

}
