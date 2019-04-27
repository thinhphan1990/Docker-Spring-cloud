package com.thinh.restfull.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldContronler {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public String HelloWorld(){
        return "hello-World";
    }


    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean ("hello-World");
    }
    @RequestMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-internationalize")
    public String HelloWorldInternationalize(){

        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }



}
