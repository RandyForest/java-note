package com.randy.note.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Author: randy
 * Date: 2019/12/22 16:17
 */
@Controller
@RequestMapping("/response")
public class ResponseController {
    @RequestMapping("/map")
    public void map(@RequestBody Map<String, String> map){
        System.out.println("ResponseController.map()");

        map.forEach((s, s2) -> {
            System.out.println(s+": "+s2);
        });

        map.put("name", "aaaa");
    }
}
