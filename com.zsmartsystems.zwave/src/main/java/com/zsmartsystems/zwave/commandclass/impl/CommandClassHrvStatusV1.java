/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zwave.commandclass.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_HRV_STATUS</b> version <b>1</b>.<br>
 *
 * Command Class Hrv Status<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassHrvStatusV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassHrvStatusV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_HRV_STATUS
     */
    public final static int COMMAND_CLASS_KEY = 0x37;

    /**
     * Hrv Status Get Command Constant
     */
    public final static int HRV_STATUS_GET = 0x01;
    /**
     * Hrv Status Report Command Constant
     */
    public final static int HRV_STATUS_REPORT = 0x02;
    /**
     * Hrv Status Supported Get Command Constant
     */
    public final static int HRV_STATUS_SUPPORTED_GET = 0x03;
    /**
     * Hrv Status Supported Report Command Constant
     */
    public final static int HRV_STATUS_SUPPORTED_REPORT = 0x04;

    /**
     * Creates a new message with the HRV_STATUS_GET command.<br>
     *
     * Hrv Status Get<br>
     *
     *
     * @param statusParameter {@link String}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHrvStatusGet(String statusParameter) {
        logger.debug("Creating command message HRV_STATUS_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HRV_STATUS_GET);

        // Process 'Status Parameter'
        switch (statusParameter) {
            case "OUTDOOR_AIR_TEMPERATURE":
                outputData.write(0x00);
                break;
            case "SUPPLY_AIR_TEMPERATURE":
                outputData.write(0x01);
                break;
            case "EXHAUST_AIR_TEMPERATURE":
                outputData.write(0x02);
                break;
            case "DISCHARGE_AIR_TEMPERATURE":
                outputData.write(0x03);
                break;
            case "ROOM_TEMPERATURE":
                outputData.write(0x04);
                break;
            case "RELATIVE_HUMIDITY_IN_ROOM":
                outputData.write(0x05);
                break;
            case "REMAINING_FILTER_LIFE":
                outputData.write(0x06);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for statusParameter: " + statusParameter);
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HRV_STATUS_GET command<br>
     *
     * Hrv Status Get<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS_PARAMETER {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHrvStatusGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status Parameter'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("STATUS_PARAMETER", "OUTDOOR_AIR_TEMPERATURE");
                break;
            case (byte) 0x01:
                response.put("STATUS_PARAMETER", "SUPPLY_AIR_TEMPERATURE");
                break;
            case (byte) 0x02:
                response.put("STATUS_PARAMETER", "EXHAUST_AIR_TEMPERATURE");
                break;
            case (byte) 0x03:
                response.put("STATUS_PARAMETER", "DISCHARGE_AIR_TEMPERATURE");
                break;
            case (byte) 0x04:
                response.put("STATUS_PARAMETER", "ROOM_TEMPERATURE");
                break;
            case (byte) 0x05:
                response.put("STATUS_PARAMETER", "RELATIVE_HUMIDITY_IN_ROOM");
                break;
            case (byte) 0x06:
                response.put("STATUS_PARAMETER", "REMAINING_FILTER_LIFE");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS_PARAMETER'", String.format("%02X", payload[2]));
                response.put("STATUS_PARAMETER", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the HRV_STATUS_REPORT command.<br>
     *
     * Hrv Status Report<br>
     *
     *
     * @param statusParameter {@link String}
     * @param size {@link Integer}
     * @param scale {@link Integer}
     * @param precision {@link Integer}
     * @param value {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHrvStatusReport(String statusParameter, Integer size, Integer scale, Integer precision,
            byte[] value) {
        logger.debug("Creating command message HRV_STATUS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HRV_STATUS_REPORT);

        // Process 'Status Parameter'
        switch (statusParameter) {
            case "OUTDOOR_AIR_TEMPERATURE":
                outputData.write(0x00);
                break;
            case "SUPPLY_AIR_TEMPERATURE":
                outputData.write(0x01);
                break;
            case "EXHAUST_AIR_TEMPERATURE":
                outputData.write(0x02);
                break;
            case "DISCHARGE_AIR_TEMPERATURE":
                outputData.write(0x03);
                break;
            case "ROOM_TEMPERATURE":
                outputData.write(0x04);
                break;
            case "RELATIVE_HUMIDITY_IN_ROOM":
                outputData.write(0x05);
                break;
            case "REMAINING_FILTER_LIFE":
                outputData.write(0x06);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for statusParameter: " + statusParameter);
        }

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= size & 0x07;
        valProperties1 |= ((scale << 3) & 0x18);
        valProperties1 |= ((precision << 5) & 0xE0);
        outputData.write(valProperties1);

        // Process 'Value'
        try {
            outputData.write(value);
        } catch (IOException e) {
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HRV_STATUS_REPORT command<br>
     *
     * Hrv Status Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>STATUS_PARAMETER {@link String}
     * <li>SIZE {@link Integer}
     * <li>SCALE {@link Integer}
     * <li>PRECISION {@link Integer}
     * <li>VALUE {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHrvStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Status Parameter'
        switch ((int) payload[msgOffset]) {
            case (byte) 0x00:
                response.put("STATUS_PARAMETER", "OUTDOOR_AIR_TEMPERATURE");
                break;
            case (byte) 0x01:
                response.put("STATUS_PARAMETER", "SUPPLY_AIR_TEMPERATURE");
                break;
            case (byte) 0x02:
                response.put("STATUS_PARAMETER", "EXHAUST_AIR_TEMPERATURE");
                break;
            case (byte) 0x03:
                response.put("STATUS_PARAMETER", "DISCHARGE_AIR_TEMPERATURE");
                break;
            case (byte) 0x04:
                response.put("STATUS_PARAMETER", "ROOM_TEMPERATURE");
                break;
            case (byte) 0x05:
                response.put("STATUS_PARAMETER", "RELATIVE_HUMIDITY_IN_ROOM");
                break;
            case (byte) 0x06:
                response.put("STATUS_PARAMETER", "REMAINING_FILTER_LIFE");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS_PARAMETER'", String.format("%02X", payload[msgOffset]));
                response.put("STATUS_PARAMETER", "UNKNOWN_" + String.format("%02X", payload[msgOffset]));
                break;
        }
        msgOffset += 1;

        // Process 'Properties1'
        response.put("SIZE", Integer.valueOf(payload[msgOffset] & 0x07));
        response.put("SCALE", Integer.valueOf((payload[msgOffset] & 0x18 >> 3)));
        response.put("PRECISION", Integer.valueOf((payload[msgOffset] & 0xE0 >> 5)));
        msgOffset += 1;

        // Process 'Value'
        ByteArrayOutputStream valValue = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valValue.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("VALUE", valValue);

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the HRV_STATUS_SUPPORTED_GET command.<br>
     *
     * Hrv Status Supported Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHrvStatusSupportedGet() {
        logger.debug("Creating command message HRV_STATUS_SUPPORTED_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HRV_STATUS_SUPPORTED_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HRV_STATUS_SUPPORTED_GET command<br>
     *
     * Hrv Status Supported Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHrvStatusSupportedGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the HRV_STATUS_SUPPORTED_REPORT command.<br>
     *
     * Hrv Status Supported Report<br>
     *
     *
     * @param bitMask {@link List<String>}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getHrvStatusSupportedReport(List<String> bitMask) {
        logger.debug("Creating command message HRV_STATUS_SUPPORTED_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(HRV_STATUS_SUPPORTED_REPORT);

        // Process 'Bit Mask'
        int valBitMask = 0;
        valBitMask |= (bitMask.contains("OUTDOOR_AIR_TEMPERATURE") ? 0x01 : 0);
        valBitMask |= (bitMask.contains("SUPPLY_AIR_TEMPERATURE") ? 0x02 : 0);
        valBitMask |= (bitMask.contains("EXHAUST_AIR_TEMPERATURE") ? 0x04 : 0);
        valBitMask |= (bitMask.contains("DISCHARGE_AIR_TEMPERATURE") ? 0x08 : 0);
        valBitMask |= (bitMask.contains("ROOM_TEMPERATURE") ? 0x10 : 0);
        valBitMask |= (bitMask.contains("RELATIVE_HUMIDITY_IN_ROOM") ? 0x20 : 0);
        valBitMask |= (bitMask.contains("REMAINING_FILTER_LIFE") ? 0x40 : 0);
        outputData.write(valBitMask);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the HRV_STATUS_SUPPORTED_REPORT command<br>
     *
     * Hrv Status Supported Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>BIT_MASK {@link List}<{@link String}>
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleHrvStatusSupportedReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Bit Mask'
        List<String> responseBitMask = new ArrayList<String>();
        int cntBitMask = 0;
        while (cntBitMask < payload.length - 2) {
            if ((payload[2 + (cntBitMask / 8)] & cntBitMask % 8) == 0) {
                continue;
            }
            switch (cntBitMask) {
                case 0x00:
                    responseBitMask.add("OUTDOOR_AIR_TEMPERATURE");
                    break;
                case 0x01:
                    responseBitMask.add("SUPPLY_AIR_TEMPERATURE");
                    break;
                case 0x02:
                    responseBitMask.add("EXHAUST_AIR_TEMPERATURE");
                    break;
                case 0x03:
                    responseBitMask.add("DISCHARGE_AIR_TEMPERATURE");
                    break;
                case 0x04:
                    responseBitMask.add("ROOM_TEMPERATURE");
                    break;
                case 0x05:
                    responseBitMask.add("RELATIVE_HUMIDITY_IN_ROOM");
                    break;
                case 0x06:
                    responseBitMask.add("REMAINING_FILTER_LIFE");
                    break;
                default:
                    responseBitMask.add("BITMASK_" + cntBitMask);
                    break;
            }
        }
        response.put("BIT_MASK", responseBitMask);

        // Return the map of processed response data;
        return response;
    }

}