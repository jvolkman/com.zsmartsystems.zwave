/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_OPERATING_STATE</b> version <b>1</b>.
 * <p>
 * Command Class Thermostat Operating State
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x42.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatOperatingStateV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatOperatingStateV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_OPERATING_STATE
     */
    public final static int COMMAND_CLASS_KEY = 0x42;

    /**
     * Thermostat Operating State Get Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_GET = 0x02;
    /**
     * Thermostat Operating State Report Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_REPORT = 0x03;


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_GET command.
     * <p>
     * Thermostat Operating State Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateGet() {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_STATE_GET command.
     * <p>
     * Thermostat Operating State Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatOperatingStateGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_REPORT command.
     * <p>
     * Thermostat Operating State Report
     *
     * @param operatingState {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateReport(String operatingState) {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_REPORT);

        // Process 'Level'
        int valoperatingState;
        switch (operatingState) {
            case "IDLE":
                valoperatingState = 0;
                break;
            case "HEATING":
                valoperatingState = 1;
                break;
            case "COOLING":
                valoperatingState = 2;
                break;
            case "FAN_ONLY":
                valoperatingState = 3;
                break;
            case "PENDING_HEAT":
                valoperatingState = 4;
                break;
            case "PENDING_COOL":
                valoperatingState = 5;
                break;
            case "VENT_ECONOMIZER":
                valoperatingState = 6;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for operatingState: " + operatingState);
        }
        outputData.write(valoperatingState & 0x0F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_STATE_REPORT command.
     * <p>
     * Thermostat Operating State Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>OPERATING_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatOperatingStateReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        switch (payload[2] & 0x0F) {
            case 0x00:
                response.put("OPERATING_STATE", "IDLE");
                break;
            case 0x01:
                response.put("OPERATING_STATE", "HEATING");
                break;
            case 0x02:
                response.put("OPERATING_STATE", "COOLING");
                break;
            case 0x03:
                response.put("OPERATING_STATE", "FAN_ONLY");
                break;
            case 0x04:
                response.put("OPERATING_STATE", "PENDING_HEAT");
                break;
            case 0x05:
                response.put("OPERATING_STATE", "PENDING_COOL");
                break;
            case 0x06:
                response.put("OPERATING_STATE", "VENT_ECONOMIZER");
                break;
            default:
                logger.debug("Unknown enum value {} for OPERATING_STATE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }

}
