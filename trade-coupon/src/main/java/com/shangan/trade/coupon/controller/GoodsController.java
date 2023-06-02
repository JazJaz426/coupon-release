package com.shangan.trade.coupon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {
    @RequestMapping("/coupon/test")
    @ResponseBody
    public String hello() {
        return "Hello world!";
    }
}
