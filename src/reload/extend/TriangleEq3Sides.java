package reload.extend;

import reload.models.Triangle;

public class TriangleEq3Sides extends Triangle {

	public TriangleEq3Sides(double a) {
		super(a, a, a);
	}

	@Override
	public double getPerim() {
		return 3*a;
	}

	@Override
	public double getSquare() {
		return Math.sqrt(getPerim()/2*(getPerim()-a)*(getPerim()-a)*(getPerim()-a));
	}
	
}
