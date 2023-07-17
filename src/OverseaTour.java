import java.util.ArrayList;
import java.util.HashMap;

public class OverseaTour extends Tour{

    private String countryName;
    private boolean hasJoinedTour;
    private HashMap<String,Price> priceMap;

    protected OverseaTour(){
        this("Seoul",false,3,"Korea",false);
    }

    protected OverseaTour(String stateName, boolean hasPrivateTour, int duration,String countryName,boolean hasJoinedTour){
        super(stateName,hasPrivateTour,duration);
        this.countryName=countryName;
        this.hasJoinedTour=hasJoinedTour;

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

    public void setPriceMap(){

    }
}
