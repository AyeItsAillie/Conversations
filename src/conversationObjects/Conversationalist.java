package conversationObjects;

public class Conversationalist {

    protected String name;

    public String getName() {
        return name;
    }

    public void say(String message) {
        System.out.println("[" + name + "]: " + message);
    }

    public String tellUsWhatYouAre() {
        return "I am a " + getClass().getSimpleName();
    }
}
