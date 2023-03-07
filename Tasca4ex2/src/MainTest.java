import org.junit.Test;

import org.junit.Assert;

//Crea una classe jUnit que verifiqui el seu correcte funcionament,
//parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és correcte
// per a 10 números de DNI predefinits.
public class MainTest {

   String caracters="TRWAGMYFPDXBNJZSQVHLCKE";
   int numDni;
   int res;
   char lletra = (caracters.charAt(res));
    public int CalcularNumeroDni(int numDni){
        this.numDni=numDni;
        int res=numDni%23;
        return res;
    }

@Test
    public void testDni(){
    Assert.assertEquals(15,CalcularNumeroDni(36576409));
    Assert.assertEquals(3, CalcularNumeroDni(45678900));
    Assert.assertEquals(7, CalcularNumeroDni(36599999));
    Assert.assertEquals(18, CalcularNumeroDni(11111111));
    Assert.assertEquals(13, CalcularNumeroDni(22222222));
    Assert.assertEquals(8, CalcularNumeroDni(33333333));
    Assert.assertEquals(3, CalcularNumeroDni(44444444));
    Assert.assertEquals(21, CalcularNumeroDni(55555555));
    Assert.assertEquals(16, CalcularNumeroDni(66666666));
    Assert.assertEquals(11, CalcularNumeroDni(77777777));

}

}
