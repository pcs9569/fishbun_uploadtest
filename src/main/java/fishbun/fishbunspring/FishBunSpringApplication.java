package fishbun.fishbunspring;

import fishbun.fishbunspring.property.FileUploadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileUploadProperties.class
})

public class FishBunSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FishBunSpringApplication.class, args);
	}

}
