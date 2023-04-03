package javajungsuk.ch8;

import java.io.File;

public class Ch8_1 {
    public static void main(String[] args) {
        try {
            File f = creatFile(args[0]);  //args[0]은  main(String[] args)로 들어오는 값임.
//            File f = creatFile("test2.txt");
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        }catch(Exception e) {
            System.out.println(e.getMessage() + "다시 입력해주시기 바랍니다.");
        }
    }

    static File creatFile(String fileName) throws Exception { //creatFile이 예외를 처리하지 못하고 main 메서드로 예외를 넘겨 catch부분을 찾아 예외를 처리함.
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이 유효하지 않습니다."); // 예외 발생.
        File f = new File(fileName);        //File클래스의 객체를 만든다.
        //File객체의 creatNewFile메서드를 이용해서 실제파일을 생성한다.
        f.createNewFile(); //생성된 객체의 참조를 반환한다.
        return f;
    }
}
