package reload.functins;

public class SquareTriangles {
	public int getPerim(int a, int b, int c) {
		return a+b+c;
	}
	public double getSquare(int a, int b, int c) {
		double p=getPerim(a,b,c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double getSquare(int a, double h) {
		return (a*h)/2;
	}
	public double getSquare(int a, int b, double alpha) {
		return (a*b*Math.sin(alpha))/2;
	}
	public double getSquare(int a, int b) {
		return (a*b)/2;
	}
	public double getSquare(int a) {
		return Math.sqrt(3)/4*a*a;
	}
	public double getSquare(double R) {
		return 3*Math.sqrt(3)/4*R*R;
	}
}
