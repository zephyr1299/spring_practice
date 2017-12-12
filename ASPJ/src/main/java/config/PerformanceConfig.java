package concert;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class PerformanceConfig {
    /**
    @Bean
    public Performance newYearPerformance() {
        return new NewYearPerformance();
    }
    **/
}
