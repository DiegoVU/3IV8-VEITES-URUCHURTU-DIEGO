//se ponen las librerias
import java.util.Scanner;
class Pokedex{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        //Variables
 int opcion;
         int  Charmander;
         int  Bulbasor;
         int  Squartle;
         int vida1 = 100;
         int fuerza1 = 50;
         int ataquep1 = 50;
         int ataques1 = 30;
         int vida2 = 200;
         int  fuerza2 = 60;
         int ataquep2 = 30;
         int ataques2 = 40; 
         int vida3 = 150;
         int fuerza3 = 90;
         int ataquep3 = 20;       
         int ataques3 = 80;

//se abre el do para las opciones
        do{
            System.out.println("Diego Veites Uruchurtu 3IV8");
            System.out.println("*********");
            System.out.println("*POKEDEX*");
            System.out.println("*********");
         System.out.println("ELIGE UN POKEMON");
         System.out.println("1. Charmander para consultar sus datos");
         System.out.println("2. Bulbasor para consultar sus datos");
         System.out.println("3. Squartle para consultar sus datos");
         System.out.println("4. Batalla pokemon");
         System.out.println("5. Salir");
         //se invocan las librerias
opcion = entrada.nextInt();

       switch (opcion) {
           //caso 1
           case 1:
            System.out.println("Elijiste Charmander");
            System.out.println("ID 1");
            System.out.println("La defensa vida de tu pokemon es: "+vida1);
            System.out.println("La fuerza de tu pokemon "+fuerza1);
            System.out.println("El ataque principal de tu pokemon es: "+ataquep1);
            System.out.println("El ataque secundario de tu pokemon es: "+ataques1);
             vida1 = 100;
             fuerza1 = 50;
             ataquep1 = 50;
             ataques1 = 30;
               break;
               //caso 2
           case 2:
             System.out.println("Elijiste Bulbasaur");
             System.out.println("ID 2");
             System.out.println("La defensa vida de tu pokemon es: "+vida2);
             System.out.println("La fuerza de tu pokemon "+fuerza2);
              System.out.println("El ataque principal de tu pokemon es: "+ataquep2);
             System.out.println("El ataque secundario de tu pokemon es: "+ataques2);
             vida2 = 200;
             fuerza2 = 60;
             ataquep2 = 30;
             ataques2 = 40;
              break;
              //caso 3
case 3:
             System.out.println("Elijiste Squirtle");
             System.out.println("ID 3");
             System.out.println("La defensa vida de tu pokemon es: "+vida3);
             System.out.println("La fuerza de tu pokemon "+fuerza3);
              System.out.println("El ataque principal de tu pokemon es: "+ataquep3);
             System.out.println("El ataque secundario de tu pokemon es: "+ataques3);
             vida3 = 150;
             fuerza3 = 90;
             ataquep3 = 20;
             ataques3 = 80;
              break; 
              //caso 4
           case 4:
          

             break;
             //caso 5
           case 5:
            default:
               break;
               // se pone la opcion para salr

       } 
        }while (opcion != 5); 


    } 
}



