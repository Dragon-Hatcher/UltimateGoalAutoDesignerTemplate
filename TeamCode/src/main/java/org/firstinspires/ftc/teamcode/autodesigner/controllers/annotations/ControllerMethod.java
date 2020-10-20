package org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface ControllerMethod {
    String adName();
    ControllerMethodParam[] args();
}
