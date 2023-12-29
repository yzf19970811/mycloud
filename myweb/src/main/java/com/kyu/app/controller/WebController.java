package com.kyu.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kyu.yzf
 * @date 2023/12/29 22:55
 */
@Controller
@RequestMapping(value = "/v1/api/base")
public class WebController {

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public String query() {
        return "query success!!!!!!";
    }
}
