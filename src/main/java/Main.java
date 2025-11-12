import java.util.Date;

public class Main {
    public static void main(String[] args) {
        RobotRepository robotRepository = new RobotRepository();
        RobotService robotService = new RobotService(robotRepository);

        robotService.addTerrestrialRobot("TerrestrialRobot123", "Robots SL", 2016, new Date(), 100, TractionType.WHEELS);
        robotService.addAquaticRobot("AquaticRobot456", "Robots SL", 2018, new Date(), 50, PropulsionSystem.PROPELLER);
        robotService.addAerialRobot("AerialRobot987", "AirTech SL", 2020, new Date(), 2000, 120);

        System.out.println("Technical description of all robots:");
        robotService.getAllRobots().forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println();

        System.out.println("Technical description of terrestrial robots faster than 50 km/h:");
        robotService.getTerrestrialRobotsFasterThanSpeed(50).forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println();

        System.out.println("Technical description of robots by Robots SL:");
        robotService.getRobotsByManufacturer("Robots SL").forEach(r -> System.out.println(r.getTechnicalDescription()));

        System.out.println();

        ResistanceReportPrinter resistanceReportPrinter = new ResistanceReportPrinter();
        resistanceReportPrinter.printReport(robotService.getResistanceEvaluableRobots());
    }
}
