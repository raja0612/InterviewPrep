package problems;

public class MatrixTraverse2 {

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

        //element (top, topright, right, rightbottom, bottom, bottomleft,  left, topleft)
        // 1(no, no, 2, 6, 5, no, no, no)

        int[][] directions =  {{-1,0}, {-1, 1}, {0,1},{1, 1}, {1,0},{1, -1}, {0, -1}, {-1, -1}};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                System.out.print(matrix[i][j]+" (");
                for(int[] d: directions){
                    int newI = i+d[0];
                    int newJ = j+d[1];
                    if(newI >=0 && newI < rows && newJ >= 0  && newJ < cols ){
                        System.out.print(matrix[newI][newJ]+" ");
                    }
                    else{
                        System.out.print("null ");
                    }
                }
                System.out.print(") ");
            }
            System.out.println();
        }
        //element (top, topright, right, rightbottom, bottom, bottomleft,  left, topleft)

        //int[][] directions8 = {{-1,0}, {-1, 1}, {0,1},{1, 1}, {1,0},{-1, 1}, {0, -1}, {-1, -1}};

    }
}
