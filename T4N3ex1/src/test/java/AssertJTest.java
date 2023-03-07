import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AssertJTest {
    //ex1
    //Una asserció que demostri que el valor de dos objectes sencers és igual,
    // i una altra que indiqui que no ho és.
    @Test
    public void numEqual() {
        int num1 = 5;
        int num2 = 5;
        assertThat(num1).isEqualTo(num2);
        System.out.println("Test 1 equal");
    }

    @Test
    public void numNoEqual() {
        int num1 = 5;
        int num2 = 7;
        assertThat(num1).isNotEqualTo(num2);
        System.out.println("Test 1 No equal");
    }

    //ex2
    //Una asserció que demostri que la referència a un objecte és la
    //mateixa que una altra, i una altra que indiqui que és diferent.
    @Test
    public void sameOject() {
        Object ob1 = new Object();
        Object ob2 = ob1;
        assertThat(ob1).isSameAs(ob2);
        System.out.println("Object 1 is same than object 2");
    }

    @Test
    public void differentOject() {
        Object ob1 = new Object();
        Object ob2 = new Object();
        assertThat(ob1).isNotSameAs(ob2);
        System.out.println("Object 1 is different than object 2");
    }

    //ex3
    //Una asserció que indiqui que dos arrays d'enters són idèntics.
    @Test
    public void equalArrays() {
        int[] array1 = {10, 20, 30, 40,50};
        int[] array2 = {10, 20, 30, 40,50};
        assertThat(array1).isEqualTo(array2);
        System.out.println("2 arrays are equals");
    }
    //ex4
    //Crea un arrayList contenidor de diversos tipus d'objectes (crea'ls també).
    // Escriu una asserció per a verificar l'ordre dels objectes en
    //l'ArrayList segons han estat inserits.
    @Test
    public void arrayListContainer() {
        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add(0,"cotxe");
        list1.add(1,66);
        list1.add(2,'A');
        list1.add(3,"moto");
        list1.add(4,true);
        assertThat(list1).containsExactly("cotxe",66,'A',"moto",true);
        System.out.println("Contains in same order of insertion");
    // Ara verifica que la llista anterior conté els objectes en qualsevol ordre.
        assertThat(list1).contains(true,66,'A',"moto","cotxe");
        System.out.println("Contains all objects in any order");
    //Verifica que, en la llista anterior, un dels objectes s'ha afegit només una vegada.
        // Deixa un dels elements sense afegir, i verifica que la llista no conté aquest últim.
        ArrayList<Object> list2 = new ArrayList<Object>();
        list2.add(0,"cotxe");
        list2.add(1,66);
        list2.add(2,'A');
        list2.add(3,"moto");
        list2.add(4,"cotxe");

        assertThat(list2).containsOnlyOnce("moto");
        System.out.println("Contains only one moto");

        assertThat(list2).doesNotContain("ship");
        System.out.println("Not contains a ship");
    }
    //- Exercici 5
    //Crea un map i verifica que conté una de les key que li afegeix.
@Test
    public void mapTest(){
        HashMap<String, Integer> ciutats = new HashMap<String,Integer>();
        ciutats.put("Madrid",1);
        ciutats.put("Barcelona",2);
        ciutats.put("Valencia",3);
        ciutats.put("Sevilla",4);
        ciutats.put("Bilbao",5);
        assertThat(ciutats).containsKey("Barcelona") ;
        System.out.println("Verified contains Barcelona");
    }

//    Provoca una ArrayIndexOutOfBoundsException en una classe qualsevol.
//    Crea una asserció que validi que l'excepció és llançada quan correspon.
@Test
public void testOutOfBoundsExc() {
    String[] arr1 = {"cotxe", "moto", "patinet", "bici","vaixell"};
    //llancem amb assertThatThrownBy
assertThatThrownBy(() -> {
    String s = arr1[5];
}).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    System.out.println("Exception ArrayIndexOutOfBoundsException ");

}

//Crea un objecte Optional buit.
// Escriu l'asserció correcta per a verificar que efectivament està buit.
@Test
public void testObjectEmpty() {
    Optional<String> op1 = Optional.empty();
    assertThat(op1).isEmpty();
    System.out.println("Object is empty");
}

}