package javajungsuk.ch5;

import java.util.Arrays;

/**
 * 배열의 활용
 * 로또 번호 만들기
 */
public class Ch5_6 {
    public static void main(String[] args) {

        // 45개의 배열 생성
        int[] ball = new int[45];
        //1~45까지의 값을 저장
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        System.out.println(Arrays.toString(ball));

        int j;
        int tmp;
        //배열의 i번째 요소와 임의의 요소에 저장된 값을 바꿔 섞는다.
        //배열의 0번째부터 5번째 요소까지 모두 6개의 수만 바꾼다.
        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        System.out.println(Arrays.toString(ball));

        //배열 ball의 앞의 6개의 요소 출력
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i , ball[i]);
//            System.out.println("ball["+i+"]= " + ball[i]);
        }
    }
}
