import java.util.Date;

public class TerrestrialRobot extends Robot implements ResistanceEvaluable {

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

    @Override
    public String toString() {
        return super.toString() + ", using " + tractionType.toString().toLowerCase() + " traction, up to " + maxSpeed + " km/h";
    }

    @Override
    public String getResistanceReport() {
        return getName() + " is " + ((getTractionType() == TractionType.CRAWLER) ? "eligible" : "not eligible") + " for extreme competition";
    }
}
