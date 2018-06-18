package com.example.vo;

import com.example.model.UserAddress;

import java.util.Date;

public class UserInfoVo {

    private UserAddress userAddress;

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_password
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_mobile
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String userMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_job
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String userJob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_description
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String userDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.valid_status
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private Integer validStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_time
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.modify_time
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.create_operator
     *
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    private String createOperator;


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_password
     *
     * @return the value of user_info.user_password
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_password
     *
     * @param userPassword the value for user_info.user_password
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_mobile
     *
     * @return the value of user_info.user_mobile
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_mobile
     *
     * @param userMobile the value for user_info.user_mobile
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_job
     *
     * @return the value of user_info.user_job
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getUserJob() {
        return userJob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_job
     *
     * @param userJob the value for user_info.user_job
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setUserJob(String userJob) {
        this.userJob = userJob == null ? null : userJob.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_description
     *
     * @return the value of user_info.user_description
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_description
     *
     * @param userDescription the value for user_info.user_description
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.valid_status
     *
     * @return the value of user_info.valid_status
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public Integer getValidStatus() {
        return validStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.valid_status
     *
     * @param validStatus the value for user_info.valid_status
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_time
     *
     * @return the value of user_info.create_time
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_time
     *
     * @param createTime the value for user_info.create_time
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.modify_time
     *
     * @return the value of user_info.modify_time
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.modify_time
     *
     * @param modifyTime the value for user_info.modify_time
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.create_operator
     *
     * @return the value of user_info.create_operator
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public String getCreateOperator() {
        return createOperator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.create_operator
     *
     * @param createOperator the value for user_info.create_operator
     * @mbggenerated Mon Jun 18 12:38:37 CST 2018
     */
    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }
}