import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] result = new int[2][2];

        
        System.out.println("Enter elements of first 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("Enter elements of second 2x2 matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nSelect Operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        System.out.println("3. Transpose of Matrices");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Addition
                System.out.println("\nMatrix Addition:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2: // Multiplication
                System.out.println("\nMatrix Multiplication:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3: // Transpose
                System.out.println("\nTranspose of first matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrix1[j][i] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nTranspose of second matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(matrix2[j][i] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
