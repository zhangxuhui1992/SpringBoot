package com.mace.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理控制器
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 17:31
 * @ControllerAdvice
 * @ExceptionHandler(MyException.class)
 */
@ControllerAdvice
public class MyExceptionHandler {
    /**
     * 浏览器和客户端都返回json
     * 没有自适应
     * @param e
     * @return
     */
//    @ResponseBody
//    @ExceptionHandler(MyException.class)
//    public Map<String,Object> handleException(Exception e){
//        Map<String,Object> map = new HashMap<>();
//        map.put("status", "2020");
//        map.put("message", "2020-user is not exis");
//        return map;
//    }


    @ExceptionHandler(MyException.class)
    public String handleException(Exception e, HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("status", "2020");
        map.put("message", "2020-user is not exis");
        //请求转发
        request.setAttribute("ect", map);
        return "/error";
    }

}
