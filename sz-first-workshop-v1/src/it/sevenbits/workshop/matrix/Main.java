package it.sevenbits.workshop.matrix;

public class Main {
	public static void main(String[] args) {
		Matrix matrix = new Matrix(3, 4);
		System.out.println(matrix.toString());
		
		matrix.inverseMatrix();
		System.out.println(matrix);
	}
}
