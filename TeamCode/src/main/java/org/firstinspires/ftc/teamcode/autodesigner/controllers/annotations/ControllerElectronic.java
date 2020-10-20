package org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations;

import org.firstinspires.ftc.teamcode.autodesigner.ElectronicType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface ControllerElectronic {
    ElectronicType type();
    String adName();
}
