import java.util.*;

class Menu{
    
    Scanner entrada = new Scanner(System.in);

    int opcion;

    public void Programas() {
    
       do{
            Sueldos obj = new Sueldos();
            Proovedores ob = new Proovedores();
            Biblioteca obje = new Biblioteca();

            System.out.println("*******************************");
            System.out.println("**3IV8 Veites Uruchurtu Diego**");
            System.out.println("*******************************");
            System.out.println("Bienvenido");
            System.out.println("Elije una opcion:");
            System.out.println("1. Sueldos");
            System.out.println("2. Proovedores");
            System.out.println("3. Biblioteca");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    obj.Sueldos();
                break;
                case 2:
                    ob.Proovedores();
                break;
                case 3:
                    obje.Biblioteca();
                break;
                case 4:
                    System.out.println("Gracias, ten un buen dia");
                break;
            }
        }while (opcion != 4);
    }
}
