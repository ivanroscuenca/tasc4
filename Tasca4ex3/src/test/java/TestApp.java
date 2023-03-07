import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {

    //Creem metode de test per excepcions
    @Test
    public void testArraySurt() {
        //Assertions.assertThrows() és un metode per excepcions, llancem un metode anonim i porta al metode principal de APP
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            System.out.println("Ha sortit ArrayIndexOutOfBoundsException");
            App.metodeArraySurt();
        });
    }
}
