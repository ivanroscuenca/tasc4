import java.util.Scanner;
//Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número
// com a paràmetre.

public class Main {
    public static void main(String[] args) {
        System.out.println("Introdueix el numero de DNI : ");
        Scanner entrada = new Scanner(System.in);
        int numDni = entrada.nextInt();
        System.out.println("La lletra del DNI es : "+ CalcularDni(numDni));

    }
    static char CalcularDni(int numDni){
        String caracters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res=numDni%23;
        return (caracters.charAt(res));
    }

}

