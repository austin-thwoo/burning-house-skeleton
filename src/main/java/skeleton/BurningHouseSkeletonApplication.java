package skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class BurningHouseSkeletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BurningHouseSkeletonApplication.class, args);
    }

}
