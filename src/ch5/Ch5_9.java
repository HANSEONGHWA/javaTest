package ch5;

/**
 * 2차원 배열

 */
public class Ch5_9 {

    //2차원 배열의 초기화
    int[][] arr = {
                    {1,2,3},
                    {4,5,6}
                 };

    //2차원 배열의 예제
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };
        int sum = 0;

        for(int i=0; i<score.length; i++){
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);

                sum += score[i][j];
            }
        }

        System.out.println("sum=" + sum);

    }
}