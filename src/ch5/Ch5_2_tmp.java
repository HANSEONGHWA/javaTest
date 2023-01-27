package ch5;

import java.util.Arrays;

public class Ch5_2_tmp {

    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 90, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        /**
         * 1~10의 숫자를 순서대로 배열하기
         */
        for (int i=0; i<iArr1.length; i++) {
            iArr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(iArr1));

        /**
         * 1~10 사이의 숫자를 랜덤으로 출력하기
         */
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(iArr2));

        /**
         * 배열에 저장된 값에 "," 찍어 출력하기
         */

        for (int i = 0; i < iArr1.length; i++) {
            System.out.println(iArr1[i] + ",");
        }

        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}
