package cn.iocoder.springboot.labs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.iocoder.springboot.labs.mapper")
public class Application {
}
