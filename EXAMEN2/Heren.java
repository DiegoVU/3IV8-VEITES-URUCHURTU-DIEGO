public class Heren{ 
    private String nombre, gamertag;
    private int id;
    
    
    public Heren(){
    }
    
    
    public Heren(String nombre, String gamertag, int id){
        this.nombre = nombre;
        this.gamertag = gamertag;
        this.id = id;
    }
   
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getGamertag(){
        return gamertag;
    }

    public void setGamertag(int puesto){
        this.gamertag = gamertag;
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
    
}