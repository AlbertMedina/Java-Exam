import java.util.Date;

public class AquaticRobot extends Robot {

    private final double maxDepth;
    private final PropulsionSystem propulsionSystem;

    public AquaticRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxDepth, PropulsionSystem propulsionSystem) {
        super(name, manufacturer, manufactureYear, registrationDate);
        this.maxDepth = maxDepth;
        this.propulsionSystem = propulsionSystem;
    }

    public double getMaxDepth() {
        return maxDepth;
    }

    public PropulsionSystem getPropulsionSystem() {
        return propulsionSystem;
    }

    @Override
    public String getTechnicalDescription() {
        return super.getTechnicalDescription() + ", using " + propulsionSystem.toString().toLowerCase() + " propulsion, up to " + maxDepth + " m depth";
    }
}
