package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

public class Hardware {
	DoubleSolenoid sol;
	public Hardware() {
		sol = new DoubleSolenoid(RobotMap.SOLENOID_FORWARD, RobotMap.SOLENOID_REVERSE);

	}
}
