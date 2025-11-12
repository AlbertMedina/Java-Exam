import java.util.Date;

public class TerrestrialRobot extends Robot {

    private final double maxSpeed;
    private final TractionType tractionType;

    public TerrestrialRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxSpeed, TractionType tractionType) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxSpeed = maxSpeed;
        this.tractionType = tractionType;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public TractionType getTractionType() {
        return tractionType;
    }
}
