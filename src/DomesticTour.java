import java.util.ArrayList;
import java.util.HashMap;

public class DomesticTour extends Tour {
    private boolean hasHoneymoonTour;
    private HashMap<String, Price> priceMap;
    private String stateName;

    protected DomesticTour() {
        this("JB Trip", false, 1, false, "Johor Bahru");
    }

    protected DomesticTour(String tourName, boolean hasPrivateTour, int duration, boolean hasHoneymoonTour, String stateName) {
        super(tourName, hasPrivateTour, duration);
        this.priceMap = setPriceMap();
        this.hasHoneymoonTour = hasHoneymoonTour;
        this.stateName = stateName;
    }


    public void setHasHoneymoonTour(boolean hasHoneymoonTour) {
        this.hasHoneymoonTour = hasHoneymoonTour;
    }

    public boolean isHasHoneymoonTour() {
        return hasHoneymoonTour;
    }

    public DomesticTour getDomesticTours() {
        return this;
    }


    public String getStateName() {
        return stateName;
    }


    @Override
    public String toString() {
        String info = "Domestic Tour\n";

//                String isHasPrivateTour = "No";
//                String isHasHoneymoonTour = "No";
//                if (tours.isHasPrivateTour() == true) {
//                    isHasPrivateTour = "Yes";
//                }
//
//                if (tours.hasHoneymoonTour == true) {
//                    isHasHoneymoonTour = "Yes";
//                }
//                info += "\n" + tours.getStateName() + "\n" + isHasPrivateTour + "\n" + isHasHoneymoonTour + "\n" + tours.getDuration();


        return info;
    }

    public HashMap<String, Price> setPriceMap() {
        PeakPrice peakPrice = new PeakPrice();
        NormalPrice normalPrice = new NormalPrice();
        peakPrice.setDomesticTourPrice();
        normalPrice.setDomesticTourPrice();

        HashMap<String, Price> priceMap = new HashMap<>();
        priceMap.put(peakPrice.getClass().getName(), peakPrice);
        priceMap.put(normalPrice.getClass().getName(), normalPrice);

        return priceMap;
    }
}
