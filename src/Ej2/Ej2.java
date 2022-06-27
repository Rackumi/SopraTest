package Ej2;

import java.util.Random;

public class Ej2 {

    public static Persona[] leerPersonas(){
        Persona[] p = new Persona[50];

        for(int i=0; i<50; i++){
            Random rand = new Random();
            Persona pAux = new Persona(rand.nextBoolean(), rand.nextInt(100));
            p[i] = pAux;
        }

        return p;
    }

    public static void main(String[] args){

        Persona[] personas = leerPersonas();

        int pregA = 0;
        int pregB = 0;
        int pregC = 0;
        int pregD = 0;
        int pregE = 0;
        int pregF = 0;

        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                pregA++;
                if (persona.isMasculino()) {
                    pregC++;
                }
            } else {
                pregB++; //pregB = 50 - pregA
                if (persona.isFemenino()) {
                    pregD++;
                }
            }
            pregE = pregA * 100 / 50;
            pregF = (pregD + (pregA - pregC)) * 100 / 50;
        }

        System.out.println("a. Cantidad de personas mayores de edad (18 años o más): "+pregA);
        System.out.println("b. Cantidad de personas menores de edad: "+pregB);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: "+pregC);
        System.out.println("d. Cantidad de personas femeninas menores de edad: "+pregD);
        System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de personas: "+pregE+"%");
        System.out.println("f. Porcentaje que representan las mujeres respecto al total de personas: "+pregF+"%");

    }

}