package javajungsuk.ch5;

import java.util.Arrays;

    /**
     * 배열의 길이
     * 배열 이름.length (int형 상수)
     * 배열은 한번 생성하면 그 길이를 바꿀 수 없음.
     */
public class Ch5_2 {
    public static void main(String[] args) {

        int[] arr = new int[10]; // 길이가 5인 int 배열 arr을 생성
        System.out.println("arr.length = " + arr.length);

        //length를 사용해 배열의 모든 요소(길이) 출력
        for(int i=0; i<arr.length; i++){
            System.out.println("arr["+ i + "] = " + arr[i]);
        }

        /**
         * 배열의 초기화
         * 배열의 각 요소에 처음으로 값을 저장하는 것
         */
        int[] score = {30, 40, 50, 60, 70};
        System.out.println("score[3] = " + score[3]);

        /**
         * 배열의 출력
         * Arrays.tostring (배열의 모든 요소를 문자열로 출력)
         */

        int iArr[] = {100, 90, 80, 70, 60};

        //주소 출력 [I@1b6d3586
        System.out.println(iArr);

        //반복문 사용
        for (int i = 0; i<iArr.length; i++) {
            System.out.println(iArr[i]);
        }

        //Arrays.tostring 사용 (배열의 모든 요소를 문자열로 출력) [100, 90, 80, 70, 60]
            System.out.println(Arrays.toString(iArr));
    }
}
