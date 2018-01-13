package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.commands.JoyStickDrive;

import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveTrain extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	private SpeedController fL = new Talon(5);
	private SpeedController bL = new Talon(6);
	private SpeedControllerGroup left = new SpeedControllerGroup(fL, bL);
	private SpeedController fR = new Talon(1);
	private SpeedController bR = new Talon(3);
	private SpeedControllerGroup right = new SpeedControllerGroup(fR, bR);
	
	private DifferentialDrive drive = new DifferentialDrive(left, right);
	
	public final ADXRS450_Gyro g = new ADXRS450_Gyro();

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new JoyStickDrive());

		
	}
	
	public DriveTrain() {
		g.calibrate();
		drive.setSafetyEnabled(false);
	}
	
	public void drive(double moveValue, double rotateValue) {
		drive.arcadeDrive(moveValue, rotateValue);
	}
}
