package com.thinh.restfull;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;


@SpringBootApplication
public class RestfullApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfullApplication.class, args);
    }

   // public LocaleResolver localeResolver()
   // {
        //SessionLocaleResolver localeResolver = new SessionLocaleResolver()
   // }
    @Bean
    public LocaleResolver localeResolver()
    {
        AcceptHeaderLocaleResolver localeResolver =new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver ;
    }
    @Bean
    MessageSource messageSource(){
        ResourceBundleMessageSource messageSource =new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;

    }

}
