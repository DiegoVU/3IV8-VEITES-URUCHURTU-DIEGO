import java.util.Scanner;

public class Figuras{ 
    Scanner entrada = new Scanner(System.in);
        
    int fig;
    int radio;
    int base;
    int altura;
    int ladoa;
    int ladob;
    double perimetro;
    double area;
    
    public void Figuras(){

        

        System.out.println("Seleccione la figura para calcular su area y perimetro 7u7");
        System.out.println("1.- Circulo");
        System.out.println("2.- Rectangulo");
        System.out.println("3.- Cuadrado");
        System.out.println("4.- Triangulo");
        
        fig = entrada.nextInt();
        
        switch(fig){
            case 1:
                Cir();
            break;

            case 2:
                Rec();
            break;
            
            case 3:
                Cuad();
            break;

            case 4:
                Tri();
            break;
        }
    }
    public void Cir(){
        System.out.println("Introduce el radio de nuestro circulo :3");
        
        radio = entrada.nextInt();
        perimetro = (2*3.14)*radio;
        area = 3.14*(radio*radio);
        
        System.out.println("La circunferencia es de " + perimetro);
        System.out.println("El Area es " + area);
    }
    public void Rec(){
        System.out.println("Introduce la base del rectangulo :3");
        
        base = entrada.nextInt();
        
        System.out.println("Introduce la altura del rectangulo :3");
        
        altura = entrada.nextInt();
        perimetro = base*altura;
        area = 2*(base+altura);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
    public void Cuad(){
        System.out.println("Introduce el valor de un lado del cuadrado :3");

        base = entrada.nextInt();
        perimetro = base*4;
        area = base*base;

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
    public void Tri(){
        System.out.println("Introduce la base del triangulo :3");
        
        base = entrada.nextInt();

        System.out.println("Introduce los dos lados que nos hacen falta del triangulo ;3");
        
        ladoa = entrada.nextInt();
        ladob = entrada.nextInt();

        System.out.println("Introduce la altura del triangulo :3");
        
        altura = entrada.nextInt();
        perimetro = base+ladoa+ladob;
        area = altura*(base/2);

        System.out.println("El perimetro es de " + perimetro);
        System.out.println("El area es " + area);
    }
}