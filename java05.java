class CCount{
	static int cnt = 0;
	public CCount(){
		cnt ++;
	}
	public void count() {
		System.out.println(cnt + "object created");	
	}
	void setZero() {
		cnt = 0;
	}
	void Value(int x) {
		cnt = x;
	}
}
public class ch9_5 {

	public static void main(String[] args) {
		CCount a = new CCount();
		a.count();
		a.setZero();
		a.Value(10);
		CCount b = new CCount();
		b.count();
		CCount c = new CCount();
		c.count();

	}

}
