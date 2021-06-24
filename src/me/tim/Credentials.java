package me.tim;

public class Credentials<F, S> {
     F storedFirst;
     S storedSecond;

    Credentials(F storedFirst, S storedSecond) {
        this.storedFirst = storedFirst;
        this.storedSecond = storedSecond;
    }

    public F getStoredFirst() {
        return storedFirst;
    }

    public S getStoredSecond() {
        return storedSecond;
    }
}
