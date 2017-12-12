package concert;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..))")
        public void performance() {}
    /**
    @Before("performance()")
        public void silenceCellPhones() {
            System.out.println("Silencing cell phones");
        }

    @Before("performance()")
        public void takeSeats() {
            System.out.println("Taking seats");
        }

    @AfterReturning("performance()")
        public void applause() {
            Sysetem.out.println("clap calp");
        }

    @AfterThrowing("performance()")
        public void demandRefund() {
            System.out.println(" Demanding a refund");
        }
        **/
    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("clap calp");
        }catch(Throwable e) {
            System.out.println(" Demanding a refund");
        }
    }

}




