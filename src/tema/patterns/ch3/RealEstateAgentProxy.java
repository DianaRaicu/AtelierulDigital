package tema.patterns.ch3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RealEstateAgentProxy implements RealEstateAgent {
    private RealEstateAgentImplement realEstateAgent;
    private List<Apartment> apartments = new ArrayList<>();


    @Override
    public void represent(Apartment apartment) {
        apartments.add(apartment);

        if (realEstateAgent == null) {
            realEstateAgent = new RealEstateAgentImplement();
        }
        realEstateAgent.represent(apartment);
    }

    @Override
    public Apartment rent(Student student) {

        Apartment ap;

        if (student.getName().charAt(0) == 'P') {
            return null;
        } else {
            ap=apartments.stream()
                    .min(Comparator.comparingInt(Apartment::getMonthlyRentCost))
                    .get();

            if(student.getMoney()>=ap.getMonthlyRentCost()){
                ap.setRented(true);
                return ap;

            }else{
                return null;
            }

        }
    }


}