package ejercicio1;

import static ejercicio1.Principal.listaNumeros;

public class SumaParImpar implements Runnable{
        static int suma = 0;
        public void sumar(){
            //SUMAR VALORES DEL ARRAY Y DETERMINAR SI EL RESULTADO ES PAR O IMPAR
            for (int i =0; i<listaNumeros.size(); i++){
                int valor = 0;
                valor = listaNumeros.get(i);
                suma += valor;
            }
        }
    @Override
    public void run() {
        sumar();
        System.out.println("Suma de los numeros introducidos es :  " +suma);
        //COMPROBAR SI EL RESULTADO ES PAR O IMPAR
        if(suma % 2 == 0){
            System.out.println("La suma de nos numeros introducidos es par :  " + suma);
        }else{
            System.out.println("La suma de los numeros introducidos es impar: : " +suma);
        }
    }
}
