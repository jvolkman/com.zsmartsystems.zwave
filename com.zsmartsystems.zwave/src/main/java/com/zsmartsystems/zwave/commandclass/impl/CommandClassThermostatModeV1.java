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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_MODE</b> version <b>1</b>.
 * <p>
 * Command Class Thermostat Mode
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassThermostatModeV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatModeV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_MODE
     */
    public final static int COMMAND_CLASS_KEY = 0x40;

    /**
     * Thermostat Mode Set Command Constant
     */
    public final static int THERMOSTAT_MODE_SET = 0x01;
    /**
     * Thermostat Mode Get Command Constant
     */
    public final static int THERMOSTAT_MODE_GET = 0x02;
    /**
     * Thermostat Mode Report Command Constant
     */
    public final static int THERMOSTAT_MODE_REPORT = 0x03;
    /**
     * Thermostat Mode Supported Get Command Constant
     */
    public final static int THERMOSTAT_MODE_SUPPORTED_GET = 0x04;
    /**
     * Thermostat Mode Supported Report Command Constant
     */
    public final static int THERMOSTAT_MODE_SUPPORTED_REPORT = 0x05;


    /**
     * Map holding constants for Bit Mask
     */
    private static Map<Integer, String> constantBitMask = new HashMap<Integer, String>();
    static {

        // Constants for Bit Mask
        constantBitMask.put(0x00, "OFF");
        constantBitMask.put(0x01, "HEAT");
        constantBitMask.put(0x02, "COOL");
        constantBitMask.put(0x03, "AUTO");
        constantBitMask.put(0x04, "AUXILIARY_EMERGENCY_HEAT");
        constantBitMask.put(0x05, "RESUME");
        constantBitMask.put(0x06, "FAN_ONLY");
        constantBitMask.put(0x07, "FURNACE");
        constantBitMask.put(0x08, "DRY_AIR");
        constantBitMask.put(0x09, "MOIST_AIR");
        constantBitMask.put(0x0A, "AUTO_CHANGEOVER");
    }

    /**
     * Creates a new message with the THERMOSTAT_MODE_SET command.
     * <p>
     * Thermostat Mode Set
     *
     * @param mode {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSet(String mode) {
        logger.debug("Creating command message THERMOSTAT_MODE_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SET);

        // Process 'Level'
        int valmode;
        switch (mode) {
            case "OFF":
                valmode = 0;
                break;
            case "HEAT":
                valmode = 1;
                break;
            case "COOL":
                valmode = 2;
                break;
            case "AUTO":
                valmode = 3;
                break;
            case "AUXILIARY_HEAT":
                valmode = 4;
                break;
            case "RESUME":
                valmode = 5;
                break;
            case "FAN_ONLY":
                valmode = 6;
                break;
            case "FURNACE":
                valmode = 7;
                break;
            case "DRY_AIR":
                valmode = 8;
                break;
            case "MOIST_AIR":
                valmode = 9;
                break;
            case "AUTO_CHANGEOVER":
                valmode = 10;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for mode: " + mode);
        }
        outputData.write(valmode & 0x1F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SET command.
     * <p>
     * Thermostat Mode Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MODE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        switch (payload[2] & 0x1F) {
            case 0x00:
                response.put("MODE", "OFF");
                break;
            case 0x01:
                response.put("MODE", "HEAT");
                break;
            case 0x02:
                response.put("MODE", "COOL");
                break;
            case 0x03:
                response.put("MODE", "AUTO");
                break;
            case 0x04:
                response.put("MODE", "AUXILIARY_HEAT");
                break;
            case 0x05:
                response.put("MODE", "RESUME");
                break;
            case 0x06:
                response.put("MODE", "FAN_ONLY");
                break;
            case 0x07:
                response.put("MODE", "FURNACE");
                break;
            case 0x08:
                response.put("MODE", "DRY_AIR");
                break;
            case 0x09:
                response.put("MODE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("MODE", "AUTO_CHANGEOVER");
                break;
            default:
                logger.debug("Unknown enum value {} for MODE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_MODE_GET command.
     * <p>
     * Thermostat Mode Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeGet() {
        logger.debug("Creating command message THERMOSTAT_MODE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_GET command.
     * <p>
     * Thermostat Mode Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_MODE_REPORT command.
     * <p>
     * Thermostat Mode Report
     *
     * @param mode {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeReport(String mode) {
        logger.debug("Creating command message THERMOSTAT_MODE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_REPORT);

        // Process 'Level'
        int valmode;
        switch (mode) {
            case "OFF":
                valmode = 0;
                break;
            case "HEAT":
                valmode = 1;
                break;
            case "COOL":
                valmode = 2;
                break;
            case "AUTO":
                valmode = 3;
                break;
            case "AUXILIARY_HEAT":
                valmode = 4;
                break;
            case "RESUME":
                valmode = 5;
                break;
            case "FAN_ONLY":
                valmode = 6;
                break;
            case "FURNACE":
                valmode = 7;
                break;
            case "DRY_AIR":
                valmode = 8;
                break;
            case "MOIST_AIR":
                valmode = 9;
                break;
            case "AUTO_CHANGEOVER":
                valmode = 10;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for mode: " + mode);
        }
        outputData.write(valmode & 0x1F);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_REPORT command.
     * <p>
     * Thermostat Mode Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MODE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Level'
        switch (payload[2] & 0x1F) {
            case 0x00:
                response.put("MODE", "OFF");
                break;
            case 0x01:
                response.put("MODE", "HEAT");
                break;
            case 0x02:
                response.put("MODE", "COOL");
                break;
            case 0x03:
                response.put("MODE", "AUTO");
                break;
            case 0x04:
                response.put("MODE", "AUXILIARY_HEAT");
                break;
            case 0x05:
                response.put("MODE", "RESUME");
                break;
            case 0x06:
                response.put("MODE", "FAN_ONLY");
                break;
            case 0x07:
                response.put("MODE", "FURNACE");
                break;
            case 0x08:
                response.put("MODE", "DRY_AIR");
                break;
            case 0x09:
                response.put("MODE", "MOIST_AIR");
                break;
            case 0x0A:
                response.put("MODE", "AUTO_CHANGEOVER");
                break;
            default:
                logger.debug("Unknown enum value {} for MODE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_MODE_SUPPORTED_GET command.
     * <p>
     * Thermostat Mode Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSupportedGet() {
        logger.debug("Creating command message THERMOSTAT_MODE_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SUPPORTED_GET command.
     * <p>
     * Thermostat Mode Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_MODE_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Mode Supported Report
     *
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <ul>
     *            <li>OFF
     *            <li>HEAT
     *            <li>COOL
     *            <li>AUTO
     *            <li>AUXILIARY_EMERGENCY_HEAT
     *            <li>RESUME
     *            <li>FAN_ONLY
     *            <li>FURNACE
     *            <li>DRY_AIR
     *            <li>MOIST_AIR
     *            <li>AUTO_CHANGEOVER
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatModeSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message THERMOSTAT_MODE_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_MODE_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        valBitMask |= (bitMask.contains("OFF") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("HEAT") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("COOL") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("AUTO") ? 0x08 : 0);
        valBitMask |= (bitMask.contains("AUXILIARY_EMERGENCY_HEAT") ? 0x10 : 0);
        valBitMask |= (bitMask.contains("RESUME") ? 0x20 : 0);
        valBitMask |= (bitMask.contains("FAN_ONLY") ? 0x40 : 0);
        valBitMask |= (bitMask.contains("FURNACE") ? 0x80 : 0);
        outputData.write(valBitMask);
        valBitMask = 0;
        valBitMask |= (bitMask.contains("DRY_AIR") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("MOIST_AIR") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("AUTO_CHANGEOVER") ? 0x04 : 0);
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_MODE_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Mode Supported Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatModeSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        for (int cntBitMask = 0; cntBitMask < (payload.length - 2) * 8; cntBitMask++) {
            if ((payload[2 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }

}
