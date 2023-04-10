package javajungsuk.algorithm.youtube.p2;
//3번째 방법 (재귀)
public class fibonacci {

    //피보나피 수열 재귀함수
    public static int fibo(int num){
        if (num == 1){
           return  1;
        } else if (num == 2) {
            return 1;
        } else {
            return fibo(num-1) + fibo(num-2);
        }
    }

    //재귀함수 2
//    public static int fibo(int num) {
//        if (num == 0 || num == 1)
//            return num;
//        else
//            return fibo(num - 1) + fibo(num - 2);
//    }


    //피보나치 수열 반복함수

//    public static int fibo(int num){
//        int one = 1;
//        int two = 1;
//        int result = -1;
//        if (num == 1){
//            return one;
//        } else if (num == 2) {
//            return two;
//        }else {
//            for (int i = 2; i < num; i++) {
//                result = one + two;
//                one = two;
//                two = result;
//            }
//        }return result;
//    }

    public static void main(String[] args) {
        System.out.println("피보나치 수열의 10번 쨰 원소는 " + fibo(10) + "입니다.");
    }
}
