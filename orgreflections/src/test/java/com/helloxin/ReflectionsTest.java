package com.helloxin;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Set;

/**
 * Created by yebanxian on 2019/12/4.
 */
public class ReflectionsTest {

    @Test
    public void testReflections() {
        org.reflections.Reflections reflections = new org.reflections.Reflections("com.helloxin");
        Stopwatch stopwatch = Stopwatch.createStarted();
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Slf4j.class);
        System.out.println(stopwatch.toString());
        for (Class type : classes) {
            System.out.println("Found:" + type.getName());
        }
    }
}
