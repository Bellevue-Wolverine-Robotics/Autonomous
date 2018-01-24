package org.usfirst.frc.team949.robot.commands;

import org.usfirst.frc.team949.robot.Robot;
import org.usfirst.frc.team949.robot.subsystems.TakeIn_PutOut;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class JoyStick_TakeIn_PutOut extends Command {

    public JoyStick_TakeIn_PutOut() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.TIPO);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.operatorSideButtonIsPressed() && Robot.oi.operatorTriggerIsPressed()) {
//    		 Subsystem tIPO=new TakeIn_PutOut(); 
    		Robot.TIPO.putOut();
    	}
    	else if(Robot.oi.operatorTriggerIsPressed()){
    		Robot.TIPO.takeIn();
    	}
    	else {
    		Robot.TIPO.stop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
