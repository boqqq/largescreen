package io.dfjinxin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.dfjinxin.dao")
public class DfjinxinGerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DfjinxinGerApplication.class, args);
	}
}
