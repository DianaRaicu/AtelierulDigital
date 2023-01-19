package tema.proiect.factory;

/*
Problema: Managementul unei clase de arta
Solutie folosind Factory Design Pattern
 */

public class Main {
    public static void main(String[] args) {
        ArtClass art = new ArtClass();

        Art art1=art.getArt("Photograph");
        art1.instrument();
        art1.type();

        Art art2=art.getArt("Paint");
        art2.instrument();
        art2.type();

        Art art3=art.getArt("Sculpt");
        art3.instrument();
        art3.type();

        Art art4=art.getArt("Write");
        art4.instrument();
        art4.type();

        Art art5=art.getArt("Sing");
        art5.instrument();
        art5.type();
    }
}
