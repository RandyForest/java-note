package com.randy.note.spring.cglib;

/**
 * 用户切面类
 *
 * Author: randy
 * Date: 2019/10/10 13:24
 */
class UserAspect {
   void check(){
       System.out.println("检查权限");
   }

   void log(){
       System.out.println("记录日志");
   }
}
