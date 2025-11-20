package frc.robot.commands;

import java.lang.reflect.Constructor;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;

public class Drive extends Command{
    //Declare Drivetrain object and CommandXboxController object
    private Drivetrain Drivetrain;
    private CommandXboxController XboxController;

    public Drive(Drivetrain Wheels, CommandXboxController Xbox){
        Drivetrain=Wheels;
        XboxController=Xbox;
        addRequirements(Wheels);
                
    }
    @Override
    public void execute(){
        Drivetrain.drive(XboxController.getLeftY(), XboxController.getRightY());
    }
    
    @Override
    public void end(boolean interrupted){
        Drivetrain.stop();

    }
}




