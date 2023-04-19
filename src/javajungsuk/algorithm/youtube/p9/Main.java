package javajungsuk.algorithm.youtube.p9;

/**
 * 각 자릿수 합 구하기 - 입력된 수의 각 자릿 수 합을 구하시오.
 */
public class Main {
    public static void main(String[] args) {
        int inputNum = 1232;
        int accSum = 0;

        //1232 => 123 => 12 => 1 => 0
        //2         3      2    1   => 8
        while (inputNum>0){
            accSum += inputNum % 10;
            inputNum /= 10;
        }
        System.out.println(accSum);




    }
}
