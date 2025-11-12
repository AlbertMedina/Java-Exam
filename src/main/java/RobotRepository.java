import java.util.ArrayList;
import java.util.List;

public class RobotRepository {

    private final List<Robot> robots = new ArrayList<>();

    public List<Robot> getRobots() {
        return List.copyOf(robots);
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }
}
