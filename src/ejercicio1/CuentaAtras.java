package ejercicio1;

public class CuentaAtras implements Runnable{
    //CUENTA ATRAS DE LA SUMA DE NUMEROS  Y CUANDO LLEGUE 0 DESPEGUE
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("La suma es" + SumaParImpar.suma);
        int numeroSuma = SumaParImpar.suma;
        //BUCLE DECRECIENTE
        int i =1;
       while(i <= numeroSuma){
           System.out.println(numeroSuma);
           numeroSuma--;
           if(numeroSuma == 0){
               System.out.println("DESPEGUE");
           }
       }
    }
}
