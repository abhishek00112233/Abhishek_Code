package ArrayQuestion;

public class Hello11 {
    interface Animal {
        void eat();
    }

    public static class Make {
        public static void main(String[] args) {
            Animal a1 = () -> System.out.println("dog is eating food");
            a1.eat();
        }
    }
}
