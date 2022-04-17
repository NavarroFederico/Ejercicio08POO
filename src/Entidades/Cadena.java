/*
 La clase cadena almacena una cadena de texto , puede ser una frase o no. 
Posibilita hacer diferentes acciones con esa frase mediante métodos específicos.
 */
package Entidades;

/**
 *
 *
 * @author Federico Navarro
 */
public class Cadena {

    /**
     * Almacena una frase completa.
     */
    private String frase;
    /**
     * Representa la cantidad de caracteres de la frase.
     */
    private int longitud;

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    /**
     * Contabiliza la cantidad de vocales de la frase.
     *
     * @return cantidad de vocales de la frase
     */
    public int mostrarVocales() {
        int cantVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.toLowerCase().charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                cantVocales++;
            }
        }
        return cantVocales;
    }

    /**
     * Invierte la frase . La imprime por pantalla
     */
    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("Resultado de frase invertida : ' " + fraseInvertida+" '");
    }

    /**
     * Contabiliza cuántas veces se repite el carácter ingresado por el usuario
     * dentro de la frase.
     *
     * @param letra Caracter ingresado por usuario.
     * @return cantidad de veces repetido el caracter.
     */
    public int vecesRepetido(String letra) {
        int cantVecesRepetido = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, (i+1)).equals(letra)) {
                cantVecesRepetido++;
            }
        }
        return cantVecesRepetido;
    }

    /**
     * Compara la longitud de la frase que compone la clase, con una frase
     * ingresada por el usuario.
     *
     * @param frase frase nueva ingresada por el Usuario.
     * @return Si las longitudes son iguales retorna un sonIguales= true, si no
     * lo son retorna un sonIguales =false.
     */
    public boolean compararLongitud(String frase) {
        boolean sonIguales = false;
        if (frase.length() == this.frase.length()) {
            sonIguales = true;
        }
        return sonIguales;
    }

    /**
     * Unir frase contenida en la clase con una nueva frase ingresada por el
     * usuario. Muestra la concatenación de frases en pantalla.
     *
     * @param fraseNueva Frase ingresada por el usuario.
     */
    public void unirFrases(String fraseNueva) {
        String concatenacion = "";
        concatenacion = frase + fraseNueva;

        System.out.println("Union de frases :" + concatenacion);

    }

    /**
     * Remplazam todas las letras "a" contenidas en la frase por un caracter
     * elegido por el usuario. Mostrar frase resultante
     *
     * @param letra
     */
    public void reemplazar(String letra) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, (i+1)).equalsIgnoreCase("a")) {
                resultado += letra;
            } else {
                resultado += frase.substring(i, (i+1));

            }
        }
            System.out.println("Frase reemplaza final: " + resultado);
    }

    /**
     * Busca una letra en la frase
     *
     * @param letra
     * @return Retorna contieneLetra =true si se encuentra la letra dentro de la
     * frase.
     */
    public boolean contiene(String letra) {
        boolean contieneLetra = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, (i+1)).equals(letra)) {
                contieneLetra = true;
            }
        }
        return contieneLetra;
    }
}
