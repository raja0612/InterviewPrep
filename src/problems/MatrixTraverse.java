package problems;

public class MatrixTraverse {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Given Matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\n Given Matrix with 4 neighbours: ");
        //element (top,right,bottom, left)
        // 1(-1, 2, 5, -1) 2(-1, 3, 6, 1)
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int top = getTop(i, j, matrix, rows, cols);
                int bottom = getBottom(i, j, matrix, rows, cols);
                int left = getLeft(i, j, matrix, rows, cols);
                int right = getRight(i, j, matrix, rows, cols);

                System.out.print(matrix[i][j]+"("+top +","+right +"," +bottom +","+left + ") ");
            }
            System.out.println();
        }


        System.out.println("\n Given Matrix with 8 neighbours: ");
        //element (top, topright, right, rightbottom, bottom, bottomleft,  left, topleft)
        // 1(no, no, 2, 6, 5, no, no, no)

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int top = getTop(i, j, matrix, rows, cols);
                int topRight = getTopRight(i, j, matrix, rows, cols);
                int right = getRight(i, j, matrix, rows, cols);
                int rightBottom = getRightBottom(i, j, matrix, rows, cols);
                int bottom = getBottom(i, j, matrix, rows, cols);
                int bottomLeft = getBottomLeft(i, j, matrix, rows, cols);
                int left = getLeft(i, j, matrix, rows, cols);
                int leftTop = getLeftTop(i, j, matrix, rows, cols);
                System.out.print(matrix[i][j]+"("+top +","+topRight+","+right +"," +rightBottom +","+bottom
                        + ","+bottomLeft+ ","+left+ ","+leftTop+ ") ");
            }
            System.out.println();
        }

    }

    private static int getTop(int i, int j, int[][] matrix, int rows, int cols) {
        int topRow = i-1;
        int topCol = j;
        if(topRow >=0 && topRow < rows && topCol >= 0  && topCol < cols){
            return matrix[topRow][topCol];
        }
        return -1;
    }

    private static int getTopRight(int i, int j, int[][] matrix, int rows, int cols) {
        int topRow = i-1;
        int topCol = j+1;
        if(topRow >=0 && topRow < rows && topCol >= 0  && topCol < cols){
            return matrix[topRow][topCol];
        }
        return -1;
    }

    private static int getRight(int i, int j, int[][] matrix, int rows, int cols) {
        int row = i;
        int rightCol = j+1;
        if(row >=0 && row < rows && rightCol >= 0  && rightCol < cols){
            return matrix[row][rightCol];
        }
        return -1;
    }

    private static int getRightBottom(int i, int j, int[][] matrix, int rows, int cols) {
        int row = i+1;
        int rightCol = j+1;
        if(row >=0 && row < rows && rightCol >= 0  && rightCol < cols){
            return matrix[row][rightCol];
        }
        return -1;
    }

    private static int getBottom(int i, int j, int[][] matrix, int rows, int cols) {
        int bottomRow = i+1;
        int col = j;
        if(bottomRow >=0 && bottomRow < rows && col >= 0  && col < cols){
            return matrix[bottomRow][col];
        }
        return -1;
    }

    private static int getBottomLeft(int i, int j, int[][] matrix, int rows, int cols) {
        int bottomRow = i+1;
        int col = j-1;
        if(bottomRow >=0 && bottomRow < rows && col >= 0  && col < cols){
            return matrix[bottomRow][col];
        }
        return -1;
    }

    private static int getLeft(int i, int j, int[][] matrix, int rows, int cols) {
        int row = i;
        int leftCol = j-1;
        if(row >=0 && row < rows && leftCol >= 0  && leftCol < cols){
            return matrix[row][leftCol];
        }
        return -1;
    }
    private static int getLeftTop(int i, int j, int[][] matrix, int rows, int cols) {
        int row = i-1;
        int leftCol = j-1;
        if(row >=0 && row < rows && leftCol >= 0  && leftCol < cols){
            return matrix[row][leftCol];
        }
        return -1;
    }


}
