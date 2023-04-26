public class d8 {
    public static void main(String[] args) {
        int[][] duzensizDizi3 = new int[][] { { 11 }, { 21, 22, 23 }, { 31, 32 } };

        for (int i = 0; i < duzensizDizi3.length; i++) {
            for (int j = 0; j < duzensizDizi3[i].length; j++) {
                System.out.print(duzensizDizi3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
