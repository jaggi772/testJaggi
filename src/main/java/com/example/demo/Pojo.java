package com.example.demo;

import org.springframework.aop.target.PrototypeTargetSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope("prototype")
public class Pojo {

}
