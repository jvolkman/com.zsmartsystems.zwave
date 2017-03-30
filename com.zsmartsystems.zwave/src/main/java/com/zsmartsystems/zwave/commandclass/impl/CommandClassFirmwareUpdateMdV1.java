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
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_FIRMWARE_UPDATE_MD</b> version <b>1</b>.
 * <p>
 * Command Class Firmware Update Md
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassFirmwareUpdateMdV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassFirmwareUpdateMdV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_FIRMWARE_UPDATE_MD
     */
    public final static int COMMAND_CLASS_KEY = 0x7A;

    /**
     * Firmware Md Get Command Constant
     */
    public final static int FIRMWARE_MD_GET = 0x01;
    /**
     * Firmware Md Report Command Constant
     */
    public final static int FIRMWARE_MD_REPORT = 0x02;
    /**
     * Firmware Update Md Request Get Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REQUEST_GET = 0x03;
    /**
     * Firmware Update Md Request Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REQUEST_REPORT = 0x04;
    /**
     * Firmware Update Md Get Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_GET = 0x05;
    /**
     * Firmware Update Md Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_REPORT = 0x06;
    /**
     * Firmware Update Md Status Report Command Constant
     */
    public final static int FIRMWARE_UPDATE_MD_STATUS_REPORT = 0x07;


    /**
     * Map holding constants for Properties1
     */
    private static Map<Integer, String> constantProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for Status
     */
    private static Map<Integer, String> constantStatus = new HashMap<Integer, String>();
    static {

        // Constants for Properties1
        constantProperties1.put(0x80, "ZERO");

        // Constants for Status
        constantStatus.put(0x00, "INVALID_COMBINATION");
        constantStatus.put(0xFF, "VALID_COMBINATION");
        constantStatus.put(0x01, "REQUIRES_AUTHENTICATION");
    }

    /**
     * Creates a new message with the FIRMWARE_MD_GET command.
     * <p>
     * Firmware Md Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareMdGet() {
        logger.debug("Creating command message FIRMWARE_MD_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_MD_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_MD_GET command.
     * <p>
     * Firmware Md Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareMdGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_MD_REPORT command.
     * <p>
     * Firmware Md Report
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param checksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareMdReport(Integer manufacturerId, Integer firmwareId, Integer checksum) {
        logger.debug("Creating command message FIRMWARE_MD_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_MD_REPORT);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write((firmwareId >> 8) & 0xff);
        outputData.write(firmwareId & 0xff);

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_MD_REPORT command.
     * <p>
     * Firmware Md Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareMdReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(((payload[4] & 0xff) << 8) + (payload[5] & 0xff)));

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(((payload[6] & 0xff) << 8) + (payload[7] & 0xff)));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REQUEST_GET command.
     * <p>
     * Firmware Update Md Request Get
     *
     * @param manufacturerId {@link Integer}
     * @param firmwareId {@link Integer}
     * @param checksum {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdRequestGet(Integer manufacturerId, Integer firmwareId, Integer checksum) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REQUEST_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REQUEST_GET);

        // Process 'Manufacturer ID'
        outputData.write((manufacturerId >> 8) & 0xff);
        outputData.write(manufacturerId & 0xff);

        // Process 'Firmware ID'
        outputData.write((firmwareId >> 8) & 0xff);
        outputData.write(firmwareId & 0xff);

        // Process 'Checksum'
        outputData.write((checksum >> 8) & 0xff);
        outputData.write(checksum & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REQUEST_GET command.
     * <p>
     * Firmware Update Md Request Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>MANUFACTURER_ID {@link Integer}
     * <li>FIRMWARE_ID {@link Integer}
     * <li>CHECKSUM {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdRequestGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Manufacturer ID'
        response.put("MANUFACTURER_ID", Integer.valueOf(((payload[2] & 0xff) << 8) + (payload[3] & 0xff)));

        // Process 'Firmware ID'
        response.put("FIRMWARE_ID", Integer.valueOf(((payload[4] & 0xff) << 8) + (payload[5] & 0xff)));

        // Process 'Checksum'
        response.put("CHECKSUM", Integer.valueOf(((payload[6] & 0xff) << 8) + (payload[7] & 0xff)));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REQUEST_REPORT command.
     * <p>
     * Firmware Update Md Request Report
     *
     * @param status {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>INVALID_COMBINATION
     *            <li>VALID_COMBINATION
     *            <li>REQUIRES_AUTHENTICATION
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdRequestReport(String status) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REQUEST_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REQUEST_REPORT);

        // Process 'Status'
        boolean foundStatus = false;
        for (Integer entry : constantStatus.keySet()) {
            if (constantStatus.get(entry).equals(status)) {
                outputData.write(entry);
                foundStatus = true;
                break;
            }
        }
        if (!foundStatus) {
            throw new IllegalArgumentException("Unknown constant value '" + status + "' for status");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REQUEST_REPORT command.
     * <p>
     * Firmware Update Md Request Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdRequestReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        response.put("STATUS", constantStatus.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_GET command.
     * <p>
     * Firmware Update Md Get
     *
     * @param numberOfReports {@link Integer}
     * @param reportNumber1 {@link Integer}
     * @param zero {@link Boolean}
     * @param reportNumber2 {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdGet(Integer numberOfReports, Integer reportNumber1, Boolean zero,
            Integer reportNumber2) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_GET);

        // Process 'Number of Reports'
        outputData.write(numberOfReports);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= reportNumber1 & 0x7F;
        valProperties1 |= zero ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Report number 2'
        outputData.write(reportNumber2);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_GET command.
     * <p>
     * Firmware Update Md Get
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>NUMBER_OF_REPORTS {@link Integer}
     * <li>REPORT_NUMBER_1 {@link Integer}
     * <li>ZERO {@link Boolean}
     * <li>REPORT_NUMBER_2 {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Number of Reports'
        response.put("NUMBER_OF_REPORTS", Integer.valueOf(payload[2]));

        // Process 'Properties1'
        response.put("REPORT_NUMBER_1", Integer.valueOf(payload[3] & 0x7F));
        response.put("ZERO", Boolean.valueOf((payload[3] & 0x80) != 0));

        // Process 'Report number 2'
        response.put("REPORT_NUMBER_2", Integer.valueOf(payload[4]));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_REPORT command.
     * <p>
     * Firmware Update Md Report
     *
     * @param reportNumber1 {@link Integer}
     * @param last {@link Boolean}
     * @param reportNumber2 {@link Integer}
     * @param data {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdReport(Integer reportNumber1, Boolean last, Integer reportNumber2,
            byte[] data) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_REPORT);

        // Process 'Properties1'
        int valProperties1 = 0;
        valProperties1 |= reportNumber1 & 0x7F;
        valProperties1 |= last ? 0x80 : 0;
        outputData.write(valProperties1);

        // Process 'Report number 2'
        outputData.write(reportNumber2);

        // Process 'Data'
        if (data != null) {
            try {
                outputData.write(data);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_REPORT command.
     * <p>
     * Firmware Update Md Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>REPORT_NUMBER_1 {@link Integer}
     * <li>LAST {@link Boolean}
     * <li>REPORT_NUMBER_2 {@link Integer}
     * <li>DATA {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // We're using variable length fields, so track the offset
        int msgOffset = 2;

        // Process 'Properties1'
        response.put("REPORT_NUMBER_1", Integer.valueOf(payload[msgOffset] & 0x7F));
        response.put("LAST", Boolean.valueOf((payload[msgOffset] & 0x80) != 0));
        msgOffset += 1;

        // Process 'Report number 2'
        response.put("REPORT_NUMBER_2", Integer.valueOf(payload[msgOffset]));
        msgOffset += 1;

        // Process 'Data'
        ByteArrayOutputStream valData = new ByteArrayOutputStream();
        while (msgOffset < payload.length) {
            valData.write(payload[msgOffset]);
            msgOffset++;
        }
        response.put("DATA", valData);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the FIRMWARE_UPDATE_MD_STATUS_REPORT command.
     * <p>
     * Firmware Update Md Status Report
     *
     * @param status {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>INVALID_COMBINATION
     *            <li>VALID_COMBINATION
     *            <li>REQUIRES_AUTHENTICATION
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getFirmwareUpdateMdStatusReport(String status) {
        logger.debug("Creating command message FIRMWARE_UPDATE_MD_STATUS_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(FIRMWARE_UPDATE_MD_STATUS_REPORT);

        // Process 'Status'
        boolean foundStatus = false;
        for (Integer entry : constantStatus.keySet()) {
            if (constantStatus.get(entry).equals(status)) {
                outputData.write(entry);
                foundStatus = true;
                break;
            }
        }
        if (!foundStatus) {
            throw new IllegalArgumentException("Unknown constant value '" + status + "' for status");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the FIRMWARE_UPDATE_MD_STATUS_REPORT command.
     * <p>
     * Firmware Update Md Status Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>STATUS {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleFirmwareUpdateMdStatusReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Status'
        response.put("STATUS", constantStatus.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }

}
