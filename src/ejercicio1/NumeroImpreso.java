package ejercicio1;

import java.util.Collection;
import java.util.Collections;

import static ejercicio1.Principal.listaNumeros;

public class NumeroImpreso implements Runnable{
    //BUSCAR EL VALOR MAXIMO DE LA LISTA E IMPRIRLO TANTAS VECES COMO NUMERO SEA
    int max = listaNumeros.get(0);
    @Override
    public void run() {
        for( int i =0; i<listaNumeros.size(); i++){
            if(listaNumeros.get(i) > max){
                max = listaNumeros.get(i);
            }
        }
        System.out.println("El numero maximo es = " + max);
        //  IMPRIME TANTAS VECES COMO NUMERO SEA
        for (int i = 0; i< max; i++){
            System.out.println(max);
        }
    }
}
