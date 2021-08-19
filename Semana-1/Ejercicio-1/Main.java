import java.util.Scanner;

public class Main{

    public static void main( String [] args ){
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite una oracion: ");
        String oracion = input.nextLine();
        String oracionInvertida = "";

        for(int i = oracion.length()-1; i >= 0; i--){
            
            char car = oracion.charAt(i);
            oracionInvertida = oracionInvertida + car;

        }

        System.out.println("Case #?: " + oracionInvertida);

    }

}