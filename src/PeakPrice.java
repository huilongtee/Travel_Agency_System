public class PeakPrice extends Price {

    protected PeakPrice() {
        super();
    }

    protected PeakPrice(double adultPrice, double childWithNoExtraBedPrice, double childWithExtraBedPrice, double infantPrice) {
        super(adultPrice, childWithNoExtraBedPrice, childWithExtraBedPrice, infantPrice);
    }

    @Override
    public void setDomesticTourPrice() {
        super.setAdultPrice(1647);
        super.setChildWithNoExtraBedPrice(1247);

        super.setChildWithExtraBedPrice(1447);
        super.setInfantPrice(500);
    }

    @Override
    public void setOverseaTourPrice() {
        super.setAdultPrice(4297);
        super.setChildWithNoExtraBedPrice(3897);
        super.setChildWithExtraBedPrice(4097);
        super.setInfantPrice(500);
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
