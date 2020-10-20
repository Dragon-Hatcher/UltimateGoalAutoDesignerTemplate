package org.firstinspires.ftc.teamcode.autodesigner.controllers;

import com.qualcomm.hardware.motors.GoBILDA5201Series;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.autodesigner.ElectronicType;
import org.firstinspires.ftc.teamcode.autodesigner.MethodInputType;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.Controller;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerController;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerDropdownOption;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerElectronic;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerEnumForDropdown;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerMethod;
import org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations.ControllerMethodParam;

@Controller(uuid = "123e4567-e89b-12d3-a456-426614174000", adName = "Example Controller")
public class Example_Controller {

    @ControllerElectronic(type = ElectronicType.DcMotor, adName = "motor")
    public DcMotor motor;
    @ControllerElectronic(type = ElectronicType.GoBILDA5201Series, adName = "GoBILDA Motor")
    public GoBILDA5201Series GoBILDA_Motor;
    @ControllerController(typeUUID = "8f99ab75-4732-41c2-86ec-aba7753b42ae", adName = "Some Controller")
    public OtherController Some_Controller;

    //**AD** Inputs
    //**AD** End

    //**AD** Custom Members
    //**AD** End

    //**AD** Init
    ExController(DcMotor motor, GoBILDA5201Series GoBILDA_Motor, OtherController someController) {
        this.motor = motor;
        this.GoBILDA_Motor = GoBILDA_Motor;
    }
    //**AD** End

    @ControllerEnumForDropdown(adName="Option Menu", options = {
            @ControllerDropdownOption(adName = "Option 1"),
            @ControllerDropdownOption(adName = "Option 2"),
            @ControllerDropdownOption(adName = "Option 3")
    })
    enum Option_Menu_Enum {
        Option_1,
        Option_2,
        Option_3,
    }

    @ControllerEnumForDropdown(adName="Option Menu 2", options = {
            @ControllerDropdownOption(adName = "Option 1"),
            @ControllerDropdownOption(adName = "Option 2"),
            @ControllerDropdownOption(adName = "Option 3")
    })
    enum Option_Menu_2_Enum {
        Option_1,
        Option_2,
        Option_3,
    }

    @ControllerMethod(adName = "Method 1", args = {
            @ControllerMethodParam(type = MethodInputType.CHECKBOX, adName = "Checkbox"),
            @ControllerMethodParam(type = MethodInputType.NUMBER, adName = "Number Input"),
            @ControllerMethodParam(type = MethodInputType.DROPDOWN, adName = "Options Menu")
    })
    public void Method_1(boolean Checkbox, double Number_Input, Option_Menu_Enum Option_Menu) {
        /*do stuff*/
    }

    @ControllerMethod(adName = "Method 2", args = {
            @ControllerMethodParam(type = MethodInputType.CHECKBOX, adName = "Checkbox"),
            @ControllerMethodParam(type = MethodInputType.NUMBER, adName = "Number Input"),
            @ControllerMethodParam(type = MethodInputType.DROPDOWN, adName = "Options Menu 2")
    })
    public void Method_2(boolean checkbox, double number_input, Option_Menu_2_Enum Option_Menu_2) {
        /*do stuff*/
    }

}

