package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase{
    //Declare motor controllers
    VictorSP shooterFiring;

    //Constructor
    public Shooter(){
        //parameter channel is the port on your RoboRIO the motor controller is plugged in to
        shooterFiring = new VictorSP(2);
        
    }
    public void drive(double firingSpeed){
        shooterFiring.set(firingSpeed);
    }

    public void stop(){
        shooterFiring.stopMotor();
    }

}
