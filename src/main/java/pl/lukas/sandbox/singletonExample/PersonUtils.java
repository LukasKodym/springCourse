package pl.lukas.springCourse.singletonExample;

public class PersonUtils {

    private static PersonUtils instance = null;

    private PersonUtils() {
    }

    public PersonUtils getInstance(){
        if(instance == null){
            instance = new PersonUtils();
        }
        return instance;
    }

    public final String operation(Person person) {
        return person.getName().toUpperCase();
    }
}
