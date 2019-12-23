package com.randy.note.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串格式化成日期对象
 * <p>
 * Author: randy
 * Date: 2019/12/21 19:21
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     * @param source 日期字符串
     * @return 日期
     */
    @Override
    public Date convert(String source) {
        System.out.println("StringToDateConverter.convert("+source+")");

        Date date=null;

        if (source.matches("\\d+-\\d+-\\d+")) {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                date= dateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return date;
    }
}
