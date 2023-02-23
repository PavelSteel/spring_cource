package spring_introduction;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Создана собака!");
    }

    @Override
    public void say(){
        System.out.println("Wow-wow!");
    }
}
