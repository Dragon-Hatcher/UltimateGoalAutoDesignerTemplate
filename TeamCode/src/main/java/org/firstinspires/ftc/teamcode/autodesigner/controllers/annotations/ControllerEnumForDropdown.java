package org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ControllerEnumForDropdown {
    String adName();
    ControllerDropdownOption[] options();
}
