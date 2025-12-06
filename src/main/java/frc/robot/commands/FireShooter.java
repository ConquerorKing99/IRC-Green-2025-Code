package frc.robot.commands;

import java.lang.reflect.Constructor;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Shooter;

public class FireShooter extends Command{
    private Shooter shooter;
    private CommandXboxController XboxController;

    public FireShooter(Shooter shoot, CommandXboxController Xbox){
        shooter=shoot;
        XboxController=Xbox;
        addRequirements(shoot);
                
    }
    @Override
    public void execute(){
        shooter.drive(1);
    }
    
    @Override
    public void end(boolean interrupted){
        shooter.stop();

    }
}



