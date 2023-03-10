// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Drivetrain;

public class DriveForward extends CommandBase {
  private static final class Config {
    private static final double k_wheelSpeed = 0.4;
  }
  private Drivetrain m_drivetrain; 
  private JoystickButton m_button;
  /** Creates a new DriveForward. */
  public DriveForward(Drivetrain drivetrain, JoystickButton endButton) {
   m_drivetrain = drivetrain;
   m_button = endButton;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_drivetrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_drivetrain.getDrive().tankDrive(Config.k_wheelSpeed, Config.k_wheelSpeed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drivetrain.getDrive().stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_button.getAsBoolean();
  }
}
