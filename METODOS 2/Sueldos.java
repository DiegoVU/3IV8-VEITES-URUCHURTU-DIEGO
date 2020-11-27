import java.util.*;
public class Sueldos{

    int id, puesto, SueldoExD, SueldoExN;

    double gasto, sueldo;
    double SueldoE = 5000;
    double SueldoS = 8000;
    double infonavit = 8;
    double ISR = 16; 
    double SGM = 12.8;
    String NombreC;


    Scanner entrada = new Scanner(System.in);

    public void Sueldos(){

        Sueldos obj = new Sueldos();

        obj.Dinero();
    }
    public void Dinero(){

        System.out.println("Escribe tu ID ");
        id = entrada.nextInt();
        System.out.println("Escribe tu Nombre");
        NombreC = entrada.next();
        
        do{
            System.out.println("Ingresa tu puesto de trabajo");
            System.out.println("1. Empleado regular");
            System.out.println("2. Supervisor de zona");
            puesto = entrada.nextInt();
        }while (puesto > 2 ||  puesto < 1);
        if(puesto == 1){
            Empleado();
        }
        else{
            Supervisor();
        }
    }
    public void Empleado(){
        System.out.println("Escribe las horas extras matutinas");
        int SueldoExD = entrada.nextInt();
        System.out.println("Escribe las horas extras vespertinas");
        int SueldoExN = entrada.nextInt();

        SueldoExD = SueldoExD*50;
        SueldoExN = SueldoExN*60;
        sueldo = SueldoE + SueldoExD + SueldoExN;
        Total();
    }
    public void Supervisor(){
        gasto = infonavit + ISR + SGM;
        sueldo = SueldoS - gasto;
        Total();
    }
    public void Total(){
        System.out.println("El sueldo de: "+id+" "+NombreC+" es de: $" +sueldo);
    }
}