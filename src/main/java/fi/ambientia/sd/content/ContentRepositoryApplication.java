package fi.ambientia.sd.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ContentRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentRepositoryApplication.class, args);
	}

}
