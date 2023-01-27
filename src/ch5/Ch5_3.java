package ch5;

/**
 * 배열의 활용
 * 총합과 평균
 */
public class Ch5_3 {
    public static void main(String[] args) {
        int sum = 0;       //총합을 저장하기 위한 변수
        float average = 0f; //평균울 저장하기 위한 변수

        int[] score = {50, 40, 98, 70, 80};

        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 반복문을 이용해 배열에 있는 값을 모두 더함.
        }

        average = sum / (float)score.length; //소수점까지 결과를 얻기 위해 형변환

        System.out.println("총합:" + sum);
        System.out.println("평균:" + average);
    }
}
