package com.randy.note.cglib;

/**
 * 用户切面类
 *
 * Author: randy
 * Date: 2019/10/10 13:24
 */
public class UserAspect {
   public void check(){
       System.out.println("检查权限");
   }

   public void log(){
       System.out.println("记录日志");
   }
}
