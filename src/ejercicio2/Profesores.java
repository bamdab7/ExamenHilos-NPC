package ejercicio2;

import java.util.Random;

public class Profesores implements Runnable{
    Examen examen;

    public Profesores(Examen examen) {
        this.examen = examen;
    }
    //SE SIMULAN QUE SE CORRIGEN 50 EXAMENES POR 3 PROFESORES
    @Override
    public void run() {
        int random = (int)(Math.random()* 3 + 1);
        for (int i= 0; i<50; i++){
            try{
                corregirExamen(random);
                //CONTROLA QUE LOS EXAMENES SE CORRIJAN
                if(examen.getCantidadExamen()<0){
                    System.out.println("Se corrigieron todos los examenes");
                }
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    private synchronized void corregirExamen(int examenCorregido){
        if(examen.getCantidadExamen()>= examenCorregido){
            System.out.println("El profesor que corrige el examen es : " +Thread.currentThread().getName());
            examen.corregirExamen(examenCorregido);
            System.out.println("Examen corregido, quedan "+ examen.getCantidadExamen());
        }
    }

}
