package com.mace.exception;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 17:27
 */
public class MyException extends RuntimeException {

    public MyException() {
        super("用户不存在");
    }

}
