public class Wheel {

    //attributs
    private static String brand;
    private int size;
    private float pressure;

    //constantes
    private final static float DEFAULT_PRESSURE = 3; 
    private final static int DEFAULT_SIZE = 24;
    private final static String DEFAULT_BRAND = "Schalbe";
    //methodes
    public Wheel(){
	this.brand = DEFAULT_BRAND;
	this.size = DEFAULT_SIZE;
	this.pressure = DEFAULT_PRESSURE;
    }

    
    public Wheel(int size){
	this.brand = DEFAULT_BRAND;
	this.size = size;
	this.pressure = DEFAULT_PRESSURE;
    }

    public Wheel(int size, String b){
	this.brand = b;
	this.size = size;
	this.pressure = DEFAULT_PRESSURE;
    }
    
    public void inflate(){
	this.pressure += 0.1;
    }
    
    public void deflate(){
	if(this.pressure<=0.1){
	    this.pressure = 0;
	}
	else{
	    this.pressure -= 0.1;
	} 
    }

    public void print(){
	System.out.println("[" + this.brand + " - " + this.size + " - " + this.pressure + " bar]");
    }

    
    
}
