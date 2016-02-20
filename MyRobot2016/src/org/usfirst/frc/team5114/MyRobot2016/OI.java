// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team5114.MyRobot2016;

import org.usfirst.frc.team5114.MyRobot2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc.team5114.MyRobot2016.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public Joystick leftJoystick;
	public Joystick rightJoystick;
    public JoystickButton joystickButton2;
    public Joystick controller;
    public JoystickButton controllerButton1;
    public JoystickButton controllerButton2;
    public JoystickButton controllerButton3;
    public JoystickButton controllerButton4;
    public JoystickButton controllerButton5;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    	leftJoystick = new Joystick(0);
        rightJoystick = new Joystick(1);
        controller = new Joystick(2);

        controllerButton1 = new JoystickButton(controller, 1);
        controllerButton1.whenPressed(new RunLauncher());
        controllerButton2 = new JoystickButton(controller, 2);
        controllerButton2.whenPressed(new IntakeBall());
        controllerButton3 = new JoystickButton(controller, 3);
        controllerButton3.whenPressed(new StopLaunch());
        controllerButton4 = new JoystickButton(controller, 4);
        controllerButton4.whenPressed(new RunServo());
        controllerButton5 = new JoystickButton(controller, 5);
        controllerButton5.whenPressed(new ReadLaunchEncodersCmd());
        
        joystickButton2 = new JoystickButton(rightJoystick, 2);
        joystickButton2.whenPressed(new FlipDirection());
        
        // SmartDashboard Buttons

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getController() {
    	return controller;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}