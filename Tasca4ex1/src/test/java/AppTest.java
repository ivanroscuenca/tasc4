import org.example.App;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

//Verifica amb jUnit que la llista té 12 posicions,
//que no és nul·la i que en la seva posició 8 conté el nom 'agost'.

public class AppTest {
    @Test
    public void testmida(){
        Assertions.assertEquals(12, App.metodeMesos().size());
    }
    @Test
    public void testNoNul(){
        Assertions.assertNotNull(App.metodeMesos().size());
    }
    @Test
    public void testAgost(){
        int agostNum =App.metodeMesos().indexOf("Agost");
        Assertions.assertEquals(7,agostNum);
    }




}
