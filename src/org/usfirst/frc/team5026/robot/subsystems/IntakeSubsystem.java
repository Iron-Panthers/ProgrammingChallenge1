package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeSubsystem extends Subsystem {
	public Spark motor;
	public IntakeSubsystem(Spark motor){
		this.motor = motor;
	}
	public void intake(double power) {
		motor.set(power);
	}
	public void outtake(double power) {
		motor.set(-power);
	}
	public void stop() {
		motor.set(0);
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

