import java.util.Scanner;

public class arrayQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // java program to add two matrices
        // input dimensions;
        System.out.print("Enter number of rows");
        int row = sc.nextInt();
        System.out.print("Enter number of columns");
        int col = sc.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result = new int[row][col];

        // Input elements of the first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input elements of the second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Add matrices
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        ;

        // to print all the bordered element form the given matrix;

        System.out.print("Enter number of row");
        int row = sc.nextInt();
        System.out.print("Enter number of column");
        int col = sc.nextInt();

        // initialize elements in the matrix;
        int[][] matrix = new int[row][col];

        // input elements in the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // displaying the bordered elements;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // conditions
                if (i == 0 || i == row - 1 || j == 0 || j == col - 1) {
                    System.out.print(matrix[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // transpose of matrix;
        /*
         * System.out.print("Enter size of the matrix");
         * int size = sc.nextInt();
         * 
         * //initialize the matrix;
         * int[][] matrix = new int[size][size];
         * 
         * //input the elements into matrix;
         * for (int i = 0; i < size; i++) {
         * for (int j = 0; j < size; j++) {
         * System.out.print("Element [" + i + "] [" + j + "]: ");
         * matrix[i][j] = sc.nextInt();
         * }
         * }
         * 
         * System.out.println("Original matrix: ");
         * //displaying the original matrx;
         * for (int i = 0; i < size; i++) {
         * for (int j = 0; j < size; j++) {
         * System.out.print(matrix[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * System.out.println("The Transpose is: ");
         * //transpose;
         * for (int i = 0; i < size; i++) {
         * for (int j = 0; j < size; j++) {
         * System.out.print(matrix[j][i] + " ");
         * }
         * System.out.println();
         * }
         */

        // sum of diognals;
        /*
         * int n = sc.nextInt();
         * 
         * int[][] matrix = new int[n][n];
         * 
         * //input elements in the matrix;
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * System.out.println("Elements [" + i + "][" + j + "]: ");
         * matrix[i][j] = sc.nextInt();
         * }
         * }
         * 
         * //display the matrix;
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < n; j++) {
         * System.out.print(matrix[i][j] + " ");
         * }
         * System.out.println();
         * }
         * 
         * //diognalSums;
         * int Diognal1 = 0;
         * int Diognal2 = 0;
         * for (int i = 0; i < n; i++) {
         * Diognal1 += matrix[i][i];
         * Diognal2 += matrix[i][n - i - 1];
         * }
         * 
         * //display result;
         * System.out.println("Sum of First Diognal: " + Diognal1);
         * System.out.println("Sum of second Diognal: " + Diognal2);
         */

        // program to find out largets element in matrix;
        // Input dimensions of the matrix
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int cols = sc.nextInt();

        // Initialize matrix
        int[][] matrix = new int[rows][cols];

        // Input elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Find the largest element in the matrix
        int largest = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        // Display the largest element
        System.out.println("The largest element in the matrix is: " + largest);

    }
}