package javajungsuk.ch8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 예외 떠넘기기 throws
 */

public class Ch7_5 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (ClassNotFoundException e) {    // 2. 던져서 처리함.
            System.out.println("클래스가 존재하지 않습니다.");
            }
        }

    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java,lang.String2");   //1.클래스를 찾을 수 없을 경우 에러를
    }
}
