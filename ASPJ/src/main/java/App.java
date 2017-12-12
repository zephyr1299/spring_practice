package concert;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@ContextConfiguration(classes=PerformanceConfig.class)
@Component
public class App {

    @Autowired
    Performance nyp;  
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(concert.PerformanceConfig.class);
        App app = context.getBean(App.class);
        app.start();
    }

    public void start() {
        nyp.perform();
    }
}
