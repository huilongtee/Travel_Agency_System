import java.util.ArrayList;

public class Tour {
    private String name;
    private boolean hasPrivateTour;
    private int duration;


    protected Tour() {
        this.name = "Seoul Trip";
        this.hasPrivateTour = true;
        this.duration = 6;
    }

    protected Tour(String nameame, boolean hasPrivateTour, int duration) {
        this.name = name;
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
}