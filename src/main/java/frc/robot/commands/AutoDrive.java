package frc.robot.commands;

import java.lang.reflect.Constructor;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Drivetrain;

public class AutoDrive extends Command{
    //Declare Drivetrain object and CommandXboxController object
    private Drivetrain Drivetrain;
    private double lSpeed, rSpeed;

    public AutoDrive(Drivetrain Wheels, double lSpeed, double rSpeed){
        Drivetrain=Wheels;
        this.lSpeed=lSpeed;
        this.rSpeed=rSpeed;
        addRequirements(Wheels);
                
    }
    
    @Override
    public void execute(){
        Drivetrain.drive(lSpeed, rSpeed);
    }
    
    @Override
    public void end(boolean interrupted){
        Drivetrain.stop();

    }
}




