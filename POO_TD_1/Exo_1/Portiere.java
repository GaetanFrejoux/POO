

public class Portiere{

    //attributs
    private boolean open;
    private boolean lock;


    //Constructeur par defaut
    public Portiere(){
	open = false;
	lock = false;
    }

    public void open(){
	if(!(this.lock)){
	    this.open = true;
	}
    }
    public void close(){
	this.open = false;
    }
    
    public void lock(){
	if(!(this.open)){
	    this.lock = false;
	}
    }
    
    public void unlock(){
	this.lock = true;
    }
    
    public boolean isOpen(){
	return this.open;
    }
    
    public boolean isLock(){
	return this.lock;
	
    }
}
