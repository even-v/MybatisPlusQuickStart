package cn.youchisoft.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.youchisoft.mybatisplus.mapper")
public class App {
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
