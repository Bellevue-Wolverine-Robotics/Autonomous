package org.usfirst.frc.team949.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	private SpeedController fR = new CANTalon(1);
	private CANTalon bR = new CANTalon(3);
	private SpeedControllerGroup right = new SpeedControllerGroup(fR, bR);
	private CANTalon fL = new CANTalon(5);
	private CANTalon bL = new CANTalon(6);
	private SpeedControllerGroup left = new SpeedControllerGroup(fL, bL);
	
	private DifferentialDrive drive;
	
	public final ADXRS450_Gyro g = new ADXRS450_Gyro();

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());erer

		
	}
	
	public DriveTrain() {
		g.calibrate();

		drive = new DifferentialDrive()
		drive.setSafetyEnabled(false);
	}
	
	public void drive(double moveValue, double rotateValue) {
		drive.arcadeDrive(moveValue, rotateValue);
	}
}
