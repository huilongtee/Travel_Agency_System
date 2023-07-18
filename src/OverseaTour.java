import java.util.ArrayList;
import java.util.HashMap;

public class OverseaTour extends Tour {

    private String countryName;
    private boolean hasJoinedTour;
    private String stateName;
    private HashMap<String, Price> priceMap;

    protected OverseaTour() {
        this("Seoul Trip", false, 3, "Korea", false, "Seoul");
    }

    protected OverseaTour(String tourName, boolean hasPrivateTour, int duration, String countryName, boolean hasJoinedTour, String stateName) {
        super(tourName, hasPrivateTour, duration);
        this.priceMap = setPriceMap();
        this.countryName = countryName;
        this.hasJoinedTour = hasJoinedTour;
        this.stateName = stateName;

    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setHasJoinedTour(boolean hasJoinedTour) {
        this.hasJoinedTour = hasJoinedTour;
    }

    public boolean isHasJoinedTour() {
        return hasJoinedTour;
    }

    public HashMap<String, Price> setPriceMap() {
        PeakPrice peakPrice = new PeakPrice();
        NormalPrice normalPrice = new NormalPrice();
        peakPrice.setOverseaTourPrice();
        normalPrice.setOverseaTourPrice();

        HashMap<String, Price> priceMap = new HashMap<>();
        priceMap.put(peakPrice.getClass().getName(), peakPrice);
        priceMap.put(normalPrice.getClass().getName(), normalPrice);

        return priceMap;
    }

    @Override
    public String toString() {


        return "Tour name: " + super.getName() + "\n" +
         "Country: " + getCountryName() + "\n" +
                "State: " + getStateName() + "\n" +
                "Has Joined Tour: " + (isHasJoinedTour() ? "Yes" : "No") + "\n" +
                "Has Private Tour: " + (super.isHasPrivateTour() ? "Yes" : "No") + "\n" +
                "Duration: " + super.getDuration() + " days" + "\n" +
                "Normal Price: " + priceMap.get("NormalPrice") + "\n" +
                "Peak Price: " + priceMap.get("PeakPrice")+ "\n" ;
    }
}
