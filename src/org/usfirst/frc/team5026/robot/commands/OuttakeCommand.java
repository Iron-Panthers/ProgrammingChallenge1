package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OuttakeCommand extends Command {
<<<<<<< HEAD
	private double power;
    public OuttakeCommand(double power) {
    	requires(Robot.intake);
    	this.power = Math.abs(power);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
=======
	
	private double power;
	
    public OuttakeCommand(double power) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	this.power = Math.abs(power);
    	requires(Robot.intake);
>>>>>>> ivanBranch
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.outtake(power);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
<<<<<<< HEAD
    	Robot.intake.stop();
=======
>>>>>>> ivanBranch
    }
}
