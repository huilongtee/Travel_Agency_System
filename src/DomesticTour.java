import java.util.ArrayList;

public class DomesticTour extends Tour {
    private boolean hasHoneymoonTour;

    protected DomesticTour() {

    }

    protected DomesticTour(String stateName, boolean hasPrivateTour, int duration, boolean hasHoneymoonTour) {
        super(stateName, hasPrivateTour, duration);
        this.hasHoneymoonTour = hasHoneymoonTour;
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
}
