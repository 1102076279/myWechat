package com.example.demo.common;

public class State {
    //T_USER_MESSAGE.status
    public static final int DELETED_MESSAGE = 1;//删除状态
    public static final int READED_MESSAGE = 2;//已读状态
    public static final int UNREADED_MESSAGE = 3;//未读状态

    //T_USER_MESSAGE.status 有关
    public static final int AGREE_MESSAGE = 4;//同意该消息
    public static final int REFUSE_MESSAGE = 5;//拒绝该消息
    public static final int INVALIDITY_MESSAGE = 6;//无效消息
    //T_WORKFLOW.status 有关
    public static final int DELETED_APPROVAL = 1;//删除审批
    public static final int COMPLETED_APPROVAL = 2;//完成审批
    public static final int UNCOMPLETED_APPROVAL = 3;//未完成审批
    public static final int REFUSE_APPROVAL = 4;//拒绝成审批
    //T_WORKFLOW.status 有关
    public static final int AVAILABLE_STATISTICS = 1;//正常统计
    public static final int UNAVAILABLE_STATISTICS = 2;//作废统计
}
