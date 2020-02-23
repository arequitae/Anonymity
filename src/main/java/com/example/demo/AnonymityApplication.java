package com.example.demo;

import com.example.demo.Socket.socket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;


class MyThread extends Thread   {
	public void run()   {
			socket.start();
	}
}
@SpringBootApplication
public class AnonymityApplication {

	public static void main(String[] args) {
		//MyThread myThread=new MyThread();
	//	myThread.start();
		SpringApplication.run(AnonymityApplication.class, args);
	}

}
