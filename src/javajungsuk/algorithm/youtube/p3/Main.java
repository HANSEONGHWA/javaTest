package javajungsuk.algorithm.youtube.p3;

/**
 * 최빈수 수하기
 */
public class Main {


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2,2,4,3,5,3,2};

        int[] mode = new int[13];
        //index -> 출현한 수
        //index 값 -> index가 몇번 나왔는지 저장하는 용도.
        //mode[3] = 5; => 3번 숫자가 5번 출현했다.
        for (int i = 0; i <arr.length; i++) {
            mode[arr[i]]++;
        }

        int modeNum = 0; //최빈수
        int modeCnt = 0; //최빈수가 나온 횟수

        for (int i = 0; i < arr.length; i++) {
            if (modeCnt < mode[i]){
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 " + modeNum + ", 횟수는 " + modeCnt);
    }
}
