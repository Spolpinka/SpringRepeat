import model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Archibald", new Car("Hyundai"));
    }

    @Bean(name = "driverOfBus")
    public Driver getDriverOfBus() {
        return new Driver("John", new Bus("Volvo"));
    }

    @Bean(name = "driverOfPickup")
    public Driver getDriverOfPickup() {
        return new Driver("Jane", new Pickup("Ford"));
    }
}
