package com.example.demo;

import com.example.demo.Socket.socket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;


class MyThread extends Thread   {
	public void run()   {
			socket.start();
	}
}
@SpringBootApplication
public class AnonymityApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		//MyThread myThread=new MyThread();
	//	myThread.start();
		SpringApplication.run(AnonymityApplication.class, args);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}

}



