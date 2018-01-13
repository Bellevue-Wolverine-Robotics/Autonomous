package org.usfirst.frc.team949.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	private CANTalon fR, fL, bR, bL;
	private RobotDrive drive = new RobotDrive(fR, fL, bR, bL);
	
	public final ADXRS450_Gyro g = new ADXRS450_Gyro();

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());erer

		
	}
	
	public DriveTrain() {
		g.calibrate();
		fR = new CANTalon(1);
		fL = new CANTalon(5);
		bR = new CANTalon(3);
		bL = new CANTalon(6);
		drive.setSafetyEnabled(false);
	}
	
	public void drive(double moveValue, double rotateValue) {
		drive.arcadeDrive(moveValue, rotateValue);
	}
}
