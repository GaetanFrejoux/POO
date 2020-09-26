//librairie de couleur
import java.awt.Color;

//Classe Velo
public class Bike{
    
    //atributs
    
    private final String brand;
    private Color color;
    private int speed;
    private final int  size;
    private Wheel[] wheels;

    //Constantes
    
    private final static String DEFAULT_BRAND = "Electra";
    private final static Color DEFAULT_COLOR = Color.RED;
    private final static int DEFAULT_SIZE = 26;
    private final static int MINIMUM_SPEED = 0;
    private final static int MAXIMUM_SPEED = 60;
    
    //methodes

    public Bike(){
		this.brand = DEFAULT_BRAND;
		this.color = DEFAULT_COLOR;
		this.speed = MINIMUM_SPEED;
		this.size = DEFAULT_SIZE;
		this.wheels = new Wheel[2];
		this.wheels[0] = new Wheel(DEFAULT_SIZE+1);
		this.wheels[1] = new Wheel(DEFAULT_SIZE-1);
    }
    public Bike(String b , Color c , int s, int s_w){
		this.brand = b;
		this.color = c;
		this.speed = MINIMUM_SPEED;
		this.size = s;
		this.wheels = new Wheel[2];
		this.wheels[0] = new Wheel(s_w+1);
		this.wheels[1] = new Wheel(s_w-1);
    }
    public Bike(Bike b){
		this.brand = b.brand;
		this.color = b.color;
		this.speed = b.speed;
		this.size = b.size;
		this.wheels = new Wheel[2];
		this.wheels[0] = new Wheel(b.wheels[0]);
		this.wheels[1] = new Wheel(b.wheels[1]);
    }
    //affiche les attributs du velo
    public void print(){
		
    	System.out.println(this.brand + " - " + this.size + "\" " + this.color + " (" + this.speed + "km/h)");
		
		if(this.wheels[0]!=null){
			System.out.print("Front Wheel :");
		    this.wheels[0].print();
		}
		
		if(this.wheels[1]!=null){
			System.out.print("Rear Wheel :");
		    this.wheels[1].print();
		}
	
    }

    //accelere le velo de 1 km h (max 60)
    public void accelerate(){
	
	if(this.speed < MAXIMUM_SPEED)
	    {
		this.speed++;
	    }
    }

    //ralentit le velo de 1 km h (min 0)
    public void brake(){
	
	if(this.speed > MINIMUM_SPEED)
	    {
		this.speed--;
	    }
    }
    
    //repaint en rouge le velo
    public void repaint(){
	this.color = DEFAULT_COLOR;
    }
    //retire une roue
    public void remWheel(int i){
		if(i==0){
		    this.wheels[0] = null;
		}
		else if (i==1){
		    this.wheels[1] = null;
		}
	}
    
    //remplace une roue si la roue qui la remplace, possede une taille avec une difference de taille de 2 pouces maximum
    public void replaceWheel(int i, String b, int size){
		if((this.size - size)<=2 && (this.size - size)>=-2 ){
		    if(i==0 || i ==1){
		    
			this.wheels[i]= new Wheel(size,b);
		    }
		}
    }
    //permute les deux roues d'un velo
    public void permuteWheels() {
    	Wheel tmp = this.wheels[0];
    	this.wheels[0] = this.wheels[1];
    	this.wheels[1] = tmp;
    }
    
    //compte le nombre de roue d'un velo
    public void numberOfWheels() {
    	int n=0;
    	for(int i = 0 ; i<2 ; i++) {
    		if (this.wheels[i] != null) {
    			n++;
    		}
    	}
    	System.out.println("Number of wheels : " + n);
    }
    
    public Wheel getFirstWheel() {
    	return this.wheels[0];
    }
}
