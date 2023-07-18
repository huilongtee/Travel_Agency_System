import java.util.ArrayList;
import java.util.HashMap;

public abstract class Tour {
    private String name;
    private boolean hasPrivateTour;
    private int duration;


    protected Tour() {
        this.name = "Seoul Trip";
        this.hasPrivateTour = true;
        this.duration = 6;
    }

    protected Tour(String tourName, boolean hasPrivateTour, int duration) {
        this.name = tourName;
        this.hasPrivateTour = hasPrivateTour;
        this.duration = duration;
    }

    public void setHasPrivateTour(boolean hasPrivateTour) {
        this.hasPrivateTour = hasPrivateTour;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }


    public boolean isHasPrivateTour() {
        return hasPrivateTour;
    }

    public abstract HashMap<String, Price> getPriceMap();

}
