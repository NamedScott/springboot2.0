package com.example.controller;

import com.example.model.UserInfo;
import com.example.service.UserInfoService;
import com.example.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by scott on 2018/6/17.
 */
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/getAllUsers")
    @ResponseBody
    private List<UserInfo> getAllUsers(){

        return userInfoService.selectAll() ;
    }

    @RequestMapping("/getUserAndAddressById")
    @ResponseBody
    public UserInfoVo getUserAndAddressById(String userId){
        UserInfoVo userInfoVo = userInfoService.getUserAndAddressById(userId);
        return userInfoVo;
    }
}
