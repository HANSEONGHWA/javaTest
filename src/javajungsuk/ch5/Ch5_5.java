package javajungsuk.ch5;

import java.util.Arrays;


/**
 * 배열의 활용
 * 배열의 순서 섞기
 */
public class Ch5_5 {
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < 100; i++) {
            int n = (int) (Math.random() * 10); // 랜덤 숫자 n
            int tmp = num[0]; //index 0에 저장되어 있는 수
            num[0] = num[n]; // 변수 값 바꾸기
            num[n] = tmp;
        }
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            int n = (int) (Math.random()*10); // 랜덤 숫자 n,
            int tmp = num[i];                 // 임의의 인텍스 숫자 i를 tmp에 저장
            num[i] = num[n];                  // 변수 값 바꾸기
            num[n] = tmp;
        }
        System.out.println(Arrays.toString(num));
    }
}
