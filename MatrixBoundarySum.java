public class MatrixBoundarySum {

    public static void main(String[] args) {

        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int sum = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {

                if(i == 0 || i == 2 || j == 0 || j == 2)
                    sum += arr[i][j];
            }
        }

        System.out.println("Boundary sum = " + sum);
    }
}
