// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motor;

/** An example command that uses an example subsystem. */
public class motorSpin extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final Motor m_motor;


  public motorSpin(Motor motor) {
    m_motor = motor;
    addRequirements(motor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

      m_motor.motor.set(0.2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {m_motor.motor.set(0.0);}
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
