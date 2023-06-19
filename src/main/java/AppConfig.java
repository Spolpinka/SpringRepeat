import model.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    public Transport getCar() {
        return new Car("Hyundai");
    }

    @Bean
    public Transport getBus() {
        return new Bus("Volvo");
    }

    @Bean
    public Transport getPickup() {
        return new Pickup("Ford");
    }

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Archibald", getCar());
    }

    @Bean(name = "driverOfBus")
    public Driver getDriverOfBus() {
        return new Driver("John", getBus());
    }

    @Bean(name = "driverOfPickup")
    public Driver getDriverOfPickup() {
        return new Driver("Jane", getPickup());
    }
}
