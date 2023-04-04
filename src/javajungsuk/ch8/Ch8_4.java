package javajungsuk.ch8;

/**
 * 자동 리소스 닫기
 */
class FileInputStream implements AutoCloseable{

    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read(){
        System.out.println(file + "을 읽습니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println(file + "은 닫습니다.");
    }
}
public class Ch8_4 {
    public static void main(String[] args) throws Exception {
        try (FileInputStream f = new FileInputStream("file.txt")){
            f.read();
            throw new Exception();  //강제로 예외 발생시킴
        }catch(Exception e){
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
