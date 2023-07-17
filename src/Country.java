import java.util.ArrayList;

public class Country {

    private String countryName;
    private ArrayList<State> stateList;

    protected Country() {
        this("Malaysia",new ArrayList<>());
    }

    protected Country(String countryName,ArrayList<State> stateList) {
        this.countryName = countryName;
        this.stateList = stateList;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setStateList(ArrayList<State> stateList) {
        this.stateList = stateList;
    }

    public ArrayList<State> getStateList() {
        return stateList;
    }
}
