import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Classe Main

public class Main{
	//Classe main
    public static void main(String[] args){
   	
//	    //instanciation de deux velo
//        	
//	    Bike b1 = new Bike();
//	    Bike b2 = new Bike();
//	    
//	    System.out.println(b1); // Bike@5b480cf9
//	    System.out.println(b2); // Bike@6f496d9f
//	    
//	    b1.accelerate();
//	    b1.print();
//	    
//	    b1 = b2;
//	    
//	    System.out.println(b1); // Bike@6f496d9f
//	    System.out.println(b2); // Bike@6f496d9f on remarque que b1 et b2 sont instancie dans la meme cellule.
//
//	    Bike b3 = new Bike("Tmax",Color.BLACK,50, 24);
//	    b3.print();
//	    System.out.println(b3);
//	    
//	    //test de retirer une roue
//	    b3.remWheel(1);
//	    b3.print();
//	    
//	    //test de copie d'un velo
//	    Bike b4 = new Bike(b3);
//	    b4.print();
//	    System.out.println(b4);
//
//	    //test de creation d'une roue et de l'affichage
//	    Wheel w1 = new Wheel();
//	    w1.print();
//
//	    
//	    Bike b5 = new Bike("vrom",Color.BLACK,24, 24);
//	    //2 test de remplacement de roues le premier doit fonctionner
    	//et le deuxieme ne doit pas fonctionner
//	    b5.replaceWheel(0,"Possible",26);
//	    b5.replaceWheel(1,"PasPossible",28);
//	    
//	    b5.print();
//	    
//    	
//    	
//    	//test permute
//    	
//	    Bike b5 = new Bike("vrom",Color.BLACK,24, 24);
//	    b5.print();
//	    b5.permuteWheels();
//	    b5.print();
//	    
//    	
//    	
//    	//test nombre de roue
//    	
//	    Bike b6 = new Bike("vrom",Color.BLACK,24, 24);
//	    b6.numberOfWheels();
//	    b6.remWheel(1);
//	    b6.numberOfWheels();
//	    
//    	//test si les roues d'un velo copie sont bien des nouvelles roues instancie
//    	
//    	Bike b7 = new Bike();
//    	Bike b8 = new Bike(b7);
//    	System.out.println(b7);
//    	System.out.println(b8);
//    	
//    	System.out.println(b7.getFirstWheel());
//    	System.out.println(b8.getFirstWheel());
//
//    	//creation d'une liste de roue
//    	List<Wheel> wlist = new  ArrayList<>();
//    	
//    	//ajout de roues
//    	Wheel w1 = new Wheel(3,"c");
//    	
//    	wlist.add(new Wheel(1,"a"));
//    	wlist.add(new Wheel(2,"b"));
//    	wlist.add(w1);
//    	
//    	//il est possible d'ajouter qu'à la suite.
//    	//il n'est pas possible de faire de saut de cellule.
//    	wlist.add(3, new Wheel(4,"h"));
//    	wlist.add(4, new Wheel(4,"h"));
//    	
//    	//pour recuperer un element d'une liste.
//    	wlist.get(0).print();
//
//    	//permet d'afficher toutes les roues
//    	wlist.forEach(value -> value.print());
//    	
//    	//en redefinissant la fonction toString dans la classe Wheel,
//    	//nous pouvons maintenant afficher le contenue de la liste de roue facilement.
//    	System.out.println(wlist.toString());
//    	
//    	Set<Wheel> wset = new HashSet<>();
//    	
//    	Wheel w2 = new Wheel(1,"c");
//
//    	wset.add(w2);
//    	wset.add(new Wheel(2,"b"));
//    	wset.add(new Wheel(3,"c"));
//    	//Il n'est pas possible d'ajouter 2 fois w2 dans un Set.
//    	wset.add(w2);
//    	
//    	System.out.println(wset.toString());
//    	
//    	List<Location> L = new ArrayList<>();
//    	L.addAll(new Location(10,10).allPos(10, 10));
//    	System.out.println(L.toString());
//    	
//    	List<Robot> r = new ArrayList<>();
//    	r.add(new Robot("tommy"));
//    	List<Location> l = new ArrayList<>();
//    	l.add(new Location(0,5));
//    	World w = new World();
//    	w.addRobot("Tommy");
//    	w.display();
//    	System.out.println(w.getFreeLocations());
//    	
// 
    	
    }
}
