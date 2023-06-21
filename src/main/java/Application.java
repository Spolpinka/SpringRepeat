import model.Driver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver = context.getBean("driver", Driver.class);
        System.out.println(driver);

        Driver driverOfBus =  context.getBean("driverOfBus", Driver.class);
        System.out.println(driverOfBus);

        Driver driverOfPickup =  context.getBean("driverOfPickup", Driver.class);
        System.out.println(driverOfPickup);
    }
}
