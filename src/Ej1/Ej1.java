package Ej1;

import java.util.Scanner;

public class Ej1 {

    public static int leerNumero(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void main(String[] args){

        int numero;
        System.out.print("Introduzca un numero: ");
        numero = leerNumero();

        if(numero % 2 == 0){ //par
            for(int i = numero; i>=0; i=i-2){
                System.out.print(i+" ");
            }
        }
        else{ //impar
            for(int i = numero; i>=1; i=i-2){
                System.out.print(i+" ");
            }
        }
    }

}