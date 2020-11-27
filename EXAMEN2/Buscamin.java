  
import java.util.*;

public class Buscamin extends Heren{
  
    public Buscamin(){
    }
  
	public Buscamin(String nombre, String gamertag, int id){
        super(nombre,gamertag,id);
    }
  
    Scanner entrada = new Scanner (System.in);
    
	public void juego(){
		
		
		int tablero [][]= new int[15][15];
		double w=0;
  		double z=0;
		int ntminas=0;
		int intento=75;
		int tminas=10;
		
		for(int j=0;j<15;j++)
			for (int i=0;i<15;i++)
				tablero [j][i]=0;
		
		do  {  
          
     			w=Math.random()*15;
        		z=Math.random()*15;  
           		w=(int)w;
           		z=(int)z;
           		if  (z!=0 && w!=0 && z!=15-1 && w!=15-1){
             	tablero[(int)w][(int) z ]=1;
              	ntminas++;
           			}
       		}while (ntminas<=10);
       
             
      
        System.out.println("\nHola "+getGamertag()+"                                          *");
        System.out.println("\nVamos "+getNombre()+"                                          *");
        System.out.println("\nTu ID es: "+getId()+"                                          *");
       
       	System.out.println("  ingresa dos numeros del 1 al 15");
       	do {
       		int x=0,y=0;           
       		int nminas = 0;
       		
       		do{
       			
       			 System.out.println("\n	Intento :"+intento+" , Ingrese una coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=entrada.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=entrada.nextInt();
       			 
       			 if(x==0 || y==0 || x>15 || y>15)
       			 	System.out.println("Te hablan del circo");
       		}while (x==0 || y==0 || x>15 || y>15);
       		
       		x=x-1;
       		y=y-1;
            
       		if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<15 && y<15)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<15 && y<15)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<15 && y<15)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{
       				
       					if(x-1>=0 && x-1<15 && y-1<15)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<15 && y-1<15)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<15 && y-1<15)
       						nminas=nminas+tablero [x+1][y-1];
       					if(x+1>=0 && x+1<15 && y<15)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<15 && y<15)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<15 && y+1<15 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<15 && y+1<15 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("No encontraste la mina ");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	En tu posicion alrededor de ti hay:"+ nminas + "minas");
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Le diste a una mina, quedan "+tminas+" Minas");
       				System.out.println("\n	Te quedan: "+(intento-1)+ "Intentos");
       			}
       	
          intento=intento-1;
      }while (intento>=tminas && intento>0 && tminas>0);	
 	   
       	if(tminas==0)
       		yay();
       	
       	if(tminas>intento)
       		efe();
       	
       	if(intento==0)
       		efe2();
        }
      
        public void efe(){
            System.out.println("Has perdido, todavia quedaban muchas minas");
        }
        public void efe2(){
            System.out.println("Has perdido, suerte para la proxima");
        }
        public void yay(){
            System.out.println("Has ganado felicidades");
        }
    } 
       
       
       
       
       
