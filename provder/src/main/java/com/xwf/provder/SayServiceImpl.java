package com.xwf.provder;

import com.alibaba.dubbo.config.annotation.Service;
import com.xwf.api.SayService;
//import org.springframework.stereotype.Service;

@Service
public class SayServiceImpl implements SayService {
    @Override
    public String say(String name) {
        return name+"666";
    }
}
