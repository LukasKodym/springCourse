package pl.lukas.springCourse.singletonExample;

public enum PersonUtils2 {

    INSTANCE;

    public final String operation(Person person) {
        return person.getName().toUpperCase();
    }
}
