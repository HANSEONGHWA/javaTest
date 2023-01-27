package ch5;

/**
 * 배열의 활용
 * 최대값과 최소값 구하기
 */
public class Ch5_4 {
    public static void main(String[] args) {

        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            if(max < score[i]){
                 max= score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}
