package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterRotator;


public class RotateShooter extends Command{
    ShooterRotator you;
    double him;
    public RotateShooter(ShooterRotator me, double angle ){
        you = me;
        him = angle;
        addRequirements(me);


    }
    @Override
    public void execute(){
        you.setGoalPosition(him);
    }
    @Override
    public void end(boolean interrupt){

      you.setGoalPosition(0);  
    }
}