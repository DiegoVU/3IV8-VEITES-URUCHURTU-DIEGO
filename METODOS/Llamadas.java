import java.util.Scanner;

public class Llamadas{

    public void Cel(){
        
        Scanner entrada = new Scanner(System.in);

        int i, saldo = 150;
        int numeros[] = new int [10];
        int P = 0; 
        int N = 0; 
        int C = 0;
        double GastoTotal;
        double sumaP = 0;
        double sumaN = 0;
        double sumaC = 0;
        char letra;

        System.out.println("Selecciona una opcion");
        System.out.println("1.- Llamada en Mexico");
        System.out.println("2.- Llamada internacional");
        System.out.println("3.- Celular");
        System.out.println("El saldo con el que cuenta es de $150");
        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] == 1){
                P++;
                sumaP = P*0.5;
            }
            else if (numeros[i] == 2){
                N++;
                sumaN = (N/2)*(0.6);
            }
            else if (numeros[i] == 3){
                C++;
                sumaC = (C/3)*0.2;
            }
        }
            
        GastoTotal = sumaP + sumaN + sumaC;

        System.out.println("Ha gastado un total de $" + GastoTotal);
        System.out.println("Si desea conocer su saldo, digite 's' si no, pulse 'n'");
        
        letra = entrada.next().charAt(0);
        
        if(letra == 's'){
            System.out.println("Su saldo original era de $" + saldo + " *w*");
            System.out.println("Su nuevo saldo es de $" + (saldo - GastoTotal) + " UnU");
        }
    }
}