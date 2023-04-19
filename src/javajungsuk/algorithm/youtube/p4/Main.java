package javajungsuk.algorithm.youtube.p4;
/**
 * 10진수를 2진수로 변환하기
 */

public class Main {
    public static void main(String[] args) {
        int inputNum = 19;
        int[] bin = new int[100]; //2진수 값 저장 용도

        int i = 0;  //bin 배열의 index를 확인하기 위한 변수
        int mok = inputNum;

        while (mok > 0){
            bin[i] = mok % 2; // mok을 2로 나눈 나머지를 저장
            mok /= 2;   // mok을 2로 나눔
            i++;    //bin의 인덱스를 올려서 저장
        }
            i--;  //index가 하나 더 올라갔기 때문에 빼줌.  

        for (; i >= 0; i--) {
            System.out.print(bin[i]);
        }
    }
}
