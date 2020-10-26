import java.util.Scanner;

class Actividad{

    public static void main(String[] args){
       
        Scanner entrada = new Scanner(System.in);
        int opcion, opcion3, opcion4, NA, opcion5, opcion6;
        double edad, temperatura, Coversioncelsius, Coversionkelvin, Coversionrankine, NE;
        String binario = "";
        int input, digito;
        int positivo = 0; 
        int negativo = 0; 
        int cero = 0;
        int Galletas, Refresco, Papas, Chocolates, Malteada, Productostotal, Pagototal; 
        int PGalletas = 12;
        int PRefresco = 12; 
        int PPapas = 10; 
        int PChocolates = 5;
        int PMalteadas = 20;  
        double altura, base, radio;
        double resultadoarea;
        double resultadoperimetro;
        double resultadovolumencilindro, resultadovolumenesfera; 
        double numeroF = 0;
        double factorial = 1;
        double n = 0;
        double n1 = 0;
        double totalcal=0;
        

        
        do{
         
         
         System.out.println("Bienvenido al programa de estructura de datos Mi ");
         System.out.println("****************************************************");
         System.out.println("*Mi nombre es Diego Veites uruchurtu del grupo 3IV8*");
         System.out.println("****************************************************");
         System.out.println("Elija una de las siguientes opciones:");
         System.out.println("1.- Programa 1");
         System.out.println("2.- Programa 2");
         System.out.println("3.- Programa 3");
         System.out.println("4.- Programa 4");
         System.out.println("5.- Programa 5");
         System.out.println("6.- Programa 6");
         System.out.println("7.- Programa 7");
         System.out.println("8.- Programa 8");
         System.out.println("9.- Programa 9");
         System.out.println("10.- Programa 10");
         System.out.println("11.- Programa 11");
         System.out.println("12.- Programa 12");
         System.out.println("13.- Programa 13");
         System.out.println("14.- Salir");

         opcion = entrada.nextInt();
        
      
   

         switch (opcion) {
         case 1:
             System.out.println("Ingresa tu edad");
             edad = entrada.nextDouble();
             if(edad > 65){
                System.out.println("Al precio del abono se le aplica un descuento de 40%");}
             else {
                if(edad < 21){
                    int opcion2;
                    System.out.println("Tus padres son socios");
                    System.out.println("1.- SI");
                    System.out.println("2.- NO");
                    opcion2 = entrada.nextInt();
                    switch (opcion2){
                      case 1:
                      System.out.println("Al precio del abono se le aplica un descuento de 45%");
                      break;
                      case 2:
                      System.out.println("Al precio del abono se le aplica un descuento de 25%");
                      break;}
                }
                else {
                System.out.println("Al precio del abono se le aplica un descuento de 25%");}}

                break;
         case 2:
            System.out.println("Ingrese un numero entero decimal");
            input = entrada.nextInt();
              if(input > 0){
               do{
                   digito = input % 2;
                   binario += digito;
                   input = input / 2;
               }while(input != 0);
                   binario = new StringBuilder(binario).reverse().toString();
                   System.out.println("El numero binario es "+binario);
                   break;}
              else{   
               do{
                System.out.println("El numero ingresado no es positivo, ingresa uno nuevo");
                input = entrada.nextInt();

               }while (input < 0);
                do{
                   digito = input % 2;
                   binario += digito;
                   input = input / 2;
                }while(input != 0);
                  binario = new StringBuilder(binario).reverse().toString();
                  System.out.println("El numero binario es "+binario);
        
                break;}
            
         case 3:
            System.out.println("Elije la conversion a realizar");
            System.out.println("1. Fahrenheit a Celsius");
            System.out.println("2. Fahrenheit a Kelvin");
            System.out.println("3. Fahrenheit a Rankine");
            opcion3 = entrada.nextInt();
         

            switch (opcion3) {
            case 1:
                System.out.println("Ingresa la temperatura en grados Fahrenheit");
                temperatura = entrada.nextDouble();
                if   (temperatura > 0) {
                  Coversioncelsius = (temperatura - 32)*5/9;
                  System.out.println("La temperatura es "+Coversioncelsius+" Grados Celsius");
                  break;}
                else {
                    do {
                      System.out.println("La temperatura ingresada no es positiva, ingresa una positiva");
                      temperatura = entrada.nextDouble();
                    }while (temperatura < 0); 
                   Coversioncelsius = (temperatura - 32)*5/9;
                   System.out.println("La temperatura es "+Coversioncelsius+" Grados Celsius");}
                   break;    
                 

            case 2: 
                System.out.println("Ingresa la temperatura en grados Fahrenheit");
                temperatura = entrada.nextDouble();
                if   (temperatura > 0) {
                    Coversionkelvin = (temperatura - 32)*5/9+273.15;
                    System.out.println("La temperatura es "+Coversionkelvin+" Grados Kelvin");
                    break;}
                else {
                    do {
                      System.out.println("La temperatura ingresada no es positiva, ingresa una positiva");
                      temperatura = entrada.nextDouble();
                    }while (temperatura < 0); 
                    Coversionkelvin = (temperatura - 32)*5/9+273.15;
                    System.out.println("La temperatura es "+Coversionkelvin+" Grados Kelvin");
                    break;}

            case 3:
             System.out.println("Ingresa la temperatura en grados Fahrenheit");
             temperatura = entrada.nextDouble();
                if   (temperatura > 0) {
                    Coversionrankine = temperatura + 459.67;
                    System.out.println("La temperatura es "+Coversionrankine+" Grados Rankine");
                    break;}
                else {
                    do {
                      System.out.println("La temperatura ingresada no es positiva, ingresa una positiva");
                      temperatura = entrada.nextDouble();
                    }while (temperatura < 0); 
                      Coversionrankine = temperatura + 459.67;
                      System.out.println("La temperatura es "+Coversionrankine+" Grados Rankine");
                      break;}
               
            }
            default:
            break;
              
            
         case 4:    
            System.out.println("ingresa la cantidad de numeros a analizar");
            NA = entrada.nextInt();
            if (NA > 0){
                   for(int i = 1;i<=NA;i++){
                    System.out.println("Ingrese un numero");
                    NE = entrada.nextDouble();
                      if (NE > 0){
                          positivo++;
                      }
                      else if (NE < 0) {
                        negativo++;
                      }
                      else {
                        cero++;
                      }
                   }
                   System.out.println("La cantidad de numeros positivos es "+positivo);
                   System.out.println("La cantidad de numeros negativos es "+negativo);
                   System.out.println("La cantidad de numeros ceros es "+cero);
                   break;
                   

            }else 
              do {
                    System.out.println("El numero ingresado es incorrecto, ingresa uno nuevamente");
                     NA = entrada.nextInt();
              }while (NA < 0); 
               for(int i = 1;i<=NA;i++){
                 System.out.println("Ingrese un numero");
                 NE = entrada.nextDouble();
                  if (NE > 0){
                      positivo++;
                  }
                  else if (NE < 0) {
                    negativo++;
                  }
                  else {
                    cero++;
                  }
               }
               System.out.println("La cantidad de numeros positivos es "+positivo);
               System.out.println("La cantidad de numeros negativos es "+negativo);
               System.out.println("La cantidad de numeros ceros es "+cero);
               break;
                

         case 5:
          System.out.println("Bienvido al ocso");
          System.out.println("A continuacion la lista de precios de nuestros productos");
          System.out.println("Coca-cola = $12");
          System.out.println("Malteada de fresa = $20");
          System.out.println("Carlos V = $5");
          System.out.println("Papas $10");
          System.out.println("principe $12");
          System.out.println("Ahora indica la cantidad de productos comprados");
          System.out.println("Cantidad de Coca-Cola");
          Refresco = entrada.nextInt();
          while (Refresco < 0){
          do {
            System.out.println("Usted a comido demasiada paleta payaso");
            System.out.println("Ingresa uno nuevamente");
            Refresco = entrada.nextInt();
          }while (Refresco < 0);}
          System.out.println("Cantidad de Malteadas");
          Malteada = entrada.nextInt();
          while (Malteada < 0){
          do {
            System.out.println("No sea comediante");
            System.out.println("Ingresa uno nuevamente");
            Malteada = entrada.nextInt();
          }while (Malteada < 0);}
          System.out.println("Cantidad de Chocolates");
          Chocolates = entrada.nextInt();
          while (Chocolates < 0){
          do {
            System.out.println("Lea bien plox");
            System.out.println("Ingresa uno nuevamente");
            Chocolates = entrada.nextInt();
          }while (Chocolates < 0);}
          System.out.println("Cantidad de Papas");
          Papas = entrada.nextInt();
          while (Papas < 0){
          do {
            System.out.println("Le pedimos de manera amable que vuelva a poner un dijito, ya que este es incorrecto");
            System.out.println("Ingresa uno nuevamente");
            Papas = entrada.nextInt();
          }while (Papas < 0);}
          System.out.println("Cantidad de Galletas");
          Galletas = entrada.nextInt();
          while (Galletas < 0){
          do {
            System.out.println("te equivocaste rey");
            System.out.println("Ingresa uno nuevamente");
            Galletas = entrada.nextInt();
          }while (Galletas < 0);}
          Productostotal = Papas + Galletas + Chocolates + Malteada + Refresco;
          Pagototal = (Papas*PPapas)+(Galletas*PGalletas)+(Refresco*PRefresco)+(Malteada*PMalteadas)+(Chocolates*PChocolates);
          System.out.println("La cantidad de productos comprados es "+Productostotal+" Y el total a pagar es de "+Pagototal+ " pesos");
          System.out.println("Que tenga buen dia :)");
           break;
         case 6:

          System.out.println("Programa de calculo de areas, peimetro y volumen");
          System.out.println("Elije alguna de nuestras opciones");
          System.out.println("1. Area y Perimetro de un rectangulo");
          System.out.println("2. Area y Perimetro de un triangulo");
          System.out.println("3. Volumen de una esfera y cilindro");
          opcion5 = entrada.nextInt();
          switch (opcion5){
              case 1:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextDouble();
                if(base > 0){
                    System.out.println("Ingresa el valor de un altura");
                    altura = entrada.nextDouble();
                        if(altura > 0){
                            resultadoarea = (base*altura)/2;
                          resultadoperimetro = base*3;
                          System.out.println("El area es de: "+resultadoarea);
                          System.out.println("El perimetro es de: "+resultadoperimetro);
                          break;}
                        else{
                           System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                           altura = entrada.nextDouble();
                           while (altura < 0){
                           System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                           altura = entrada.nextDouble();}
                           resultadoarea = (base*altura)/2;
                           resultadoperimetro = base*3;
                           System.out.println("El area es de: "+resultadoarea);
                           System.out.println("El area es de: "+resultadoperimetro);
                           break;}}
                      
                    else{
                        System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                        base = entrada.nextDouble();
                        while (base < 0){
                        System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                        base = entrada.nextDouble();}
                        System.out.println("Ingresa el valor de un altura");
                        altura = entrada.nextDouble();
                       if(altura > 0){
                           resultadoarea = (base*altura)/2;
                           resultadoperimetro = base*3;
                           System.out.println("El area es de: "+resultadoarea);
                           System.out.println("El area es de: "+resultadoperimetro);
                           break;}
                        else   {
                            System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                            altura = entrada.nextDouble();
                            while (altura < 0){
                            System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                            altura = entrada.nextDouble();}
                            resultadoarea = (base*altura)/2;
                            resultadoperimetro = base*3;
                            System.out.println("El area es de: "+resultadoarea);
                            System.out.println("El area es de: "+resultadoperimetro);
                            break;}}
              case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextDouble();
                if(base > 0){
                  System.out.println("Ingresa el valor de un altura");
                  altura = entrada.nextDouble();
                      if(altura > 0){
                          resultadoarea = (base*altura)/2;
                        resultadoperimetro = base*3;
                        System.out.println("El area es de: "+resultadoarea);
                        System.out.println("El area es de: "+resultadoperimetro);
                        break;}
                      else{
                         System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                         altura = entrada.nextDouble();
                         while (altura < 0){
                         System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                         altura = entrada.nextDouble();}
                         resultadoarea = (base*altura)/2;
                         resultadoperimetro = base*3;
                         System.out.println("El area es de: "+resultadoarea);
                         System.out.println("El area es de: "+resultadoperimetro);
                         break;}}
                    
                else{
                      System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                      base = entrada.nextDouble();
                       while (base < 0){
                          System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                          base = entrada.nextDouble();}
                          System.out.println("Ingresa el valor de un altura");
                         altura = entrada.nextDouble();
                         if(altura > 0){
                         resultadoarea = (base*altura)/2;
                         resultadoperimetro = base*3;
                         System.out.println("El area es de: "+resultadoarea);
                         System.out.println("El area es de: "+resultadoperimetro);
                         break;}
                      else   {
                          System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                          altura = entrada.nextDouble();
                          while (altura < 0){
                          System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                          altura = entrada.nextDouble();}
                          resultadoarea = (base*altura)/2;
                          resultadoperimetro = base*3;
                          System.out.println("El area es de: "+resultadoarea);
                          System.out.println("El area es de: "+resultadoperimetro);
                          break;}

                  }
              case 3:
               System.out.println("Ingresa el valor del radio");
               radio = entrada.nextDouble();
               if(radio > 0){
                  System.out.println("Ingresa el valor de un altura del cilindro");
                  altura = entrada.nextDouble();
                      if(altura > 0){
                          resultadovolumenesfera  = ((4*3.1416)*(radio*radio*radio))/3;
                          resultadovolumencilindro = (3.1416*(radio*radio))*altura;
                        System.out.println("El volumen del clindro es de: "+resultadovolumencilindro);
                        System.out.println("El volumen de la esfera es de: "+resultadovolumenesfera);
                        break;}
                      else{
                         System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                         altura = entrada.nextDouble();
                         while (altura < 0){
                         System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                         altura = entrada.nextDouble();}
                         resultadovolumenesfera  = ((4*3.1416)*(radio*radio*radio))/3;
                          resultadovolumencilindro = (3.1416*(radio*radio))*altura;
                         System.out.println("El volumen del clindro es de: "+resultadovolumencilindro);
                         System.out.println("El volumen de la esfera es de: "+resultadovolumenesfera);
                         break;}}
                    
                  else{
                      System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                      radio = entrada.nextDouble();
                      while (radio < 0){
                      System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                      radio = entrada.nextDouble();}
                      System.out.println("Ingresa el valor de un altura");
                      altura = entrada.nextDouble();
                     if(altura > 0){
                         resultadovolumenesfera  = ((4*3.1416)*(radio*radio*radio))/3;
                         resultadovolumencilindro = (3.1416*(radio*radio))*altura;
                         System.out.println("El volumen del clindro es de: "+resultadovolumencilindro);
                         System.out.println("El volumen de la esfera es de: "+resultadovolumenesfera);
                         break;}
                      else   {
                          System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                          altura = entrada.nextDouble();
                          while (altura < 0){
                          System.out.println("El numero ingresado no es real positivo ingresa uno nuevo");
                          altura = entrada.nextDouble();}
                          resultadovolumenesfera  = ((4*3.1416)*(radio*radio*radio))/3;
                          resultadovolumencilindro = (3.1416*(radio*radio))*altura;
                         System.out.println("El volumen del clindro es de: "+resultadovolumencilindro);
                         System.out.println("El volumen de la esfera es de: "+resultadovolumenesfera);
                          } 
                         break;}}
                         
                          
                          
         case 7:
             System.out.println("Tabla de valores");
             System.out.println("__________");
             System.out.println("| N  |"+"     |"+"      |"+"      |");
             System.out.println("--------------------------");
             System.out.println("| 1  |"+" 10  |"+" 100  |"+" 1000 |");
             System.out.println("--------------------------");
             System.out.println("| 2  |"+" 20  |"+" 200  |"+" 2000 |");
             System.out.println("--------------------------");
             System.out.println("| 3  |"+" 30  |"+" 300  |"+" 3000 |");
             System.out.println("--------------------------");
             System.out.println("| 4  |"+" 40  |"+" 400  |"+" 4000 |");
             System.out.println("--------------------------");
             System.out.println("| 5  |"+" 50  |"+" 500  |"+" 5000 |");
             System.out.println("--------------------------");
             System.out.println("| 6  |"+" 60  |"+" 600  |"+" 6000 |");
             System.out.println("--------------------------");
             System.out.println("| 7  |"+" 70  |"+" 700  |"+" 7000 |");
             System.out.println("--------------------------");
             System.out.println("| 8  |"+" 80  |"+" 800  |"+" 8000 |");
             System.out.println("--------------------------");
             System.out.println("| 9  |"+" 90  |"+" 900  |"+" 9000 |");
             System.out.println("--------------------------");
             System.out.println("| 10 |"+" 100 |"+" 1000 |"+" 1000 |");
             System.out.println("--------------------------");
             break;
         case 8: 
          System.out.println("Ingrese un numero para calcular su factorial");
          numeroF = entrada.nextDouble();
          do{
            System.out.println("El numero ingresado no es positivo, ingresa uno que sea positivo");
            numeroF = entrada.nextDouble();
          }while (numeroF < 0);
          double numero1 = numeroF;
          while (numeroF != 0){
             factorial *= numeroF;
             numeroF --;
          }
         
          System.out.println("El factorial de: "+numero1+" es "+factorial);
          break;
         case 13:
         System.out.println("Que operacion desea hacer");
         System.out.println("1.- Suma");
         System.out.println("2.- Resta");
         System.out.println("3.- Multiplicacion");
         System.out.println("4.- Division");
         opcion6 = entrada.nextInt();
         switch (opcion6){
         case 1: 
         System.out.println("Escriba el primer dijito");
         n = entrada.nextDouble();
         System.out.println("Escriba el segundo dijito");
         n1 = entrada.nextDouble();
         totalcal= n + n1;
         System.out.println("EL resultado de la suma es: " + totalcal);
         break;
         case 2:
         System.out.println("Escriba el primer dijito");
         n = entrada.nextDouble();
         System.out.println("Escriba el segundo dijito");
         n1 = entrada.nextDouble();
         totalcal= n - n1;
         System.out.println("EL resultado de la resta es: " + totalcal);
         break;
         case 3:
         System.out.println("Escriba el primer dijito");
         n = entrada.nextDouble();
         System.out.println("Escriba el segundo dijito");
         n1 = entrada.nextDouble();
         totalcal= n * n1;
         System.out.println("EL resultado de la multiplicacion es: " + totalcal);
         break;
         case 4:
         System.out.println("Escriba el primer dijito");
         n = entrada.nextDouble();
         System.out.println("Escriba el segundo dijito");
         n1 = entrada.nextDouble();
         System.out.println("EL resultado de la division es: " + totalcal);
         
         }
        break;
         case 14:
          System.out.println("¿Seguro que desea salir?");
           break;
           
        }System.out.println("1. Continuar en el programa");
        System.out.println("2. Salir del programa");
         opcion4 = entrada.nextInt();
          
        } while (opcion4 !=2);
           switch (opcion4) {
           case 2: 
           System.out.println("Gracias por venir");
           break;
           default:
        }
           


 
    //A noma profe ahora si se paso pero ahí está
    //El 13 esta incompleto
    //El 7 tiene un error quee no veo



}   }
          
               
           
        
               
               