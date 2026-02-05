package conversationObjects;

public abstract class Person extends Conversationalist {

    protected String hometown;
    protected String job;
    protected Animal pet;

    public Person() {

    }

    public Person(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void introduceYourself() {
        say("Hello, my name is " + name + ". I am from " + hometown + ".");
    }

    public void adoptPet(Animal pet) {
        this.pet = pet;
    }

    public void tellUsAboutYourPets() {
        if (pet != null) {
            say("I have a " + pet.tellUsWhatYouAre() + " named " + pet.getName());
        }
        else {
            say("I do not have any pets.");
        }
    }
}
