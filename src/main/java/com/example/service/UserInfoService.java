package com.example.service;


import com.example.model.UserInfo;
import com.example.vo.UserInfoVo;

import java.util.List;

/**
 * Created by scott on 2018/6/17.
 */
public interface UserInfoService {

    public List<UserInfo> selectAll();

    UserInfoVo getUserAndAddressById(String userId);
}
