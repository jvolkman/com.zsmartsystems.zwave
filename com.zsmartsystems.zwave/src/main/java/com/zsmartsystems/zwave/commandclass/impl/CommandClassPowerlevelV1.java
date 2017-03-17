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
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_POWERLEVEL</b> version <b>1</b>.<br>
 *
 * Command Class Powerlevel<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassPowerlevelV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassPowerlevelV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_POWERLEVEL
     */
    public final static int COMMAND_CLASS_KEY = 0x73;

    /**
     * Powerlevel Set Command Constant
     */
    public final static int POWERLEVEL_SET = 0x01;
    /**
     * Powerlevel Get Command Constant
     */
    public final static int POWERLEVEL_GET = 0x02;
    /**
     * Powerlevel Report Command Constant
     */
    public final static int POWERLEVEL_REPORT = 0x03;
    /**
     * Powerlevel Test Node Set Command Constant
     */
    public final static int POWERLEVEL_TEST_NODE_SET = 0x04;
    /**
     * Powerlevel Test Node Get Command Constant
     */
    public final static int POWERLEVEL_TEST_NODE_GET = 0x05;
    /**
     * Powerlevel Test Node Report Command Constant
     */
    public final static int POWERLEVEL_TEST_NODE_REPORT = 0x06;

    /**
     * Creates a new message with the POWERLEVEL_SET command.<br>
     *
     * Powerlevel Set<br>
     *
     *
     * @param powerLevel {@link String}
     * @param timeout {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelSet(String powerLevel, Integer timeout) {
        logger.debug("Creating command message POWERLEVEL_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_SET);

        // Process 'Power level'
        switch (powerLevel) {
            case "NORMALPOWER":
                outputData.write(0x00);
                break;
            case "MINUS1DBM":
                outputData.write(0x01);
                break;
            case "MINUS2DBM":
                outputData.write(0x02);
                break;
            case "MINUS3DBM":
                outputData.write(0x03);
                break;
            case "MINUS4DBM":
                outputData.write(0x04);
                break;
            case "MINUS5DBM":
                outputData.write(0x05);
                break;
            case "MINUS6DBM":
                outputData.write(0x06);
                break;
            case "MINUS7DBM":
                outputData.write(0x07);
                break;
            case "MINUS8DBM":
                outputData.write(0x08);
                break;
            case "MINUS9DBM":
                outputData.write(0x09);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for powerLevel: " + powerLevel);
        }

        // Process 'Timeout'
        outputData.write(timeout);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_SET command<br>
     *
     * Powerlevel Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>POWER_LEVEL {@link String}
     * <li>TIMEOUT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Power level'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("POWER_LEVEL", "NORMALPOWER");
                break;
            case (byte) 0x01:
                response.put("POWER_LEVEL", "MINUS1DBM");
                break;
            case (byte) 0x02:
                response.put("POWER_LEVEL", "MINUS2DBM");
                break;
            case (byte) 0x03:
                response.put("POWER_LEVEL", "MINUS3DBM");
                break;
            case (byte) 0x04:
                response.put("POWER_LEVEL", "MINUS4DBM");
                break;
            case (byte) 0x05:
                response.put("POWER_LEVEL", "MINUS5DBM");
                break;
            case (byte) 0x06:
                response.put("POWER_LEVEL", "MINUS6DBM");
                break;
            case (byte) 0x07:
                response.put("POWER_LEVEL", "MINUS7DBM");
                break;
            case (byte) 0x08:
                response.put("POWER_LEVEL", "MINUS8DBM");
                break;
            case (byte) 0x09:
                response.put("POWER_LEVEL", "MINUS9DBM");
                break;
            default:
                logger.debug("Unknown value {} for constant 'POWER_LEVEL'", String.format("%02X", payload[2]));
                response.put("POWER_LEVEL", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Timeout'
        response.put("TIMEOUT", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the POWERLEVEL_GET command.<br>
     *
     * Powerlevel Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelGet() {
        logger.debug("Creating command message POWERLEVEL_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_GET command<br>
     *
     * Powerlevel Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the POWERLEVEL_REPORT command.<br>
     *
     * Powerlevel Report<br>
     *
     *
     * @param powerLevel {@link String}
     * @param timeout {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelReport(String powerLevel, Integer timeout) {
        logger.debug("Creating command message POWERLEVEL_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_REPORT);

        // Process 'Power level'
        switch (powerLevel) {
            case "NORMALPOWER":
                outputData.write(0x00);
                break;
            case "MINUS1DBM":
                outputData.write(0x01);
                break;
            case "MINUS2DBM":
                outputData.write(0x02);
                break;
            case "MINUS3DBM":
                outputData.write(0x03);
                break;
            case "MINUS4DBM":
                outputData.write(0x04);
                break;
            case "MINUS5DBM":
                outputData.write(0x05);
                break;
            case "MINUS6DBM":
                outputData.write(0x06);
                break;
            case "MINUS7DBM":
                outputData.write(0x07);
                break;
            case "MINUS8DBM":
                outputData.write(0x08);
                break;
            case "MINUS9DBM":
                outputData.write(0x09);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for powerLevel: " + powerLevel);
        }

        // Process 'Timeout'
        outputData.write(timeout);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_REPORT command<br>
     *
     * Powerlevel Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>POWER_LEVEL {@link String}
     * <li>TIMEOUT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Power level'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("POWER_LEVEL", "NORMALPOWER");
                break;
            case (byte) 0x01:
                response.put("POWER_LEVEL", "MINUS1DBM");
                break;
            case (byte) 0x02:
                response.put("POWER_LEVEL", "MINUS2DBM");
                break;
            case (byte) 0x03:
                response.put("POWER_LEVEL", "MINUS3DBM");
                break;
            case (byte) 0x04:
                response.put("POWER_LEVEL", "MINUS4DBM");
                break;
            case (byte) 0x05:
                response.put("POWER_LEVEL", "MINUS5DBM");
                break;
            case (byte) 0x06:
                response.put("POWER_LEVEL", "MINUS6DBM");
                break;
            case (byte) 0x07:
                response.put("POWER_LEVEL", "MINUS7DBM");
                break;
            case (byte) 0x08:
                response.put("POWER_LEVEL", "MINUS8DBM");
                break;
            case (byte) 0x09:
                response.put("POWER_LEVEL", "MINUS9DBM");
                break;
            default:
                logger.debug("Unknown value {} for constant 'POWER_LEVEL'", String.format("%02X", payload[2]));
                response.put("POWER_LEVEL", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Timeout'
        response.put("TIMEOUT", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the POWERLEVEL_TEST_NODE_SET command.<br>
     *
     * Powerlevel Test Node Set<br>
     *
     *
     * @param testNodeid {@link Integer}
     * @param powerLevel {@link String}
     * @param testFrameCount {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelTestNodeSet(Integer testNodeid, String powerLevel, Integer testFrameCount) {
        logger.debug("Creating command message POWERLEVEL_TEST_NODE_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_TEST_NODE_SET);

        // Process 'Test NodeID'
        // Check the node number boundary
        if (testNodeid < 1 || testNodeid > 232) {
            logger.debug("Node number is out of bounds {}", testNodeid);
            return null;
        }
        outputData.write(testNodeid);

        // Process 'Power level'
        switch (powerLevel) {
            case "NORMALPOWER":
                outputData.write(0x00);
                break;
            case "MINUS1DBM":
                outputData.write(0x01);
                break;
            case "MINUS2DBM":
                outputData.write(0x02);
                break;
            case "MINUS3DBM":
                outputData.write(0x03);
                break;
            case "MINUS4DBM":
                outputData.write(0x04);
                break;
            case "MINUS5DBM":
                outputData.write(0x05);
                break;
            case "MINUS6DBM":
                outputData.write(0x06);
                break;
            case "MINUS7DBM":
                outputData.write(0x07);
                break;
            case "MINUS8DBM":
                outputData.write(0x08);
                break;
            case "MINUS9DBM":
                outputData.write(0x09);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for powerLevel: " + powerLevel);
        }

        // Process 'Test frame count'
        outputData.write((testFrameCount >> 8) & 0xff);
        outputData.write(testFrameCount & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_TEST_NODE_SET command<br>
     *
     * Powerlevel Test Node Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>TEST_NODEID {@link Integer}
     * <li>POWER_LEVEL {@link String}
     * <li>TEST_FRAME_COUNT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelTestNodeSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Test NodeID'
        response.put("TEST_NODEID", Integer.valueOf(payload[2]));

        // Process 'Power level'
        switch ((int) payload[3]) {
            case (byte) 0x00:
                response.put("POWER_LEVEL", "NORMALPOWER");
                break;
            case (byte) 0x01:
                response.put("POWER_LEVEL", "MINUS1DBM");
                break;
            case (byte) 0x02:
                response.put("POWER_LEVEL", "MINUS2DBM");
                break;
            case (byte) 0x03:
                response.put("POWER_LEVEL", "MINUS3DBM");
                break;
            case (byte) 0x04:
                response.put("POWER_LEVEL", "MINUS4DBM");
                break;
            case (byte) 0x05:
                response.put("POWER_LEVEL", "MINUS5DBM");
                break;
            case (byte) 0x06:
                response.put("POWER_LEVEL", "MINUS6DBM");
                break;
            case (byte) 0x07:
                response.put("POWER_LEVEL", "MINUS7DBM");
                break;
            case (byte) 0x08:
                response.put("POWER_LEVEL", "MINUS8DBM");
                break;
            case (byte) 0x09:
                response.put("POWER_LEVEL", "MINUS9DBM");
                break;
            default:
                logger.debug("Unknown value {} for constant 'POWER_LEVEL'", String.format("%02X", payload[3]));
                response.put("POWER_LEVEL", "UNKNOWN_" + String.format("%02X", payload[3]));
                break;
        }

        // Process 'Test frame count'
        response.put("TEST_FRAME_COUNT", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the POWERLEVEL_TEST_NODE_GET command.<br>
     *
     * Powerlevel Test Node Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelTestNodeGet() {
        logger.debug("Creating command message POWERLEVEL_TEST_NODE_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_TEST_NODE_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_TEST_NODE_GET command<br>
     *
     * Powerlevel Test Node Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelTestNodeGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the POWERLEVEL_TEST_NODE_REPORT command.<br>
     *
     * Powerlevel Test Node Report<br>
     *
     *
     * @param testNodeid {@link String}
     * @param statusOfOperation {@link String}
     * @param testFrameCount {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getPowerlevelTestNodeReport(String testNodeid, String statusOfOperation, Integer testFrameCount) {
        logger.debug("Creating command message POWERLEVEL_TEST_NODE_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(POWERLEVEL_TEST_NODE_REPORT);

        // Process 'Test NodeID'
        switch (testNodeid) {
            case "ZW_TEST_NOT_A_NODEID":
                outputData.write(0x00);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for testNodeid: " + testNodeid);
        }

        // Process 'Status of operation'
        switch (statusOfOperation) {
            case "ZW_TEST_FAILED":
                outputData.write(0x00);
                break;
            case "ZW_TEST_SUCCES":
                outputData.write(0x01);
                break;
            case "ZW_TEST_INPROGRESS":
                outputData.write(0x02);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for statusOfOperation: " + statusOfOperation);
        }

        // Process 'Test Frame Count'
        outputData.write((testFrameCount >> 8) & 0xff);
        outputData.write(testFrameCount & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the POWERLEVEL_TEST_NODE_REPORT command<br>
     *
     * Powerlevel Test Node Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>TEST_NODEID {@link String}
     * <li>STATUS_OF_OPERATION {@link String}
     * <li>TEST_FRAME_COUNT {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handlePowerlevelTestNodeReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Test NodeID'
        switch ((int) payload[2]) {
            case (byte) 0x00:
                response.put("TEST_NODEID", "ZW_TEST_NOT_A_NODEID");
                break;
            default:
                logger.debug("Unknown value {} for constant 'TEST_NODEID'", String.format("%02X", payload[2]));
                response.put("TEST_NODEID", "UNKNOWN_" + String.format("%02X", payload[2]));
                break;
        }

        // Process 'Status of operation'
        switch ((int) payload[3]) {
            case (byte) 0x00:
                response.put("STATUS_OF_OPERATION", "ZW_TEST_FAILED");
                break;
            case (byte) 0x01:
                response.put("STATUS_OF_OPERATION", "ZW_TEST_SUCCES");
                break;
            case (byte) 0x02:
                response.put("STATUS_OF_OPERATION", "ZW_TEST_INPROGRESS");
                break;
            default:
                logger.debug("Unknown value {} for constant 'STATUS_OF_OPERATION'", String.format("%02X", payload[3]));
                response.put("STATUS_OF_OPERATION", "UNKNOWN_" + String.format("%02X", payload[3]));
                break;
        }

        // Process 'Test Frame Count'
        response.put("TEST_FRAME_COUNT", Integer.valueOf(payload[4] << 8 + payload[5]));

        // Return the map of processed response data;
        return response;
    }

}