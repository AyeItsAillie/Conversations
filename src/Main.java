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

        john.say("Hello Alice, nice to meet you.");
        alice.say("What do you do for a living?");
        john.say(john.tellUsWhatYouAre() + ", how about you?");
        alice.say(alice.tellUsWhatYouAre() + ".");

        Animal dogMilo = new Dog("Milo");
        dogMilo.speak();
        john.adoptPet(dogMilo);

        Animal catMittens = new Cat("Mittens");
        catMittens.speak();
        alice.adoptPet(catMittens);

        alice.say("Do you have any pets?");
        john.tellUsAboutYourPets();
        john.say("How about you, any pets?");
        alice.tellUsAboutYourPets();

        charlie.tellUsAboutYourPets();
        john.say("Wait, who are you?");

        Person Tom = new Teacher("Tom", "St. Paul");
        tom.say("Hello!");
    }
}