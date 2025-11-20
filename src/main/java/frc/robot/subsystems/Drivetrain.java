package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase{
    //Declare motor controllers
    VictorSP leftMotor;
    VictorSP rightMotor;

    //Constructor
    public Drivetrain(){
        //parameter channel is the port on your RoboRIO the motor controller is plugged in to
        leftMotor = new VictorSP(0);
        rightMotor = new VictorSP(1);
        //one motor has to spin in reverse for the robot to go straight
        leftMotor.setInverted(true);
        
    }
    public void drive(double leftspeed, double rightspeed){
        leftMotor.set(leftspeed);
        rightMotor.set(rightspeed);
    }

    public void stop(){
        leftMotor.stopMotor();
        rightMotor.stopMotor();
    }
    //MAKE SURE TO SET THE CONTROLLER TO X MODE

}
