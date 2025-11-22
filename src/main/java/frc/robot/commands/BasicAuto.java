package frc.robot.commands;



import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.ShooterRotator;
import frc.robot.subsystems.Drivetrain;

public class BasicAuto extends SequentialCommandGroup{
    public BasicAuto(Drivetrain autodrivetrain, ShooterRotator shooter){
        addCommands(
            new AutoDrive(autodrivetrain, 0.25, 0.25).withTimeout(1.5)
            //Next command new Example(example, example:#),
            //Next command new Example(example, example:#),
            //Next command new Example(example, example:#),
            //For falcons input position(angle)
            //Push onto Git repository using Terminal -> git add .
            //Then do git commit -m ""
        );
    }
}
