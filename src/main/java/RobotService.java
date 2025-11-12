import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RobotService {

    private final RobotRepository robotRepository;

    public RobotService(RobotRepository robotRepository) {
        this.robotRepository = robotRepository;
    }

    public void addTerrestrialRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxSpeed, TractionType tractionType) {
        try {
            TerrestrialRobot terrestrialRobot = new TerrestrialRobot(name, manufacturer, manufactureYear, registrationDate, maxSpeed, tractionType);
            robotRepository.addRobot(terrestrialRobot);
        } catch (Exception e) {
            System.out.println("Error adding terrestrial robot: " + e.getMessage());
        }
    }

    public void addAquaticRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxDepth, PropulsionSystem propulsionSystem) {
        try {
            AquaticRobot aquaticRobot = new AquaticRobot(name, manufacturer, manufactureYear, registrationDate, maxDepth, propulsionSystem);
            robotRepository.addRobot(aquaticRobot);
        } catch (Exception e) {
            System.out.println("Error adding aquatic robot: " + e.getMessage());
        }
    }

    public void addAerialRobot(String name, String manufacturer, int manufactureYear, Date registrationDate, double maxAltitude, double flightRange) {
        try {
            AerialRobot aerialRobot = new AerialRobot(name, manufacturer, manufactureYear, registrationDate, maxAltitude, flightRange);
            robotRepository.addRobot(aerialRobot);
        } catch (Exception e) {
            System.out.println("Error adding aerial robot: " + e.getMessage());
        }
    }

    public List<Robot> getAllRobots() {
        return robotRepository.getRobots();
    }

    public List<Robot> getTerrestrialRobotsFasterThanSpeed(double speed) {
        return robotRepository.getRobots().stream().filter(r -> r instanceof TerrestrialRobot tr && tr.getMaxSpeed() > speed).toList();
    }

    public List<Robot> getRobotsByManufacturer(String manufacturer) {
        return robotRepository.getRobots().stream().filter(r -> r.getManufacturer().equalsIgnoreCase(manufacturer)).toList();
    }

    public List<ResistanceEvaluable> getResistanceEvaluableRobots() {
        List<ResistanceEvaluable> resistanceEvaluableRobots = new ArrayList<>();
        for (Robot r : robotRepository.getRobots()) {
            if (r instanceof ResistanceEvaluable re) {
                resistanceEvaluableRobots.add(re);
            }
        }
        return resistanceEvaluableRobots;
    }
}
