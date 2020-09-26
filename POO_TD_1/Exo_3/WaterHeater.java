public class WaterHeater{
    //Constantes
    private final int MAX_TEMP = 80;
    private final int DEFAULT_TEMP = 15;
    private final int DEFAULT_CAP = 200;

    //Attributs
    private final int CAP;
    private int vol;
    private int temp;

    //Constructeur

    public WaterHeater(int capacity){
	this.CAP=capacity;
	this.vol=capacity/2;
	this.temp=WaterHeater.DEFAULT_TEMP;
    }

     public WaterHeater(){
	 this(WatherHeater.DEFAULT_CAP);
     }

    public heat(){
	if(WaterHeater.MAX_TEMP-5>=this.temp){
	    this.temp+=5;
	}
    }
}
