package com.example.demo.contoller;

import com.example.demo.bean.RestResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

   @ResponseBody
   @RequestMapping(value="/a", method = RequestMethod.GET)
   public RestResult<String> hello() {
        RestResult<String> restResult = new RestResult<String>();
        restResult.setData("hello a");
       return restResult;
   }

   @RequestMapping("/b")
    public String test() {
        return "b";
    }

    @ResponseBody
    @RequestMapping("/b")
    public String hi(){
        return "b";
    }

    
}
