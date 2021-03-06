package org.usfirst.frc.team949.robot.subsystems;

import org.usfirst.frc.team949.robot.RobotMap;
import org.usfirst.frc.team949.robot.commands.JoyStickDrive;

import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private DifferentialDrive drive;

	private final ADXRS450_Gyro g;

	private SpeedControllerGroup r;
	private SpeedControllerGroup l;

	private WPI_TalonSRX r0, r1,
					l0, l1;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new JoyStickDrive());
	}

	public DriveTrain() {
		// Christoff contributed all of the "this." code in this class
		this.g = new ADXRS450_Gyro();
		this.g.calibrate();

		this.r0 = new WPI_TalonSRX(RobotMap.rightDriveMotor1);
		this.r1 = new WPI_TalonSRX(RobotMap.rightDriveMotor2);

		this.l0 = new WPI_TalonSRX(RobotMap.leftDriveMotor1);
		this.l1 = new WPI_TalonSRX(RobotMap.leftDriveMotor2);

		
		this.r = new SpeedControllerGroup(r0, r1);
		this.l = new SpeedControllerGroup(l0, l1);
		
		this.r.setInverted(false);
		this.l.setInverted(true);
		
		this.drive = new DifferentialDrive(l, r);
		
		this.drive.setSafetyEnabled(false);
	}
	
	// Drive Methods 
	public void drive(double moveValue, double rotateValue) {
		this.drive.arcadeDrive(moveValue, rotateValue);
	}
	
	// ACCESSORS
	public ADXRS450_Gyro getGyro() 
	{
		return this.g;
	}
}
