public class Transpose {
    public static void main(String[] args) {
        int[][] array1 = {
                {1,2,3,4,5,6},
                {5,6,12,18,23,42},
                {2,4,8,16,32,64}
        };
        int[][] transarray1 = new int[array1[0].length][array1.length];

        for (int i=0;i<array1.length;i++){
            for (int j=0;j< array1[0].length;j++){
               transarray1[j][i]=array1[i][j];
           }
        }
        for (int i=0;i<transarray1.length;i++){
            for (int j=0;j< transarray1[0].length;j++){
                System.out.print(transarray1[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
