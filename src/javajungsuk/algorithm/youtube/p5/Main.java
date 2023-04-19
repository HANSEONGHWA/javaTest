package javajungsuk.algorithm.youtube.p5;

/**
 * 대문자 소문자 변환하기
 */
public class Main {
    public static void main(String[] args) {

        String input = "helloWorLD";
        char[]arr = input.toCharArray(); //문자열을 charArray로 반환시켜줌.
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char) (arr[i]+'A'-'a');
            } else if (arr[i] >= 'A' && arr[i] <='Z') {
                arr[i] = (char) (arr[i] - ('A'-'a'));
            }
        }
        System.out.println(arr);
    }
}
