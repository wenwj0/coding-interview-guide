package chapter08_ArraysAndMatrices;

public class Subject01_SpiralOrderPrint {
    //book answer
    public void spiralOrderPrint(int[][] matrix){
        int tR=0,tC=0;
        int dR=matrix.length-1;
        int dC = matrix[0].length-1;
        while(tR<=dR && tC<dC){
            printEdge(matrix,tR++,dR--,tC++,dC--);
        }
    }
    public void printEdge(int[][] m, int tR, int dR, int tC, int dC){
        if(tR==dR){
            for(int i=tC;i<=dC;i++){
                System.out.print(m[tR][i]+" ");
            }
        }else if(tC==dC){
            for(int i=tR;i<=dR;i++){
                System.out.print(m[i][tC]+" ");
            }
        }else {
            int curC = tC;
            int curR = tR;
            while(curC!=dC){
                System.out.print(m[tR][curC]+" ");
                curC++;
            }
            while(curR!=dR){
                System.out.print(m[curR][dC]+" ");
                curR++;
            }
            while(curC!=tC){
                System.out.print(m[dR][curC]+" ");
                curC--;
            }
            while(curR!=tR){
                System.out.print(m[curR][tC]+" ");
                curR--;
            }
        }
    }
    //my answer
    public void spiralOrderPrint0(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length-1;
        int l = 0, i;
        int len = matrix.length * matrix[0].length;
        while (l < len) {
            for (i = left; l < len && i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
                l++;
            }
            top++;
            for (i = top; l < len && i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
                l++;
            }
            right--;
            for (i = right; l < len && i >= left; i--) {
                System.out.print(matrix[bottom][i] + " ");
                l++;
            }
            bottom--;
            for (i = bottom; l < len && i >= top; i--) {
                System.out.print(matrix[i][left] + " ");
                l++;
            }
            left++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix= new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        new Subject01_SpiralOrderPrint().spiralOrderPrint(matrix);
    }
}
