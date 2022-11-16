package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    //  TODO el usuario mete 5 mumeros (1,9) de tipo int
    //  TODO 1.CALCULAR SUMA DEL NUMERO INDICANDO SI ES PAR O IMPAR (done)
    //  TODO 2. EL NUMERO MAYOR IPRESO EL MISMO NUMERO DE VECES QUE SEA (done)
    //  TODO 3. CUENTA ATRAS DE LA SUMA DE TODOS LOS NUMEROS Y DESPEGUE
    static ArrayList<Integer> listaNumeros = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        System.out.println("Introduce 5 numeros");
        while (i <=5){
            Scanner sc = new Scanner(System.in);
            int numero = sc.nextInt();
            listaNumeros.add(numero);
            i++;
        }
       //mostrar listado numeros para comprobar si funciona
        for(int x = 0; x<listaNumeros.size(); x++){
            System.out.println(listaNumeros.get(x));
        }
        //INCIALIZANDO LOS HILOS
        SumaParImpar sm = new SumaParImpar();
        new Thread(sm).start();
        NumeroImpreso ni = new NumeroImpreso();
        new Thread(ni).start();
        CuentaAtras ca = new CuentaAtras();
        new Thread(ca).start();
    }

}
