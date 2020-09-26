import java.util.List;

public class Location {
	
	//attributs
	public final int X;
	public final int Y;
	
	//Constructeur
	public Location(int x, int y) {
		this.X = x;
		this.Y = y;
	}
	
	public static List<Location> allPos(int x, int y){
		List<Location> res = null;
		for(int i = 0; i < x ; i++) {
			for(int j = 0 ; j < y ; j++ ) {
				res.add(new Location(i,j));
			}
		}
		return res;
		
	}
}
