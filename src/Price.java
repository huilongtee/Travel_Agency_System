import java.util.HashMap;

public abstract class Price {

    private double adultPrice;
    private double childWithNoExtraBedPrice;
    private double childWithExtraBedPrice;
    private double infantPrice;

    protected Price() {
        this(0, 0, 0, 0);
    }

    protected Price(double adultPrice, double childWithNoExtraBedPrice, double childWithExtraBedPrice, double infantPrice) {
        this.adultPrice = adultPrice;
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
        this.childWithExtraBedPrice = childWithExtraBedPrice;
        this.infantPrice = infantPrice;
    }

    public abstract void setDomesticTourPrice();

    public abstract void setOverseaTourPrice();


    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public void setChildWithExtraBedPrice(double childWithExtraBedPrice) {
        this.childWithExtraBedPrice = childWithExtraBedPrice;
    }

    public void setChildWithNoExtraBedPrice(double childWithNoExtraBedPrice) {
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
    }

    public void setInfantPrice(double infantPrice) {
        this.infantPrice = infantPrice;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildWithExtraBedPrice() {
        return childWithExtraBedPrice;
    }

    public double getChildWithNoExtraBedPrice() {
        return childWithNoExtraBedPrice;
    }

    public double getInfantPrice() {
        return infantPrice;
    }




    public String toString() {
        return "Adult: " + adultPrice +
                "\nChild With Extra Bed: " + childWithExtraBedPrice +
                "\nChild With No Extra Bed: " + childWithNoExtraBedPrice +
                "\nInfant: " + infantPrice;
    }
}
