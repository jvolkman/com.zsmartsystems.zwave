/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl.loopback;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import com.zsmartsystems.zwave.commandclass.impl.CommandClassSwitchMultilevelV3;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_SWITCH_MULTILEVEL</b> version <b>3</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassSwitchMultilevelV3LoopbackTest {
    /**
     * Performs an in/out test of the SWITCH_MULTILEVEL_SET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param value {@link String}
     * @param dimmingDuration {@link String}
     */
    public static void testSwitchMultilevelSetLoopback(String value, String dimmingDuration) {
        byte[] testPayload = CommandClassSwitchMultilevelV3.getSwitchMultilevelSet(value, dimmingDuration);

        Map<String, Object> response = CommandClassSwitchMultilevelV3.handleSwitchMultilevelSet(testPayload);
        assertEquals(value, (String) response.get("VALUE"));
        assertEquals(dimmingDuration, (String) response.get("DIMMING_DURATION"));
    }

    /**
     * Performs an in/out test of the SWITCH_MULTILEVEL_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param value {@link String}
     */
    public static void testSwitchMultilevelReportLoopback(String value) {
        byte[] testPayload = CommandClassSwitchMultilevelV3.getSwitchMultilevelReport(value);

        Map<String, Object> response = CommandClassSwitchMultilevelV3.handleSwitchMultilevelReport(testPayload);
        assertEquals(value, (String) response.get("VALUE"));
    }

    /**
     * Performs an in/out test of the SWITCH_MULTILEVEL_START_LEVEL_CHANGE command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param incDec {@link String}
     * @param ignoreStartLevel {@link Boolean}
     * @param upDown {@link String}
     * @param startLevel {@link Integer}
     * @param dimmingDuration {@link Integer}
     * @param stepSize {@link Integer}
     */
    public static void testSwitchMultilevelStartLevelChangeLoopback(String incDec, Boolean ignoreStartLevel,
            String upDown, Integer startLevel, Integer dimmingDuration, Integer stepSize) {
        byte[] testPayload = CommandClassSwitchMultilevelV3.getSwitchMultilevelStartLevelChange(incDec, ignoreStartLevel,
                upDown, startLevel, dimmingDuration, stepSize);

        Map<String, Object> response = CommandClassSwitchMultilevelV3.handleSwitchMultilevelStartLevelChange(testPayload);
        assertEquals(incDec, (String) response.get("INC_DEC"));
        assertEquals(ignoreStartLevel, (Boolean) response.get("IGNORE_START_LEVEL"));
        assertEquals(upDown, (String) response.get("UP_DOWN"));
        assertEquals(startLevel, (Integer) response.get("START_LEVEL"));
        assertEquals(dimmingDuration, (Integer) response.get("DIMMING_DURATION"));
        assertEquals(stepSize, (Integer) response.get("STEP_SIZE"));
    }

    /**
     * Performs an in/out test of the SWITCH_MULTILEVEL_SUPPORTED_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param primarySwitchType {@link Integer}
     * @param secondarySwitchType {@link Integer}
     */
    public static void testSwitchMultilevelSupportedReportLoopback(Integer primarySwitchType,
            Integer secondarySwitchType) {
        byte[] testPayload = CommandClassSwitchMultilevelV3.getSwitchMultilevelSupportedReport(primarySwitchType,
                secondarySwitchType);

        Map<String, Object> response = CommandClassSwitchMultilevelV3.handleSwitchMultilevelSupportedReport(testPayload);
        assertEquals(primarySwitchType, (Integer) response.get("PRIMARY_SWITCH_TYPE"));
        assertEquals(secondarySwitchType, (Integer) response.get("SECONDARY_SWITCH_TYPE"));
    }

}
