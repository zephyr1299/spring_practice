import static org.mockito.Mockito.*;
import java.io.PrintStream;
import java.io.OutputStream;
import org.junit.Test;
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();

    }
}
