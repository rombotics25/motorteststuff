// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Motor extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */

    public WPI_TalonFX motorSpin;

    public final WPI_TalonFX motor;

    public double speed;

  public Motor() {

      motor = new WPI_TalonFX(2);
      motor.setInverted(TalonFXInvertType.Clockwise);

      speed = 0.2;
      
  }

  @Override
  public void periodic() {
    motor.feed();
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {

    // This method will be called once per scheduler run during simulation
  }
}
