package com.aptentity.autoparcel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * Created by gulliver on 2017/12/5.
 */
@SupportedAnnotationTypes("com.aptentity.autoparcel.AutoParcel")
public class AutoParcelProcessor extends AbstractProcessor{
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) {
        Collection<? extends Element> annotatedElements =
                env.getElementsAnnotatedWith(AutoParcel.class);

        System.out.print("hahaha");
        // 返回 true ，其他处理器不关心 AutoParcel  注解
        return true;
    }
}
