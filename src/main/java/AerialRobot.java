import java.util.Date;

public class AerialRobot extends Robot implements ResistanceEvaluable {

    private final double maxAltitude;
    private final double flightRange;

    public AerialRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxAltitude, double flightRange) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxAltitude = maxAltitude;
        this.flightRange = flightRange;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public double getFlightRange() {
        return flightRange;
    }

    @Override
    public String getTechnicalDescription() {
        return super.getTechnicalDescription() + ", can fly up to " + maxAltitude + " m during " + flightRange + " minutes";
    }

    @Override
    public String getResistanceReport() {
        return getName() + " is " + ((getFlightRange() > 60) ? "eligible" : "not eligible") + " for extreme competition";
    }
}
