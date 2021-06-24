package me.tim;

public class User {
     String name;
     int age;
     Credentials<String, String> emailPass;
     Credentials<Integer, Integer> creditCardInfo;

    User(String name, int age, String email, String password, Integer cardNumber, Integer cardExpiryDate){
        this.name = name;
        this.age = age;
        this.emailPass = new Credentials<String, String>(email, password);
        this.creditCardInfo = new Credentials<Integer, Integer>(cardNumber, cardExpiryDate);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Credentials<String, String> getEmailPass() {
        return emailPass;
    }

    public Credentials<Integer, Integer> getCreditCardInfo() {
        return creditCardInfo;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
        "Email: " + emailPass.getStoredFirst() + "\n" +
        "Password: " + emailPass.getStoredSecond() + "\n" +
        "CardNumber: " + creditCardInfo.getStoredFirst() + "\n" +
        "Expiry: " + creditCardInfo.getStoredSecond() + "\n";
    }
}
