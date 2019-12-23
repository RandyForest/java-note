package com.randy.note.base.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Author: randy
 * Date: 2019/12/21 19:46
 */
public class DateFormatNote {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        String format = DateFormat.getInstance().format(date);
        System.out.println(format);

        Date parse = DateFormat.getInstance().parse(format);
        System.out.println(parse);
    }
}
