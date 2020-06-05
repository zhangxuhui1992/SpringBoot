package com.controller;

import com.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhangxuhui
 * @email zxh_1633@163.com
 * @create 2020-06-01 11:12
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    PageService pageService;

}
