package frc.robot.commands;

import java.lang.reflect.Constructor;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Shooter;

public class FireShooter extends Command{
    private Shooter shooter;
    private CommandXboxController XboxController;

    public FireShooter(Shooter shoot, CommandXboxController Xbox){
        shooter=shoot;
        XboxController=Xbox;
        addRequirements(Wheels);
                
    }
    @Override
    public void execute(){
        Shooter.shooter(XboxController.getLeftY);
    }
    
    @Override
    public void end(boolean interrupted){
        Shooter.stop();

    }
}



