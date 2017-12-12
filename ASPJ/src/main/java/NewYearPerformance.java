package concert;
import org.springframework.stereotype.Component;
@Component
public class NewYearPerformance implements Performance{
    public void perform(){
        System.out.println("New Year performance~~~");
    }
}
