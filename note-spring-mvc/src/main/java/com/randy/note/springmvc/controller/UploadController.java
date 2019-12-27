package com.randy.note.springmvc.controller;

import com.randy.note.springmvc.utils.FileNameUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Author: randy
 * Date: 2019/12/25 22:10
 */
@Controller
@RequestMapping("/upload")
public class UploadController {
    /**
     * 文件上传
     *
     * @param multipartFile
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/file")
    public String upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        String filename = multipartFile.getOriginalFilename();
        filename = filename != null ? filename : "file";
        filename = FileNameUtil.addTimestamp(filename);
        String filePath = request.getServletContext().getRealPath("file/" + filename);
        multipartFile.transferTo(new File(filePath));

        return "redirect:/";
    }

    /**
     * 多文件上传
     *
     * @param multipartFiles
     * @param request
     * @return
     * @throws IOException
     */
    @RequestMapping("/files")
    public String uploadMulti(@RequestParam("files") MultipartFile[] multipartFiles, HttpServletRequest request) throws IOException {
        for (MultipartFile multipartFile : multipartFiles) {
            String filename = multipartFile.getOriginalFilename();
            filename = filename != null ? filename : "file";
            filename = FileNameUtil.addTimestamp(filename);
            String filePath = request.getServletContext().getRealPath("file/" + filename);
            multipartFile.transferTo(new File(filePath));
        }

        return "redirect:/";
    }
}
