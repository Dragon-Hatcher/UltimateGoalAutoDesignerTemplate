package org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface ControllerController {
    String adName();
    String typeUUID();
}
