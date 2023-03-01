
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package frc.robot;
import com.ctre.phoenix.music.Orchestra;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.Drivetrain.ArcadeDrive;
import frc.robot.commands.Drivetrain.DriveForward;
import frc.robot.commands.Drivetrain.DriveForwardPID;
import frc.robot.commands.Drivetrain.ForwardForTime;
import frc.robot.commands.Elevator.EncoderTest;
import frc.robot.commands.Elevator.JoystickElevator;
import frc.robot.commands.IntakeArm.ArmDown;
import frc.robot.commands.IntakeArm.GoToAngle;
import frc.robot.commands.Limelight.TestServo;
import frc.robot.commands.Limelight.TrackTarget;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Limelight;
import frc.robot.subsystems.Music;
import frc.robot.subsystems.Turret;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private static final class Config{
    public static final int kJoystickID = 0;
    public static final int kForwardJoystickButtonID = 5;
    public static final int kArmUpButtonID = 0;
    public static final int kArmDownButtonID = 3;
    public static final int kForwardForTimeButtonID = 0; //placeholder
    public static final double kArmSetpoint = 7;
    public static final double kTime = 0;
  }

  // The robot's subsystems and commands are defined here...
  private Drivetrain m_drivetrain = new Drivetrain();
  private Joystick m_joystick = new Joystick(Config.kJoystickID); 

  private ArcadeDrive m_arcadeDrive = new ArcadeDrive(m_drivetrain, m_joystick);

  // private Limelight m_limelight = new Limelight();
  
  // private Turret m_turret = new Turret();
  // private TrackTarget m_track = new TrackTarget(m_limelight, m_turret);
  // private TestServo m_test = new TestServo(m_turret);
  
  // private Elevator m_elevator = new Elevator();
  // private JoystickElevator m_joystickElevator = new JoystickElevator(m_elevator, m_joystick);
  // private EncoderTest m_encoderTest = new EncoderTest(m_elevator);
  
  // Joystick buttons
  // private JoystickButton m_forwardButton = new JoystickButton(m_joystick, Config.kForwardJoystickButtonID);
  // private DriveForward m_driveForward = new DriveForward(m_drivetrain, m_forwardButton);

  // private Arm m_arm = new Arm();
  // private JoystickButton m_ArmUpButton = new JoystickButton(m_joystick, Config.kArmUpButtonID);
  // private JoystickButton m_ArmDownButton = new JoystickButton(m_joystick, Config.kArmDownButtonID);
  // private GoToAngle m_goToAngle = new GoToAngle(m_arm, Config.kArmSetpoint);
  // private ArmDown m_armDown = new ArmDown();
  // private ForwardForTime m_ForwardForTime = new ForwardForTime(m_drivetrain,  3);

  // private JoystickButton m_ForwardForTimeButton = new JoystickButton(m_joystick, Config.kForwardForTimeButtonID);
  

  // private DriveForwardPID m_drivePID = new DriveForwardPID(m_drivetrain);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  

  }
  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    // m_ForwardForTimeButton.onTrue(m_ForwardForTime);
    // m_forwardButton.onTrue(m_driveForward);
    // m_ArmUpButton.onTrue(m_goToAngle);
    // m_ArmDownButton.onTrue(m_armDown);
  }
  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
  */
 public Command getAutonomousCommand() {
   // An ExampleCommand will run in autonomous
    // m_drivePID.schedule();
    return null;
  }
  public Command getTeleopCommand(){
    m_drivetrain.setDefaultCommand(m_arcadeDrive);

    // m_limelight.setDefaultCommand(m_track);
    // m_turret.setDefaultCommand(m_test);
    // m_track.schedule();

    //m_joystickElevator.schedule();
    // m_encoderTest.schedule(); 
    return null;
  }
}
