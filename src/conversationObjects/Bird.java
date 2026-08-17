package conversationObjects;

public class Bird extends Animal {
    public Bird(String name) {
        this.name = name;
    }

    public void speak() {
        say("CHIRP CHIRP");
    }
}
