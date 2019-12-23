package com.randy.note.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: randy
 * Date: 2019/12/17 0:21
 */
public class SuccessController {
    @RequestMapping(path = "/su")
    public String su(){
        System.out.println("su");
        return null;
    }
}
