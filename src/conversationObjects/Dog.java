package conversationObjects;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    public void speak() {
        say("WOOF WOOF");
    }
}
