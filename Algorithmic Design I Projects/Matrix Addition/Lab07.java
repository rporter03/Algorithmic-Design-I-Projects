import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {

		// Robert Porter
		
		Scanner input = new Scanner(System.in);
		
		boolean match = false;
		int mat2_rows;
		int mat2_cols;
		
		// create matrix 1 from user input
		System.out.println("Enter the number of rows in matrix 1: ");
		int mat1_rows = input.nextInt();
		System.out.println("Enter the number of columns in matrix 1: ");
		int mat1_cols = input.nextInt();
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		
		// if matrix 2 rows/columns dont match those of matrix 1, then tell user to re-enter values until they match
		do
		{
		System.out.println("Enter the number of rows in matrix 2: ");
		mat2_rows = input.nextInt();
		
		System.out.println("Enter the number of columns in matrix 2: ");
		mat2_cols = input.nextInt();
		
		if(mat1_rows != mat2_rows || mat1_cols != mat2_cols)
		{
			System.out.println("Dimension mismatch! Re-enter the dimensions for matrix 2 to match dimensions of matrix 1.");
		}
		
		else
		{
			match = true;
		}
		}while(match == false);

		// create matrix 2
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		// collect values of matrix 1
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat1_cols; j++)
			{
				System.out.println("Enter the value of matrix 1 at position (" +i +"," +j +"):");
				matrix1[i][j] = input.nextInt();
			}
		}
		
		// collect values of matrix 2
		for(int i = 0; i < mat2_rows; i++)
		{
			for(int j = 0; j < mat2_cols; j++)
			{
				System.out.println("Enter the value of matrix 2 at position (" +i +"," +j +"):");
				matrix2[i][j] = input.nextInt();
			}
		}
		
		// matrix addition
		int[][] productMatrix = new int[mat1_rows][mat1_cols];
		
		for(int i = 0; i < mat1_rows; i++)
		{
			for(int j = 0; j < mat1_cols; j++)
			{
				productMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		// output first matrix, second matrix, and product matrix
		
		// first matrix
		for(int i = 0; i < matrix1.length; i++)
		{
			for(int j = 0; j < matrix1[i].length; j++)
			{
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("+");
		
		// second matrix
		for(int i = 0; i < matrix2.length; i++)
		{
			for(int j = 0; j < matrix2[i].length; j++)
			{
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=");
		
		// product matrix
		for(int i = 0; i < productMatrix.length; i++)
		{
			for(int j = 0; j < productMatrix[i].length; j++)
			{
				System.out.print(productMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
