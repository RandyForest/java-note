package com.randy.note.springmvc.controller;

import com.randy.note.springmvc.model.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.Date;
import java.util.Map;

/**
 * Author: randy
 * Date: 2019/12/22 16:17
 */
@Controller
@RequestMapping("/response")
public class ResponseController {
    /**
     * 返回响应体
     *
     * @return 响应体
     */
    @ResponseBody
    @RequestMapping("/body")
    public String body(){
        return "<h1>Body</h1>";
    }

    /**
     * 返回对象
     * 自动转换成JSON
     *
     * @return 用户
     */
    @ResponseBody
    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setUsername("aaa");
        user.setDate(new Date());
        return user;
    }

    /**
     * 返回响应实体
     * 包含响应头，响应体，状态码
     *
     * @return 相应实体
     */
    @RequestMapping("/entity")
    public ResponseEntity<String> entity(){
        String body = "<h1>Body</h1>";

        MultiValueMap<String, String> header = new HttpHeaders();
        header.add("Set-Cookie","name=qqq");

        return new ResponseEntity<String>(body,header, HttpStatus.OK);
    }

    /**
     * 返回文件
     *
     * @return 文件
     */
    @RequestMapping("/down")
    public ResponseEntity<byte[]> down(HttpServletRequest request) throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(request.getServletContext().getRealPath("file/file.html")));
        byte[] file = inputStream.readAllBytes();
        inputStream.close();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Disposition","attachment;filename=file.txt");

        return new ResponseEntity<>(file, headers, HttpStatus.OK);
    }
}
