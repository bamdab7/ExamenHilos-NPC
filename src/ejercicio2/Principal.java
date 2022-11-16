package ejercicio2;

public class Principal {
    //TODO 3 PROFESORES CORRIGEN AL MISMO TIEMPO 50 EXAMENES
    // TODO CADA SEGUNDO (1000)  CORRIGE ENTRE 1-3 EXAMES
    // TODO REDUCIR....
    public static void main(String[] args) {
        Examen examen = new Examen(50, "examen");
        Profesores profesor = new Profesores(examen);

        //INSTANCIAMOS LOS HILOS
        Thread profesor1 = new Thread(profesor, "profesor1");
        Thread profesor2 = new Thread(profesor, "profesor2");
        Thread profesor3 = new Thread(profesor, "profesor3");

        profesor1.start();
        profesor2.start();
        profesor3.start();
    }
}
