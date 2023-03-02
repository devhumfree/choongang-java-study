package ch08;

public class RobotEx {
	public static void main(String[] args) {
		Robot[] robots = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(Robot robot : robots) {
			action(robot);
		}
	}

	private static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			((DanceRobot) robot).dance();
		} else if (robot instanceof SingRobot) {
			((SingRobot) robot).sing();
		} else if (robot instanceof DrawRobot) {
			((SingRobot) robot).sing();
			}
		
	}
}
