import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com.blazcar.order.*")
@EnableMongoRepositories
public class OrderDriver {

  public static void main(String args[]) {
    SpringApplication.run(OrderDriver.class, args);
  }
}
