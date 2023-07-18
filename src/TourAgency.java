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

    public void printTour(int index){
        System.out.print(tourList.get(index).toString());
    }

    //print state list in Malaysia
    public void printStateList() {
        int count = 0;

        for (Country country : countryList) {
            count++;
            if (country.getCountryName().equals("Malaysia")) {
                for (State state : country.getStateList()) {
                    System.out.println(count + ": " + state.getStateName());

                }

            }

        }


//        countryList.forEach(country -> {
//            if (country.getCountryName().equalsIgnoreCase("Malaysia")) {
//                country.getStateList().forEach(state -> {
//                    System.out.println("1 - " + state.getStateName());
//                });
//            }
//        });
    }

    public String getLocalStateName(int index) {

        String stateName = "";

        for (Country country : countryList) {

            if (country.getCountryName().equals("Malaysia")) {
                State state = country.getStateList().get(index);

                stateName = state.getStateName();

            }
        }
        return stateName;
    }

    public String getOverseaStateName(int countryIndex, int stateIndex) {

        String stateName = "";


        Country country = countryList.get(countryIndex);
        State state = country.getStateList().get(stateIndex);
        stateName = state.getStateName();


        return stateName;
    }

    //print state list except Malaysia
    public void printStateList(int index) {
        int count = 0;

        Country country = countryList.get(index);
        for (State state : country.getStateList()) {
            count++;
            System.out.println(count + ": " + state.getStateName());

        }
//        country.getStateList().forEach(state -> {
//            System.out.println(state.getStateName());
//        });
    }

    public String getCountryName(int index) {
        String countryName = "";
        Country country = countryList.get(index);
        countryName = country.getCountryName();
        return countryName;
    }

    public void addState(String countryName, String stateName) {
        countryList.forEach(country -> {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                country.getStateList().add(new State(stateName));
            }
        });
    }
}
