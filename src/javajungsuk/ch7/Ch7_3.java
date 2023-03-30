package javajungsuk.ch7;

/**
 * 매개변수의 다형성
 */
  abstract class Animal{
    String kind;

    public void breathe(){
        System.out.println("숨을 쉰다.");
    }

    public abstract void sound();
}

class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
public class Ch7_3 {
    public static void main(String[] args) {
        // 방법1.
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("------------------");

        //방법2.
        Animal animal = null;
        animal = new Dog();     //자동타입변환
        animal.sound();         //재정의된 메서드 호출
        animal = new Cat();
        animal.sound();
        System.out.println("------------------");

        //방법3. 메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat()); // 자동타입변환
    }
        public static void animalSound(Animal animal){
            animal.sound();
    }
}
