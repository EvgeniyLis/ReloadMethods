package reload.extend;

import reload.models.Triangle;

public class TriangleEq2Sides extends Triangle {

	public TriangleEq2Sides(double a, double b) {
		super(a, b, b); //переопределили конструктор с 3-х на 2 стороны
	}

	@Override
	public double getPerim() {
		//return getA()+2*getB();
		return a+2*b;
	}

	@Override
	public double getSquare() {
		return Math.sqrt(getPerim()/2*(getPerim()-a)*(getPerim()-b)*(getPerim()-b));
	}
	
	
}
