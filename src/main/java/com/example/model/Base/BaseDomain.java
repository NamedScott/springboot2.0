package com.example.model.Base;

import java.util.Date;

/**
 * Created by scott on 2018/6/18.
 */
public class BaseDomain {

    protected Date createTime;

    protected Date modifyTime;

    protected String createOperator;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator;
    }
}
