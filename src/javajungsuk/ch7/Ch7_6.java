package javajungsuk.ch7;

interface Soundable{
    String Sound();
}

class Cat2 implements Soundable{

    @Override
    public String Sound() {
        return "야옹";
    }
}

class Dog2 implements Soundable{

    @Override
    public String Sound() {
        return "멍멍";
    }
}

public class Ch7_6 {
    private static void printSound(Soundable s){
        System.out.println(s.Sound());
    }

    public static void main(String[] args) {
        printSound(new Cat2());
        printSound(new Dog2());
    }
}
