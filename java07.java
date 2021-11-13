class a1{
	int x;
	int n;
	void power(int x,int n){
		double a = Math.pow(x, n);
		System.out.println(a);
	}
}
public class ch9_7 {

	public static void main(String[] args) {
		a1 a = new a1();
		a1 b = new a1();

		a.power(2,5);
		b.power(3,2);

	}

}
