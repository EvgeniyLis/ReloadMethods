package reload.models;


public class Triangle {
		protected double a;
		protected double b;
		protected double c;
		
		
		public Triangle(double a, double b, double c) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
		}
		

		public double getA() {
			return a;
		}


		public void setA(double a) {
			this.a = a;
		}


		public double getB() {
			return b;
		}


		public void setB(double b) {
			this.b = b;
		}


		public double getC() {
			return c;
		}


		public void setC(double c) {
			this.c = c;
		}



		public double getPerim() {
			return a+b+c;
		}


		public double getSquare() {
			return Math.sqrt(getPerim()/2*(getPerim()-a)*(getPerim()-b)*(getPerim()-c));

		}
		
}
