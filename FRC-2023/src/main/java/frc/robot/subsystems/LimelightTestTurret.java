// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimelightTestTurret extends SubsystemBase {
  /** Creates a new Turret. */
  private static final int baseServoPort = 9;
  private static final int jankServoPort = 0;

  private Servo baseServo = new Servo(baseServoPort);
  private Servo jankServo = new Servo(jankServoPort);

  // private Joystick m_joystick;

  public LimelightTestTurret() {
    // m_joystick = joystick;
  }

  public void setBaseAngle(double angle){
    baseServo.set(angle); // this uses the 0-1 servo thing, not the angle (pls don't put in like pi/3 or 60)
  }

  public void setRotationAngle(double angle){
    // this for the jank one cuz i didnt want to name it "setJankAngle"
    jankServo.set(angle);
  }
  
  public double getBaseAngle() {
    return baseServo.get();
    // do the thing that gets it from [0, 1]
  }

  public double getRotationAngle() {
    return jankServo.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    SmartDashboard.putNumber("Base Servo", getBaseAngle());
    SmartDashboard.putNumber("Jank Servo", getRotationAngle());
  }
}
