package udemy;

public class Shape {
	
	int length;
	int wedth ;
 public int area (){
	int area = getArea (length*wedth);
	return area;
}

	private int getArea(int i) {
	// TODO Auto-generated method stub
	return 0;
}

	public static int getArea(int l, int w) {
	int area = l*w;
	return area;
}

	public static void main(String[] args, int lenght) {
		Shape s = new Shape ();
		s.length = 10;
		s.wedth = 5;
	System.out.println( s.area());
	}

}
