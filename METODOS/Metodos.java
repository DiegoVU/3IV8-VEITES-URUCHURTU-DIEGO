import java.util.Scanner;
import java.util.*;

public class Metodos{

    public void menu(){

        Scanner entrada = new Scanner(System.in);
        int  opcion;
        char letra;
        
        do{
            System.out.println("***************************************");
            System.out.println("*HECHO POR DIEGO VEITES URUCHURTU 3IV8*");
            System.out.println("***************************************");
            System.out.println("Seleccione el programa que desea ejecutar");
            System.out.println("1.- Calcule su edad");
            System.out.println("2.- Area y perimetro de figuras");
            System.out.println("3.- Llamadas");
            
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    do{
                    Edad obj = new Edad();
                    obj.Edad();
                    System.out.println("Para reptir el programa presiona'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 2:
                    do{
                    Figuras obj = new Figuras();
                    obj.Figuras();
                    System.out.println("Para reptir el programa presiona 'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 3:
                    do{
                    Llamadas obj = new Llamadas();
                    obj.Cel();
                    System.out.println("Para reptir el programa presiona 'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
            }
            System.out.println("Si desea regresar al menu presione 'w' para cerrar el programa presiona 's'");
            letra = entrada.next().charAt(0);
        }while(letra == 'w');
    }
}