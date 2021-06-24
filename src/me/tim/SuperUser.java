package me.tim;

public class SuperUser<N extends Number, U extends User> {
    private N secretNumber;
    private U userData;

    SuperUser(N secretNumber, U userData) {
        this.secretNumber = secretNumber;
        this.userData = userData;
    }

    public N getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(N secretNumber) {
        this.secretNumber = secretNumber;
    }

    public U getUserData() {
        return userData;
    }

    public void setUserData(U userData) {
        this.userData = userData;
    }

    @Override
    public String toString() {
        return  "UserType: " + getClass().getName() + "\n" +
                "SecretNumber: " + secretNumber + "\n" +
                "Name: " + userData.getName() + "\n" +
                "Age: " + userData.getAge() + "\n" +
                "Email: " + userData.getEmailPass().getStoredFirst() + "\n" +
                "Password: " + userData.getEmailPass().getStoredSecond() + "\n" +
                "CardNumber: " + userData.getCreditCardInfo().getStoredFirst() + "\n" +
                "CardExpiry: " + userData.getCreditCardInfo().getStoredSecond() + "\n";
    }
}
