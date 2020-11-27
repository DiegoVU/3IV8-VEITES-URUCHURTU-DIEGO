import java.util.*;

public class Biblioteca{
    public void Biblioteca(){
        
        Scanner entrada = new Scanner(System.in);
        Operaciones obj = new Operaciones();
        Libros l = new Libros();
        int Op, i, Cant, ID;

        try{
            do{
                System.out.println("Escribe la cantidad de libros a registrar");
                Cant = entrada.nextInt();
                if(Cant<=0){
                    System.out.println("El circo es una buena opcion para ti");
                }
            }while(Cant<=0);

            entrada.nextLine();

            String Titulos[] = new String[Cant];
            String Autores[] = new String[Cant];
            int Libros[] = new int[Cant];
            int Prestados[] = new int[Cant];
            int Disponibles[] = new int[Cant];

            for(i=0;i<Cant;i++){
                System.out.println("Escribe el titulo del libro "+(i+1));
                Titulos[i] = entrada.nextLine();
                System.out.println("Escribe el nombre del autor"+(i+1));
                Autores[i] = entrada.nextLine();
                l.random();
                Libros[i] = l.getNoLibro();
                Prestados[i] = l.getNoPrestados();
            }
            for(i=0;i<Cant;i++){
                Disponibles[i] = (Libros[i]-Prestados[i]);
                System.out.println(Titulos[i]+", "+Autores[i]+", disponibles: "+Disponibles[i]);
            }
            do{
                System.out.println("Elija una opcion");
                System.out.println("1.- Pedir prestado");
                System.out.println("2.- Regresar");
                System.out.println("3.- Salir");
                Op = entrada.nextInt();

                switch(Op){
                    case 1:
                        obj.mostrar(Titulos, Autores, Disponibles);
                        do{
                            System.out.println("Escribe el ID del libro ");
                            ID = entrada.nextInt();
                            if(ID<0||ID>=Cant){
                                System.out.println("El cico es buena opcion para ti");
                            }
                        }while(ID<0||ID>=Cant);
                        if(Disponibles[ID]>0){
                            Disponibles[ID] -= 1;
                        }else{
                            System.out.println("Ya no hay");
                        }
                    break;
                    case 2:
                        obj.mostrar(Titulos, Autores, Disponibles);
                        do{
                            System.out.println("Escribe el ID del libro a devolver");
                            ID = entrada.nextInt();
                            if(ID<0||ID>=Cant){
                                System.out.println("El circo te esta marcando, contesta");
                            }
                        }while(ID<0||ID>=Cant);
                        Disponibles[ID] += 1;
                    break;
                    case 3:
                        System.out.println("Gracias, ten un buen dia");
                    break;
                }
            }while(Op!=3);
        }catch(Exception e){
            System.out.println("Nivel de comedia: altisimo");
        }
    }
}