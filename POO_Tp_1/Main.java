import java.awt.Color;

//Main

    public class Main{
        public static void main(String[] args){
	
	    //instanciation de deux velo
	
	    Bike b1 = new Bike();
	    Bike b2 = new Bike();
	    
	    System.out.println(b1); // Bike@5b480cf9
	    System.out.println(b2); // Bike@6f496d9f
	    
	    b1.accelerate();
	    b1.print();
	    
	    b1 = b2;
	    
	    System.out.println(b1); // Bike@6f496d9f
	    System.out.println(b2); // Bike@6f496d9f on remarque que b1 et b2 sont instancié dans la meme cellule.

	    Bike b3 = new Bike("Tmax",Color.BLACK,50, 24);
	    b3.print();
	    System.out.println(b3);
	    b3.rem_wheel(1);
	    b3.print();
	    Bike b4 = new Bike(b3);
	    b4.print();
	    System.out.println(b4);

	    Wheel w1 = new Wheel();
	    w1.print();

	    Bike b5 = new Bike("vrom",Color.BLACK,24, 24);
	    b5.replaceWheel(0,"mit",26);
	    b5.replaceWheel(1,"mitvit",28);

	    b5.print();
	}
    }
