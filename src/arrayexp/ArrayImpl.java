package arrayexp;

public class ArrayImpl {
    public static void main(String[] args) {
        int[] X = {1,3,5,7};
        int[][] Y = {
                        {1,2,3},
                        {2},
                        {1}
                    };
        int[][][] Z = {
                        {
                            {1,6,3}
                        },
                        {
                            {2,12,22},
                            {5,45,8},
                            {9}
                        },
                        {
                            {1}
                        }
                    };
        int a = Z[1][0][0];
        System.out.println(a);
    }
}
