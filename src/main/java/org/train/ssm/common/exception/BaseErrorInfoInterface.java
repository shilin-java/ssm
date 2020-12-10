package org.train.ssm.common.exception;

/**
 * Created in       2020/12/9 18:08
 *
 * @Description: []
 * Copyright:      Copyright (c) 2016
 * Department:     研发部
 * @Author: Lin.Shi
 * @version: 1.0
 */
public interface BaseErrorInfoInterface {
    /** 错误码*/
    String getResultCode();

    /** 错误描述*/
    String getResultMsg();
}
