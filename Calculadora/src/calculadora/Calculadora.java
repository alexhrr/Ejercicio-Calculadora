
package calculadora;

import calculadora.logica;
import java.util.Scanner;

public class Calculadora{

    
    public static void main(String[] args) {
    
        logica c =new logica();
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un Numero: ");
        c.setnum1(sc.nextInt());
        System.out.println("Ingrese otro numero: " );
        c.setnum2(sc.nextInt());
        c.sumar();
        System.out.println("La suma es: "+c.getresultado());
        c.restar();
        System.out.println("La resta es: "+c.getresultado());
        c.multiplicar();
        System.out.println("El producto es: "+c.getresultado());
        c.dividir();
        System.out.println("La division es: "+c.getresultado());
    }
    
}
