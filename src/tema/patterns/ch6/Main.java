package tema.patterns.ch6;

public class Main {
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder( "Popescu");
        builder.setJob("Profesor")
               .setUniversity("Politehnica")
               .setDrivingLicense("Permis categoria B")
               .setMaried(true);

        Person person1 = builder.build();
        Person.Builder builder2 = new Person.Builder( "Ionescu");
        Person person2 = builder2.build();

        System.out.println("Person: " + person1);
        System.out.println("Person: " + person2);

    }
}
