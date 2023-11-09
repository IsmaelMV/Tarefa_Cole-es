package br.com.rpires;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ismael Alves
 */

public class ListaNome {

    public static void main(String args []) {
        exemploListasOrdemAscedente();

    }
    private static void exemploListasOrdemAscedente() {

        System.out.println("ExemploListaSimplesOrdemAscedente");
        List<String> lista = new ArrayList<String>();
        lista.add("Ismael Alves");
        lista.add("Camila da Rocha");
        lista.add("Yasmim Almeida");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
