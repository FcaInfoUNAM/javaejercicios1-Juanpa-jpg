package Exercises;

public class Alumno extends Sobrecarga {
    public Alumno(String nombre, String materia, int calificacion) {
        super(nombre, materia, calificacion);
    }

    @Override
    public String reprobar() {
        if (this.calificacion < 6)
            return ":(";
        else
            return ":)";
    }
}
