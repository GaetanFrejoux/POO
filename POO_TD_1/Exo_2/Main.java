public class Main{
    public static void main(String[] args){
	int[] v = {1,3,5};
	Polynomial p1 = new Polynomial(v);
	System.out.println(p1.eval(2));
    }
}
