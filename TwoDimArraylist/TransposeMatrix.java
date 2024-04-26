package TwoDimArraylist;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr= {{45,33,67,85},{34,67,98,23},{34,22,46,98}};
        int[][] arr1 = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr1[1].length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }

    }
}

