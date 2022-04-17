/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseMain;

import ClaseDeServicio.ServicioCadena;
import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        String frase;

        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        //Creo el objeto con esa frase
        Cadena cadena1 = new Cadena();
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());

        mostrarFraseYLongitud(cadena1);
        mostrarVocales(cadena1);
        invertirFrase(cadena1);
        vecesRepetido(cadena1, leer);
        compararLongitudes(cadena1, leer);
        unirFrases(cadena1, leer);
        reemplazar(cadena1, leer);
        contieneLetra(cadena1,leer);
    }

    private static void mostrarFraseYLongitud(Cadena frase) {
        System.out.println("La frase actual es: " + frase.getFrase());
        System.out.println("La longiud de la frase es " + frase.getLongitud());
    }

    private static void mostrarVocales(Cadena cadena1) {
        System.out.println("La frase contiene " + cadena1.mostrarVocales() + " vocales.");
    }

    private static void invertirFrase(Cadena cadena1) {

        cadena1.invertirFrase();
    }

    private static void vecesRepetido(Cadena cadena1, Scanner leer) {
        System.out.println("Ingrese el caracter a buscar dentro de la frase");
        System.out.println("El caracter ingresado se encuentra " + cadena1.vecesRepetido(leer.nextLine().substring(0, 1)) + " veces.");

    }

    private static void compararLongitudes(Cadena cadena1, Scanner leer) {
        System.out.println("Ingrese la frase para comparar la longitud con " + cadena1.getFrase() + ".");
        if (cadena1.compararLongitud(leer.nextLine())) {
            System.out.println("Las cadenas tienen la misma cantidad de caracteres");
        } else {
            System.out.println("No tienen la misma cantidad de caracteres.");
        }
    }

    private static void unirFrases(Cadena cadena1, Scanner leer) {
        System.out.println("Unir frases");
        System.out.println("Ingrese la frase que quiere concatenar a " + cadena1.getFrase());
        cadena1.unirFrases(leer.nextLine());

    }

    private static void reemplazar(Cadena cadena1, Scanner leer) {
        System.out.println("Ingrese el caracter que desea que reemplace a la letra ''a''");
        cadena1.reemplazar(leer.nextLine().substring(0, 1));

    }

    private static void contieneLetra(Cadena cadena1, Scanner leer) {
        System.out.println("Ingrese la letra que desea buscar en la frase...");
        if (cadena1.contiene(leer.nextLine().substring(0, 1))){
            System.out.println("La frase si contiene el caracter ingresado.");
        }else{
            System.out.println("La frase no contiene el caracter ingresado.");
    }
    }
}
