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
import java.util.List;
import com.zsmartsystems.zwave.commandclass.impl.CommandClassThermostatFanModeV4;

/**
 * Class to implement loopback tests for command class <b>COMMAND_CLASS_THERMOSTAT_FAN_MODE</b> version <b>4</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatFanModeV4LoopbackTest {
    /**
     * Performs an in/out test of the THERMOSTAT_FAN_MODE_SET command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param fanMode {@link String}
     * @param off {@link Boolean}
     */
    public static void testThermostatFanModeSetLoopback(String fanMode, Boolean off) {
        byte[] testPayload = CommandClassThermostatFanModeV4.getThermostatFanModeSet(fanMode, off);

        Map<String, Object> response = CommandClassThermostatFanModeV4.handleThermostatFanModeSet(testPayload);
        assertEquals(fanMode, (String) response.get("FAN_MODE"));
        assertEquals(off, (Boolean) response.get("OFF"));
    }

    /**
     * Performs an in/out test of the THERMOSTAT_FAN_MODE_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param fanMode {@link String}
     * @param off {@link Boolean}
     */
    public static void testThermostatFanModeReportLoopback(String fanMode, Boolean off) {
        byte[] testPayload = CommandClassThermostatFanModeV4.getThermostatFanModeReport(fanMode, off);

        Map<String, Object> response = CommandClassThermostatFanModeV4.handleThermostatFanModeReport(testPayload);
        assertEquals(fanMode, (String) response.get("FAN_MODE"));
        assertEquals(off, (Boolean) response.get("OFF"));
    }

    /**
     * Performs an in/out test of the THERMOSTAT_FAN_MODE_SUPPORTED_REPORT command.
     * <p>
     * Test is designed to ensure that the command generates the same data
     * as the handler processes and is mainly a check of the code generator.
     *
     * @param bitMask {@link List<String>}
     */
    public static void testThermostatFanModeSupportedReportLoopback(List<String> bitMask) {
        byte[] testPayload = CommandClassThermostatFanModeV4.getThermostatFanModeSupportedReport(bitMask);

        Map<String, Object> response = CommandClassThermostatFanModeV4.handleThermostatFanModeSupportedReport(testPayload);
        assertEquals(bitMask, (List<String>) response.get("BIT_MASK"));
    }

}
