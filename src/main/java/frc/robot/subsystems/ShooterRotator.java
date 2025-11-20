package frc.robot.subsystems;

import com.ctre.phoenix6.configs.Slot0Configs;
import com.ctre.phoenix6.controls.PositionVoltage;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterRotator extends SubsystemBase{
    private TalonFX falcon;
    private PositionVoltage positionVoltage;
        
    public ShooterRotator (){
        falcon = new TalonFX(0);
        Slot0Configs Marcelo = new Slot0Configs();
        Marcelo.kP = Constants.ShooterRotator.kP;
        Marcelo.kI = Constants.ShooterRotator.kI;
        Marcelo.kD = Constants.ShooterRotator.kD;
        falcon.getConfigurator().apply(Marcelo);
        positionVoltage = new PositionVoltage (0).withSlot(0);
    }
    public void setGoalPosition (double ethanZhu){
        falcon.setControl(positionVoltage.withPosition(ethanZhu));
    }
    @Override
    public void periodic(){
        System.out.println(falcon.getPosition().getValueAsDouble());
    }

}