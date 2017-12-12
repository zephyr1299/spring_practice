import java.io.PrintStream;
import java.io.OutputStream;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String...args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                KnightConfig.class
                );
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
