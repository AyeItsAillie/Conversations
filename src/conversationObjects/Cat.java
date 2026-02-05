package conversationObjects;

public class Cat extends Animal {
    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        say("meow meow");
    }
}
