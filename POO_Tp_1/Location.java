import java.util.*;

public class Location {
	
	//attributs
	public final int X;
	public final int Y;
	
	//Constructeur
	public Location(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	public static List<Location> allPos(int size){
		List<Location> res = new ArrayList<>();
		for(int i = 0; i < size ; i++) {
			for(int j = 0 ; j < size ; j++ ) {
				res.add(new Location(i,j));
			}
		}
		return res;
		
	}
	public String toString() {
		return "(" + this.X + "," + this.Y + ")";
	}
	
}
