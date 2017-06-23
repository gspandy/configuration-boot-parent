package com.janita.controller;

import com.janita.config.PropertiesConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/23 0023-上午 11:45
 * 该类是：
 */
@RestController
@RequestMapping("test")
public class StaticController {

    @GetMapping
    public String test() {
        return PropertiesConfig.PRO_ONE;
    }
}
