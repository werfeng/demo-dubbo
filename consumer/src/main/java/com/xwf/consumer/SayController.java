package com.xwf.consumer;


import com.alibaba.dubbo.config.annotation.Reference;
import com.xwf.api.SayService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayController {

    @Reference
    private SayService sayService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String xwf="aaa";
        return sayService.say(xwf);
//        return xwf;
    }
}
