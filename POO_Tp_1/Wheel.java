
//Classe Roue velo
public class Wheel {

    //attributs
    private final String brand;
    private int size;
    private float pressure;

    //constantes
    private final static float DEFAULT_PRESSURE = 3; 
    private final static int DEFAULT_SIZE = 24;
    private final static String DEFAULT_BRAND = "Schalbe";
    //methodes
    
    //constructeur par defaut
    public Wheel(){
	this.brand = DEFAULT_BRAND;
	this.size = DEFAULT_SIZE;
	this.pressure = DEFAULT_PRESSURE;
    }

    //constructeur avec la taille en parametre
    public Wheel(int size){
	this.brand = DEFAULT_BRAND;
	this.size = size;
	this.pressure = DEFAULT_PRESSURE;
    }

    //constructeur avec la taille et la marque en parametre
    public Wheel(int size, String b){
	this.brand = b;
	this.size = size;
	this.pressure = DEFAULT_PRESSURE;
    }
    
    //constructeur avec une roue en parametre (copie)
    public Wheel(Wheel w) {
    	this.brand = w.brand;
    	this.size = w.size;
    	this.pressure = w.pressure;
    }
    
    //gonfle la roue de 0.1 bar
    public void inflate(){
	this.pressure += 0.1;
    }
    
    //degonfle la roue de 0.1 bar
    public void deflate(){
	if(this.pressure<=0.1){
	    this.pressure = 0;
	}
	else{
	    this.pressure -= 0.1;
	} 
    }
    
    //fonction qui affiche une roue
    public void print(){
	System.out.println("[" + this.brand + " - " + this.size + " - " + this.pressure + " bar]");
    }
    
    //redefinition de la fonction toString
    public String toString() {
    	return ("[" + this.brand + " - " + this.size + " - " + this.pressure + " bar]");
    }

    
    
}
