package com.xiaomi.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaomi
 */
@RestController
public class HelloController {


   @RequestMapping("/hello")
   public String hello(){
       return "Hello  world";

   }










}
