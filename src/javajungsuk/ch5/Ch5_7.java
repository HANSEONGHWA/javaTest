package javajungsuk.ch5;

import java.util.Arrays;

/**
 * String 배열
 */
public class Ch5_7 {
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));


        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(strArr[tmp]);
        }



    }
}
