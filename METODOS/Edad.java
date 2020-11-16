import java.util.Scanner;

public class Edad{
    
    public void Edad(){
        
        Scanner entrada = new Scanner(System.in);

        int ano;
        int total;

        System.out.println("Para saber su edad escriba su ano de nacimiento");
        System.out.println("Dime tu ano de nacimiento nun");
        
        //se escucha mal, pero no supe como poner la "ñ"

        ano = entrada.nextInt();
        
        if(ano > 2020){
            System.out.println("Así que viene del futuro eeeh");
            ano = entrada.nextInt();   
        }
        else{
            total = (2020)-(ano);
            System.out.println("Su edad es de " + total);
        }
    }
}