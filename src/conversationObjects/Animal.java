package conversationObjects;

public abstract class Animal extends Conversationalist {

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        say("?????");
    }
}
