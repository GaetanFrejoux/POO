import java.lang.Math;

public class Polynomial{

    //attribut
    private final int[] COEFFS;

    //constructeur
    public Polynomial(int[] coeffs){
	this.COEFFS = coeffs;
    }

    //methods
    public int getDegre(){
	return this.COEFFS.length-1;
    }

    /*
      public Polynomial createPolynomial(Polynomial p1, Polynomial p2){
      if(p1.getDegree<p2.getDegree){
      return createPolynomial(p2,p1);
      }
      else{
      }
      }
    */
    public double eval(double value){
	int len = this.getDegre();
	int res = 0;
	for(int i= 0 ; i<=len ; i++){
	    res += this.COEFFS[i]*Math.pow(value,i);
	}
	return res;
    }
}
