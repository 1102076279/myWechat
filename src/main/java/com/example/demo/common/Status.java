package com.example.demo.common;


public enum Status {


    SUCCESS(0, "操作成功"),
    BadRequestParameters(-2, "请求参数错误"),
    Unauthorized(-3, "未授权的访问"),
    ServerError(-13, "服务异常"),
    OtherError(-100, "未知错误"),

    BusinessError(300, "业务异常"),
    UserAuthenticateFailer(301, "用户认证失败"),

    DateFormatError(302, "日期转换错误"),
    UserLoginError(303, "用户名或密码错误"),
    PasswordReset(304, "请重置密码"),
    PasswordError(305, "与原密码不符合"),
    RightError(306, "没有权限"),
    NoUser(307, "用户不存在"),
    IllegalStatus(308, "不合法的操作"),
    RepeatOpt(309, "重复操作"),
    NO_VERIFIER(310, "缺少审批人"),
    SMS_CODE_TIME_OUT(311, "验证码过期"),
    SMS_CODE_ERROR(312, "验证码错误"),


    DataOptFailed(400, "数据库操作异常"),
    InsertDataFailed(401, "插入数据失败"),
    UpdateDataFailed(402, "更新数据失败"),
    SelectDataFailed(403, "查询数据失败"),
    DeleteDataFailed(404, "删除数据失败"),

    EXTERNAL_CALL_EXCEPTION(500, "外部接口异常"),
    SEND_SMS_FAILED(501, "短信发送失败");


    private int code;
    private String msg;

    private Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
