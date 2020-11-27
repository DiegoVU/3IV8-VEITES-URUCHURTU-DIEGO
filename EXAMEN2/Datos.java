import java.util.*;
public class Datos{

    Scanner entrada = new Scanner(System.in);
   
     String nombre, gamertag;
     int id, decision;
   
    public Datos(){
    }
    public void identificacion(){
    
        System.out.println("Holaaa guap@, a continuacion se te pediran unos datos necesarios para continuar");
        System.out.println("Escribe tu nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingresa tu apodo o como te gusta que te llamen");
        gamertag = entrada.nextLine();
        System.out.println("Fianlmente escribe tu ID(SOLO ENTEROS)");
        id = entrada.nextInt();
        System.out.println("A continuacion jugaras un busca minas diferente al que estas acostumbrado.\n Este buscaminas tratara sobre encontar las minas, esta vez no trates de evitarlas.\n ¡Anda! juega y diviertete");
        System.out.println("La dificultad disponible actualmente es facil, presione 1 para continuar\n1. Facil");
        decision = entrada.nextInt();
        
        Buscamin dear = new Buscamin(nombre, gamertag, id);
        if (decision==1){
            System.out.println("Estamos listos para empezar :), La dificultad que has elegido es Facil");
           
            dear.juego();
        
        }
        

    }

} 
