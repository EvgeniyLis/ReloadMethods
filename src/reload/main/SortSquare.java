package reload.main;

import java.util.Scanner;

import reload.functins.MultiTriangle;

public class SortSquare {

	//дан масссив, кот. содержит по 2 треуг. каждого типа из класса MultiTriangle
	//отсортировать треуг. по площади
	
	public static void main(String[] args) {
		MultiTriangle[] triangles;
		MultiTriangle temp;
		final int LENGTH=12; // объ€вление константы
		triangles=new MultiTriangle[LENGTH];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter three different sides of triangle");
		triangles[0]=new MultiTriangle("Different sides", input.nextInt(), input.nextInt(), input.nextInt());
		triangles[1]=new MultiTriangle("Different sides", input.nextInt(), input.nextInt(), input.nextInt());
		System.out.println("Enter two triangles with different sides and height");
		triangles[2]=new MultiTriangle("Diff sides and height", input.nextInt(), input.nextDouble());
		triangles[3]=new MultiTriangle("Diff sides and height", input.nextInt(), input.nextDouble());
		System.out.println("Enter Triangles with two sides ond corner between");
		triangles[4]=new MultiTriangle("Diff sides and corner between", input.nextInt(), input.nextInt(), input.nextDouble());
		triangles[5]=new MultiTriangle("Diff sides and corner between", input.nextInt(), input.nextInt(), input.nextDouble());
		System.out.println("Enter sides of rect triangle");
		triangles[6]=new MultiTriangle("Rect triangle", input.nextInt(), input.nextInt());
		triangles[7]=new MultiTriangle("Rect triangle", input.nextInt(), input.nextInt());
		System.out.println("Enter triangles with equal sides");
		triangles[8]=new MultiTriangle("Equal sides triangle", input.nextInt());
		triangles[9]=new MultiTriangle("Equal sides triangle", input.nextInt());
		System.out.println("Enter Radius of circle or triangle");
		triangles[10]=new MultiTriangle("Triangle with circle", input.nextDouble());
		triangles[11]=new MultiTriangle("Triangle with circle", input.nextDouble());
		System.out.println("Triangles before sorting :");
		outArray(triangles);
		for (int border = 0; border < triangles.length-1; border++) {
			for (int i = 0; i < triangles.length-border-1; i++) {
				if (triangles[i].getSquare()>triangles[i+1].getSquare()) {
					temp=triangles[i];
					triangles[i]=triangles[i+1];
					triangles[i+1]=temp;
				}
			}
		}
		System.out.println("Triangles after sorting is :");
		outArray(triangles);
	}
	public static void outArray(MultiTriangle[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
