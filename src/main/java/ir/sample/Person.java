package ir.sample;

public class Person {
    private int id;
    private String name;
    private Email email;

    public void setEmail(Email email) {
        this.email = email;
    }

    public Person() {
    }

    public Person(Email email) {
        this.email = email;
    }
    public void sendMessage(){
        email.sendMessage();
    }
}
