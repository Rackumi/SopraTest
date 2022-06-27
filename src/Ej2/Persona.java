package Ej2;

public class Persona {

    private boolean sexo; //true masculino, false femenino
    private int edad;

    public Persona(boolean sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public boolean isMasculino() {
        return sexo;
    }

    public boolean isFemenino() {
        return !sexo;
    }

    public void setMasculino() {
        this.sexo = true;
    }

    public void setFemenino() {
        this.sexo = false;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        if(isMasculino()){
            return ("Masculino " + getEdad());
        }
        else{
            return ("Femenino " + getEdad());
        }
    }

}