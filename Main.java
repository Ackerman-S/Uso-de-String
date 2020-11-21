package com.company;


import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        Scanner rd= new Scanner(System.in);
        System.out.println("INGRSE UN TEXTO CUALQUIERA:");
        String texto =rd.nextLine();
        System.out.println("INTRODUSCA EL CARACTER QUE DESEA BUSCAR EN EL TEXTO INGRESADO: ");
        char car = rd.next().charAt(0);
        System.out.println(" EL NUMERO DE CARACTER '"+car+"'ENCONTADOS EN EL TEXTO INGRESADO ES:"+buscar(texto,car));


    }

    private static int buscar(String txt, char crc) {
        char[]cadenacar=txt.toCharArray();
        int cont=0;
        for(char c: cadenacar){
            if(c==crc){
              cont += 1;

            }

        }
        return cont;
    }

}
