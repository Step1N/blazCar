import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.blazcar.shopper.*")
@EnableMongoRepositories
public class ShipDriver {

  public static void main(String args[]) {
    SpringApplication.run(ShipDriver.class, args);
  }
}
