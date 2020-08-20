package com.southwind.feign;

import com.southwind.entity.Student;
import com.southwind.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider" ,fallback = FeignError.class) //声明式的接口 告诉该接口的实现就是访问名字是provider的微服务
public interface FeignProviderClient {
    @GetMapping("/student/findAll") //访问的是微服务里面相应的请求
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}