package org.usfirst.frc.team949.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	public static final int frontLeft=0;
	public static final int frontRight=1;
	public static final int midRight=2;
	public static final int midLeft=3;
	public static final int backLeft=4;
	public static final int backRight=5;
	
	public static final int inTakeLeft=6;
	public static final int intTakeRight=7;
	public static final int inTakeSolenoidLeft=0;
	public static final int inTakeSolenoidRight=0;
	
	public static final int arm=8;
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
