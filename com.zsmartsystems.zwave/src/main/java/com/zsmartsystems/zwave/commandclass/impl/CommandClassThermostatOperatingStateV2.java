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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_THERMOSTAT_OPERATING_STATE</b> version <b>2</b>.
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
public class CommandClassThermostatOperatingStateV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassThermostatOperatingStateV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_THERMOSTAT_OPERATING_STATE
     */
    public final static int COMMAND_CLASS_KEY = 0x42;

    /**
     * Thermostat Operating State Logging Supported Get Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET = 0x01;
    /**
     * Thermostat Operating State Get Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_GET = 0x02;
    /**
     * Thermostat Operating State Report Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_REPORT = 0x03;
    /**
     * Thermostat Operating State Logging Supported Report Command Constant
     */
    public final static int THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT = 0x04;
    /**
     * Thermostat Operating State Logging Get Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_LOGGING_GET = 0x05;
    /**
     * Thermostat Operating State Logging Report Command Constant
     */
    public final static int THERMOSTAT_OPERATING_STATE_LOGGING_REPORT = 0x06;


    /**
     * Map holding constants for ThermostatOperatingStateLoggingGetBitMask
     */
    private static Map<Integer, String> constantThermostatOperatingStateLoggingGetBitMask = new HashMap<Integer, String>();

    /**
     * Map holding constants for ThermostatOperatingLoggingSupportedReportBitMask
     */
    private static Map<Integer, String> constantThermostatOperatingLoggingSupportedReportBitMask = new HashMap<Integer, String>();
    static {

        // Constants for ThermostatOperatingStateLoggingGetBitMask
        constantThermostatOperatingStateLoggingGetBitMask.put(0x00, "IDLE");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x01, "HEATING");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x02, "COOLING");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x03, "FAN_ONLY");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x04, "PENDING_HEAT");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x05, "PENDING_COOL");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x06, "VENT_ECONOMIZER");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x07, "AUX_HEATING");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x08, "2ND_STAGE_HEATING");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x09, "2ND_STAGE_COOLING");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x0A, "2ND_STAGE_AUX_HEAT");
        constantThermostatOperatingStateLoggingGetBitMask.put(0x0B, "3RD_STAGE_AUX_HEAT");

        // Constants for ThermostatOperatingLoggingSupportedReportBitMask
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x00, "IDLE");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x01, "HEATING");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x02, "COOLING");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x03, "FAN_ONLY");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x04, "PENDING_HEAT");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x05, "PENDING_COOL");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x06, "VENT_ECONOMIZER");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x07, "AUX_HEATING");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x08, "2ND_STAGE_HEATING");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x09, "2ND_STAGE_COOLING");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x0A, "2ND_STAGE_AUX_HEAT");
        constantThermostatOperatingLoggingSupportedReportBitMask.put(0x0B, "3RD_STAGE_AUX_HEAT");
    }

    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET command.
     * <p>
     * Thermostat Operating State Logging Supported Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateLoggingSupportedGet() {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_STATE_LOGGING_SUPPORTED_GET command.
     * <p>
     * Thermostat Operating State Logging Supported Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatOperatingStateLoggingSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_GET command.
     * <p>
     * Thermostat Operating State Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateGet() {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_GET version 2");

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
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_REPORT);

        // Process 'Properties1'
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
            case "AUX_HEATING":
                valoperatingState = 7;
                break;
            case "2ND_STAGE_HEATING":
                valoperatingState = 8;
                break;
            case "2ND_STAGE_COOLING":
                valoperatingState = 9;
                break;
            case "2ND_STAGE_AUX_HEAT":
                valoperatingState = 10;
                break;
            case "3RD_STAGE_AUX_HEAT":
                valoperatingState = 11;
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

        // Process 'Properties1'
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
            case 0x07:
                response.put("OPERATING_STATE", "AUX_HEATING");
                break;
            case 0x08:
                response.put("OPERATING_STATE", "2ND_STAGE_HEATING");
                break;
            case 0x09:
                response.put("OPERATING_STATE", "2ND_STAGE_COOLING");
                break;
            case 0x0A:
                response.put("OPERATING_STATE", "2ND_STAGE_AUX_HEAT");
                break;
            case 0x0B:
                response.put("OPERATING_STATE", "3RD_STAGE_AUX_HEAT");
                break;
            default:
                logger.debug("Unknown enum value {} for OPERATING_STATE", String.format("0x%02X", 2));
        }

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Operating State Logging Supported Report
     *
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <ul>
     *            <li>IDLE
     *            <li>HEATING
     *            <li>COOLING
     *            <li>FAN_ONLY
     *            <li>PENDING_HEAT
     *            <li>PENDING_COOL
     *            <li>VENT_ECONOMIZER
     *            <li>AUX_HEATING
     *            <li>2ND_STAGE_HEATING
     *            <li>2ND_STAGE_COOLING
     *            <li>2ND_STAGE_AUX_HEAT
     *            <li>3RD_STAGE_AUX_HEAT
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingLoggingSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        for (String value : bitMask) {
            boolean foundBitMask = false;
            for (Integer entry : constantThermostatOperatingLoggingSupportedReportBitMask.keySet()) {
                if (constantThermostatOperatingLoggingSupportedReportBitMask.get(entry).equals(value)) {
                    foundBitMask = true;
                    valBitMask += entry;
                    break;
                }
            }
            if (!foundBitMask) {
                throw new IllegalArgumentException("Unknown constant value '" + bitMask + "' for bitMask");
            }
        }
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_LOGGING_SUPPORTED_REPORT command.
     * <p>
     * Thermostat Operating State Logging Supported Report
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
    public static Map<String, Object> handleThermostatOperatingLoggingSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        for (int cntBitMask = 0; cntBitMask < (payload.length - 2) * 8; cntBitMask++) {
            if ((payload[2 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantThermostatOperatingLoggingSupportedReportBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_LOGGING_GET command.
     * <p>
     * Thermostat Operating State Logging Get
     *
     * @param bitMask {@link List<String>}
     *            Can be one of the following -:
     *            <ul>
     *            <li>IDLE
     *            <li>HEATING
     *            <li>COOLING
     *            <li>FAN_ONLY
     *            <li>PENDING_HEAT
     *            <li>PENDING_COOL
     *            <li>VENT_ECONOMIZER
     *            <li>AUX_HEATING
     *            <li>2ND_STAGE_HEATING
     *            <li>2ND_STAGE_COOLING
     *            <li>2ND_STAGE_AUX_HEAT
     *            <li>3RD_STAGE_AUX_HEAT
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateLoggingGet(List<String> bitMask) {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_LOGGING_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_LOGGING_GET);

        // Process 'Bit Mask'
        int valBitMask = 0;
        for (String value : bitMask) {
            boolean foundBitMask = false;
            for (Integer entry : constantThermostatOperatingStateLoggingGetBitMask.keySet()) {
                if (constantThermostatOperatingStateLoggingGetBitMask.get(entry).equals(value)) {
                    foundBitMask = true;
                    valBitMask += entry;
                    break;
                }
            }
            if (!foundBitMask) {
                throw new IllegalArgumentException("Unknown constant value '" + bitMask + "' for bitMask");
            }
        }
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_STATE_LOGGING_GET command.
     * <p>
     * Thermostat Operating State Logging Get
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
    public static Map<String, Object> handleThermostatOperatingStateLoggingGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        for (int cntBitMask = 0; cntBitMask < (payload.length - 2) * 8; cntBitMask++) {
            if ((payload[2 + (cntBitMask / 8)] & (1 << cntBitMask % 8)) == 0) {
                continue;
            }
            responseBitMask.add(constantThermostatOperatingStateLoggingGetBitMask.get(cntBitMask));
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the THERMOSTAT_OPERATING_STATE_LOGGING_REPORT command.
     * <p>
     * Thermostat Operating State Logging Report
     *
     * @param reportsToFollow {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getThermostatOperatingStateLoggingReport(Integer reportsToFollow) {
        logger.debug("Creating command message THERMOSTAT_OPERATING_STATE_LOGGING_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(THERMOSTAT_OPERATING_STATE_LOGGING_REPORT);

        // Process 'Reports to Follow'
        outputData.write(reportsToFollow);

        // Process 'vg1'

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the THERMOSTAT_OPERATING_STATE_LOGGING_REPORT command.
     * <p>
     * Thermostat Operating State Logging Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>REPORTS_TO_FOLLOW {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleThermostatOperatingStateLoggingReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Reports to Follow'
        response.put("REPORTS_TO_FOLLOW", Integer.valueOf(payload[2]));

        // Process 'vg1'

        // Create a list to hold the group vg1
        List<Map<String, Object>> variantList = new ArrayList<Map<String, Object>>();

        int offset = 3;
        while (offset < payload.length) {
            // Create a map to hold the members of this variant
            Map<String, Object> variant = new HashMap<String, Object>();

            // Process 'Properties1'
            variant.put("OPERATING_STATE_LOG_TYPE", Integer.valueOf(payload[3] & 0x0F));

            // Process 'Usage Today (Hours)'
            variant.put("USAGE_TODAY", Integer.valueOf(payload[4]));

            // Process 'Usage Today (Minutes)'
            variant.put("USAGE_TODAY", Integer.valueOf(payload[5]));

            // Process 'Usage Yesterday (Hours)'
            variant.put("USAGE_YESTERDAY", Integer.valueOf(payload[6]));

            // Process 'Usage Yesterday (Minutes)'
            variant.put("USAGE_YESTERDAY", Integer.valueOf(payload[7]));

            // Add to the list
            variantList.add(variant);

            // Add the length of this variant
            offset += (payload[offset + 0] & 0xFF) >> 0;
        }

        // Add the variant list to the response
        response.put("VG1", variantList);

        // Return the map of processed response data;
        return response;
    }

}
