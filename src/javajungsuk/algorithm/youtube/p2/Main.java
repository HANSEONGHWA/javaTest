package javajungsuk.algorithm.youtube.p2;

/**
 * 피보나치 수열
 * An = A(n-1) + A(n-2);
 * 피보나치수열은 해당 수열의 항의 앞의 두자리 값의 합과 동일함.
 */
public class Main {
    public static void main(String[] args) {

        //배열 생성
        int[] arr = new int[100];

        //ex) 1 1 2 3 5 8 13 .....
        //0번째와 1번째 배열을 1로 초기화
        arr[0] = 1;
        arr[1] = 1;

        //for문을 배열의 2번째 부터 시작
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }

        for (int i = 0; i < 10; i++){
            System.out.println(arr[i]+"");
        }

    }
}
