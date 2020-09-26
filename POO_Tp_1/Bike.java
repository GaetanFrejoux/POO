import java.awt.Color;

public class Bike{
    
    //atributs
    
    private static String brand;
    private Color color;
    private int speed;
    private static int  size;
    private Wheel[] wheels;

    //Constantes
    
    private final static String DEFAULT_BRAND = "Electra";
    private final static Color DEFAULT_COLOR = Color.RED;
    private final static int DEFAULT_SIZE = 26;
    private final static int MINIMUM_SPEED = 0;
    private final static int MAXIMUM_SPEED = 60;
    
    //methods

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
	this.wheels[0] = b.wheels[0];
	this.wheels[1] = b.wheels[1];
    }
    //affiche les attributs du velo
    public void print(){
	System.out.println(this.brand + " - " + this.size + "\" " + this.color + " (" + this.speed + "km/h)");
	if(this.wheels[0]!=null){
	    this.wheels[0].print();
	}
	if(this.wheels[1]!=null){
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

    public void remWheel(int i){
	if(i==0){
	    this.wheels[0] = null;
	}
	else if (i==1){
	    this.wheels[1] = null;
	}
    }

    public void replaceWheel(int i, String b, int size){
	if((this.size - size)<=2 && (this.size - size)>=-2 ){
	    if(i==0 || i ==1){
	    
		this.wheels[i]= new Wheel(size,b);
	    }
	}
    }
}
