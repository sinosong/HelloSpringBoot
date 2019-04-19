package com.hns.learn.exception;

/**
 * @author hannasong
 * 检查输入的参数；
 */
public class InputParamsException extends Exception {

    //无参构造方法
    public InputParamsException() {

        super();
    }

    //有参的构造方法
    public InputParamsException(String message) {

        super(message);

    }

    // 用指定的详细信息和原因构造一个新的异常
    public InputParamsException(String message, Throwable cause) {

        super(message, cause);
    }

    //用指定原因构造一个新的异常
    public InputParamsException(Throwable cause) {

        super(cause);
    }


}
