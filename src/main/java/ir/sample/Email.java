package ir.sample;

public class Email {
    private String message;
    private String subject;

    public Email(String message, String subject) {
        this.message = message;
        this.subject = subject;
    }
    public void sendMessage(){
        System.out.println(subject  + " " +message);
    }
}
