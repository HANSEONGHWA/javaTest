package javajungsuk.ch8;

/**
 * 예외 처리 코드
 */
public class Ch8_2 {
    public static void main(String[] args) {
        String data1 = null;
        String data2 = null;
        try{
            data1 = args[0];
            data2 = args[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개값의 수가 부족");
            return;
        }

        try{
            int value = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
        }catch (NumberFormatException e){
            System.out.println("숫자 변경 불가");
        }finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
