package org.usfirst.frc.team949.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class TakeIn_PutOut extends Subsystem {
	private WPI_TalonSRX m1;
	private WPI_TalonSRX m2;
	public void takeIn(){
		m1.set(-1);
		m2.set(-1);
	}
	public void putOut(){
		m1.set(1);
		m2.set(1);
	}
	public void stop(){
		m1.set(0);
		m2.set(0);
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.  
        //setDefaultCommand(new MySpecialCommand());
    }
}

