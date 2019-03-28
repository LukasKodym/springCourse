package pl.lukas.sandbox.singletonExample;

public enum PersonUtils2 {

    INSTANCE;

    public final String operation(Person person) {
        return person.getName().toUpperCase();
    }
}
