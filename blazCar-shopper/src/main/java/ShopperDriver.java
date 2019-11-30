import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.blazcar.shopper.*")
@EnableMongoRepositories
@EnableAutoConfiguration
public class ShopperDriver {
  public static void main(String args[]) {
    SpringApplication.run(ShopperDriver.class, args);

  }
}

