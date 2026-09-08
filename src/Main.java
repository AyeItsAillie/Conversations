import conversationObjects.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person john = new Doctor("John", "Minneapolis");
        john.introduceYourself();

        Person alice = new Teacher("Alice", "Minnetonka");
        alice.introduceYourself();

        Person charlie = new Teacher("Charlie", "Lakeville");

        john.say("I'm deleting the conversation!");
    }
}