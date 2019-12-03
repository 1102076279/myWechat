package com.example.demo.entity;


/**
 * @author liwenjie
 * @Description:
 * @date: Create in 2019/12/2 16:26
 * @Modified By:
 */

public class TblUserInf{
    private long id;
    private String name;
    private String password;
    private String createTime;
    private String updateTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
