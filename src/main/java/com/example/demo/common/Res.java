package com.example.demo.common;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * 响应对象
 *
 * @param <T>
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Res<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    //临时
    private Head header;
    private T body;

    public Head getHeader() {
        return header;
    }

    public void setHeader(Head header) {
        this.header = header;
    }


    public Res() {
        this.header = new Head();
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public T getBody() {
        return body;
    }


    public void setBody(T params) {
        this.body = params;
    }

    public void seteStatus(Status status) {
        this.header.seteStatus(status);
    }


}
