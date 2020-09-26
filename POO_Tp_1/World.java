import java.util.*;
import java.util.Map.Entry;


public class World {
	
	//Constantes
	private final static int MAP_SIZE = 10;
	
	//attributs
	private Map<Robot,Location> robots = new HashMap<>();
	private final static List<Location> allPos = Location.allPos(MAP_SIZE);
	private List<Location> freePos = allPos;	
	
	
	//methodes
	public static Location pickRandomLocation() {
		Random rand = new Random();
		return allPos.get(rand.nextInt(MAP_SIZE*MAP_SIZE));
	}	
	
	//localise le robot r
	public Location locate(Robot r) {
		return this.robots.get(r);
	}
	
	//renvoie vrai s'il y a un robot sur la case l, faux sinon
	public boolean hasRobotAtLocation(Location l) {
		if(this.freePos.contains(l)) {
			return false;
		}
		else return true;
	}
	//tue le robot r
	public void killRobot(Robot r) {
		this.freePos.add(robots.get(r));
		this.robots.remove(r);
	}
	
	//ajoute le rebot name
	public void addRobot(String name) {
		Robot r = new Robot(name);
		Location l = pickRandomLocation();
		if(hasRobotAtLocation(l)) {
			 for(Entry<Robot, Location> val : this.robots.entrySet())
	            {
	                Robot key = val.getKey();
	                Location value = val.getValue();

	                if(value == l)
	                {
	                    killRobot(key);
	                    break;
	                }

	            }
		}
		this.robots.put(r, l);
		this.freePos.remove(l);
	}

   //bouge un robot aleatoirement
   public void moveRobot()
    {
        Random rand = new Random();
        int r_s = robots.size();
        int r_r = rand.nextInt(r_s);
        int i = 0;

        for(Entry<Robot, Location> e : robots.entrySet())
        {
            if(i == r_r)
            {
                Robot key = e.getKey();
                robots.remove(key);
                this.addRobot(key.toString());
                break;
            }

            else
                i++;
        }
    }
   //affiche le jeu 
   public void display()
   {
       for(Entry<Robot, Location> e : robots.entrySet())
       {
           Robot key = e.getKey();
           Location value = e.getValue();

           System.out.println("Robot: " + key + " | Position: " + value);
       }
   }
   public List<Location> getFreeLocations(){
	   return this.freePos;
   }

   
   
}
