package com.example.service.impl;


import com.example.common.constant.Constant;
import com.example.dao.UserInfoMapper;
import com.example.model.UserInfo;
import com.example.model.example.UserInfoExample;
import com.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by scott on 2018/6/17.
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectAll() {
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andValidStatusIn(Arrays.asList(Constant.VALID_STATUS_YES));
        return userInfoMapper.selectByExample(example);
    }
}
