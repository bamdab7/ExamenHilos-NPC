package ejercicio2;

public class Examen{
    private int cantidadExamen;
    private String nombreExamen;

    public Examen(int cantidadExamen, String nombreExamen) {
        this.cantidadExamen = cantidadExamen;
        this.nombreExamen = nombreExamen;
    }

    public int getCantidadExamen() {
        return cantidadExamen;
    }
    public String getNombreExamen() {
        return nombreExamen;
    }

    //  METODO QUE CORRIGE LOS EXAMENS, VA RESTANDO LOS VALORES DE LOS EXAMENES
    public void corregirExamen(int examenCorregido){
        cantidadExamen -= examenCorregido;
    }
}
