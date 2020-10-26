package com.example.controller;

import com.example.bean.User;
import com.example.config.Currency;
import com.example.service.UserService;
import com.example.vo.AjaxResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zfc
 * @Package com.example.controller
 * @date 2020/10/26 16:51
 */
@Controller("/*")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public AjaxResultVO getUser(Integer id){
        User user = userService.selectById(id);
        return new AjaxResultVO(Currency.SUCCESS,Currency.SUCCESS_msg,user);

    }
}
