package Ej3;

import java.util.Scanner;

public class Ej3 {

    public static int leerHorasTrabajadas(){
        System.out.print("Introduzca el numero de horas trabajadas: ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static int leerTarifa(){
        System.out.print("Introduzca la tarifa: ");
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    public static void main(String[] args){
        int horasTrabajadas = leerHorasTrabajadas();
        int tarifa = leerTarifa();
        double sueldo;

        if(horasTrabajadas > 40){
            double sueldoExtra = (horasTrabajadas - 40) * (tarifa+(tarifa*0.5));
            sueldo = (40 * tarifa) + sueldoExtra;
        }
        else{
            sueldo = horasTrabajadas * tarifa;
        }
        System.out.println("El salario del trabajador es: "+sueldo);

    }

}