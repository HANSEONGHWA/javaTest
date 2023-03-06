package ch5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 2차원 배열 예제 (총점, 평균 구하기)
 * 형병환 잊지 않기
 */
public class Ch5_10 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 95, 46},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40}
        };

        int kor = 0;
        int eng = 0;
        int math = 0;

        System.out.println("번호  국어  영어  수학  합계  평균");
        System.out.println("======================================");
        for (int i = 0; i < score.length; i++) {

            int sum = 0;
            float avg = 0.0f;

            /**
             * 과목별 총점
             */
            // 아래에 쓰면 합계가 누적됨.
            kor += score[i][0];
            eng += score[i][1];
            math += score[i][2];
            System.out.printf("%d", i+1);

            for (int j = 0; j < score[i].length; j++) {
                /**
                 * 합계 구하기
                 */
                sum += score[i][j];
                //과목별 점수 출력
                System.out.printf("%5d",score[i][j]);
            }

            /**
             * 평균 구하기
             */
            avg = sum/ (float)score[i].length;
            System.out.printf("%5d %5.1f%n", sum, avg);
        }

        System.out.println("=============================");
        System.out.printf("총점: %4d %4d %4d", kor, eng, math);

    }

}
