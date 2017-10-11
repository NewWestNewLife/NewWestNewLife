/*
 * Created by Taran Rai Chris Kwon on 11/10/17 1:10 PM
 * Copyright (c) 2017. All rights reserved
 *
 * Last modified 30/09/17 1:17 AM
 */

package ca.bcit.project.newwestnewlife;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("ca.bcit.project.newwestnewlife", appContext.getPackageName());
    }
}
