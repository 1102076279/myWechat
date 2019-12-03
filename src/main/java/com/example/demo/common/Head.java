package com.example.demo.common;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Head {
    private String version;
    private int statusCode;
    private String statusMsg;
    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Head() {
        this.setStatusMsg(Status.SUCCESS.getMsg());
        this.setStatusCode(Status.SUCCESS.getCode());
        this.setVersion("1.0");
        this.setTimestamp(String.valueOf(System.currentTimeMillis()));
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }


    public void seteStatus(Status status) {
        this.setStatusMsg(status.getMsg());
        this.setStatusCode(status.getCode());
    }

}
