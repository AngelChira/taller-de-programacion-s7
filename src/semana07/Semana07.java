package semana07;

import java.util.Scanner;

public class Semana07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el limite inferior: ");
        byte limiteInferior = teclado.nextByte();
        byte limiteSuperior, numero;
        int suma = 0, count = 0;
        boolean informe = false;
        do {
            System.out.print("Ingrese el limite superior: ");
            limiteSuperior = teclado.nextByte();
            if (limiteInferior >= limiteSuperior){
                System.out.println("Error, el limite superior debe ser mayor que el inferior");
            }
        } while (limiteInferior >= limiteSuperior);
        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = teclado.nextByte();
            if (numero > limiteInferior && numero < limiteSuperior){
                suma = suma + numero;
            }
            if ((numero < limiteInferior || numero > limiteSuperior) && numero != 0 ){
                count = count + 1 ;
            }
            if (numero == limiteInferior || numero == limiteSuperior){
                informe = true;
            }
        } while(numero != 0);
        System.out.println("La suma de los numero ingresados que están dentro del intervalo es "+suma);
        if (count > 0){
            System.out.println("La cantidad de numeros ingresados que están fuera del intevalo es "+count);
        }
        if (informe){
            System.out.println("Se ingreso un numero igual a un limite.");
        }
        
    }
}