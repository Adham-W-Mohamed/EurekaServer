package CS544.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Cs544EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cs544EurekaServerApplication.class, args);
	}

}
