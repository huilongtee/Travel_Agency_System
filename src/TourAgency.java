import java.util.ArrayList;

public class TourAgency {

    private ArrayList<Tour> tourList;
    private ArrayList<Country> countryList;

    protected TourAgency() {
        this.tourList = new ArrayList<>();
        this.countryList = new ArrayList<>();
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public void addTour(Tour tour) {
        tourList.add(tour);
    }

    public void removeCountry(int index) {
        countryList.remove(index);
    }

    public void removeTour(int index) {
        tourList.remove(index);
    }


    public void printCountryList() {
        int count = 0;
        for (Country country : countryList) {
            count++;
            if (country.getCountryName().equals("Malaysia")) {
                continue;
            }
            System.out.println(count + ": " + country.getCountryName());
        }
    }

    public ArrayList<Tour> printTourList() {
        int count = 0;

        for (Tour tour : tourList) {
            count++;
            System.out.println(count + ": " + tour.getName() + "(" + (tour.getClass().getName().equalsIgnoreCase("DomesticTour") ? "Domestic Tour" : "Oversea Tour") + ")");

        }
        return tourList;
    }

    //print state list in Malaysia
    public void printStateList() {

        countryList.forEach(country -> {
            if (country.getCountryName().equalsIgnoreCase("Malaysia")) {
                country.getStateList().forEach(state -> {
                    System.out.println(state.getStateName());
                });
            }
        });
    }

    //print state list except Malaysia
    public void printStateList(int index) {

        Country country = countryList.get(index);
        country.getStateList().forEach(state -> {
            System.out.println(state.getStateName());
        });
    }
}
