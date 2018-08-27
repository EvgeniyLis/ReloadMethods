package reload.functins;

public class MultiTriangle {
	private String name;
	private int a;
	private int b;
	private int c;
	private double h;
	private double R;
	private double alpha;
	SquareTriangles st=new SquareTriangles();
	public MultiTriangle(String name, int a, int b, int c) { // площадь по трем сторонам - ф-ла Герона
		super();
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public MultiTriangle(String name, int a, double h) { //по стороне и высоте
		super();
		this.name = name;
		this.a = a;
		this.h = h;
	}
	public MultiTriangle(String name, int a, int b, double alpha) { //по двум сторонам и углу между ними
		super();
		this.name = name;
		this.a = a;
		this.b = b;
		this.alpha = alpha;
	}
	public MultiTriangle(String name, int a, int b) { //по двум катетам прямоуг. треуг.
		super();
		this.name = name;
		this.a = a;
		this.b = b;
	}
	public MultiTriangle(String name, int a) { // по стороне равностороннего треуг
		super();
		this.name = name;
		this.a = a;
	}
	public MultiTriangle(String name, double r) { // по радиусу описаной окруж.
		super();
		this.name = name;
		R = r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	public double getAlpha() {
		return alpha;
	}
	public void setAlpha(double alpha) {
		this.alpha = alpha;
	}
	public double getSquare() {
		switch (name) {
		case "Different sides":
			return st.getSquare(a, b, c);
		case "Diff sides and height":
			return st.getSquare(a, alpha);
		case "Diff sides and corner between":
			return st.getSquare(a, b, alpha);
		case "Rect triangle":
			return st.getSquare(a, b);
		case "Equal sides triangle":
			return st.getSquare(a);
		case "Triangle with circle":
			return st.getSquare(R);
			default: return 0;
		}
	}
	@Override
	public String toString() {
		return "MultiTriangle [name=" + name + ", getSquare()=" + getSquare() + "]";
	}
	
}
