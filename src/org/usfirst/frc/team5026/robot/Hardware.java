package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	public DoubleSolenoid sol;
	public Spark motor1;
	public Hardware() {
		sol = new DoubleSolenoid(RobotMap.SOLENOID_FORWARD, RobotMap.SOLENOID_REVERSE);
		motor1 = new Spark(0);
	}
}
