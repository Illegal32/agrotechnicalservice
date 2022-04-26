package az.iktlab.agrotechnicalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AgrotechnicalserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgrotechnicalserviceApplication.class, args);
    }

}
