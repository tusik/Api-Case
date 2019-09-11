package cx.by.ApiCase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("cx.by.ApiCase")
public class ApiCaseApplication {
	@Bean
	public String getName(){
		return "sda";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiCaseApplication.class, args);
	}

}
