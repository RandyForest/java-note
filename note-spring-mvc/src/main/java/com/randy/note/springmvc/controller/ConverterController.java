package com.randy.note.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * Author: randy
 * Date: 2019/12/22 13:24
 */
@Controller
@RequestMapping(path = "/converter")
public class ConverterController {

    /**
     * 日期转换
     * 如果不配置 StringToDateConverter 到 ConversionServiceFactoryBean
     * 则默认只能识别 yyyy/MM/dd 格式的日期
     * 在 StringToDateConverter 可以定制识别指定格式的日期
     *
     * @param date 日期
     * @return 视图
     */
    @RequestMapping(path = "/date")
    public String date(@RequestParam Date date){
        System.out.println(date);
        return "/";
    }
}
