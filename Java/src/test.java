import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        int[][] numbers =  {{44, 45, 16, 50},
                {16, 12, 66, 9},
                {52, 83, 3, 37},
                {56, 61, 69, 61}};
        test test1 = new test();
        test1.twoDimensions(numbers);
    }

    public  void twoDimensions(int[][] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers[i].length - 1; j++){
                if (numbers[i][j] < numbers[i][j + 1]){
                    numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
                    numbers[i + 1][j] = numbers[i + 1][j] / 2;
                }
            }
        }
        System.out.println();
    }
}