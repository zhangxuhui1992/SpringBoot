package com.mace.exception;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-10 19:38
 */
@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> map = super.getErrorAttributes(webRequest, options);
        map.put("company", "ybjt");
        Map<String, Object> ect = (Map<String,Object>)webRequest.getAttribute("ect", 0);
        map.put("ect", ect);
        return map;
    }
}
