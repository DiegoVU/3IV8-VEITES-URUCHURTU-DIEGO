

import java.util.*; 
public class Principal{
   
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int sal;
        System.out.println("*******************************");
        System.out.println("**3IV8 Veites Uruchurtu Diego**");
        System.out.println("*******************************");
        do{
            
            Principal.menu();
                System.out.println("Para volver al menu escribe 9, si no es asi preciona cualquier tecla");
              
                sal = entrada.nextInt();
        }while (sal == 9);
    }
 
public static void menu(){
    Scanner entrada = new Scanner(System.in);
int poo;

Datos Datos = new Datos();


System.out.println("Menu de juegos");
System.out.println("1. Buscaminas");

poo = entrada.nextInt();
if(poo<1 || poo>3){
    System.out.println("Te hablan del circo");
} 
switch (poo){
  
    case 1:
    try{
    Datos.identificacion();
}catch(Exception e){

    System.out.println("Te hablan del circo");
  
    System.out.println("Error: "+ e.getMessage());
}
    break;
    
    

    
}
}
}
