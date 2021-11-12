class CRectangle{
	int width;
	int height;
	
	public CRectangle(int w,int h) {
		width = w;
		height = h;
	}
	public CRectangle() {
		this (10,8);
		int width;
		int height;
	}
	public void show() {
		System.out.println("width = "+width);
		System.out.println("height = "+height);
	}
}
public class ch9_1 {
	public static void main(String[] args) {
		
		CRectangle a = new CRectangle();
		a.show();

	}
}
