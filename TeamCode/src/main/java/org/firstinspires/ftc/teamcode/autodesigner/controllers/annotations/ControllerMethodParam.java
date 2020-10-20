package org.firstinspires.ftc.teamcode.autodesigner.controllers.annotations;

import org.firstinspires.ftc.teamcode.autodesigner.MethodInputType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({})
public @interface ControllerMethodParam {
    MethodInputType type();
    String adName();
}