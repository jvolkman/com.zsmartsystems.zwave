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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ZWAVEPLUS_INFO</b> version <b>2</b>.<br>
 *
 * Command Class Z-Wave+ Info<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassZwaveplusInfoV2 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassZwaveplusInfoV2.class);

    /**
     * Integer command class key for COMMAND_CLASS_ZWAVEPLUS_INFO
     */
    public final static int COMMAND_CLASS_KEY = 0x5E;

    /**
     * Z-Wave+ Info Get Command Constant
     */
    public final static int ZWAVEPLUS_INFO_GET = 0x01;
    /**
     * Z-Wave+ Info Report Command Constant
     */
    public final static int ZWAVEPLUS_INFO_REPORT = 0x02;

    /**
     * Creates a new message with the ZWAVEPLUS_INFO_GET command.<br>
     *
     * Z-Wave+ Info Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZwaveplusInfoGet() {
        logger.debug("Creating command message ZWAVEPLUS_INFO_GET version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZWAVEPLUS_INFO_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZWAVEPLUS_INFO_GET command<br>
     *
     * Z-Wave+ Info Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZwaveplusInfoGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the ZWAVEPLUS_INFO_REPORT command.<br>
     *
     * Z-Wave+ Info Report<br>
     *
     *
     * @param zWavePlusVersion {@link Integer}
     * @param roleType {@link String}
     * @param nodeType {@link String}
     * @param installerIconType {@link Integer}
     * @param userIconType {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZwaveplusInfoReport(Integer zWavePlusVersion, String roleType, String nodeType,
            Integer installerIconType, Integer userIconType) {
        logger.debug("Creating command message ZWAVEPLUS_INFO_REPORT version 2");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZWAVEPLUS_INFO_REPORT);

        // Process 'Z-Wave+ Version'
        outputData.write(zWavePlusVersion);

        // Process 'Role Type'
        switch (roleType) {
            case "ROLE_TYPE_CONTROLLER_CENTRAL_STATIC":
                outputData.write(0x00);
                break;
            case "ROLE_TYPE_CONTROLLER_SUB_STATIC":
                outputData.write(0x01);
                break;
            case "ROLE_TYPE_CONTROLLER_PORTABLE":
                outputData.write(0x02);
                break;
            case "ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING":
                outputData.write(0x03);
                break;
            case "ROLE_TYPE_SLAVE_PORTABLE":
                outputData.write(0x04);
                break;
            case "ROLE_TYPE_SLAVE_ALWAYS_ON":
                outputData.write(0x05);
                break;
            case "ROLE_TYPE_SLAVE_SLEEPING_REPORTING":
                outputData.write(0x06);
                break;
            case "ROLE_TYPE_SLAVE_SLEEPING_LISTENING":
                outputData.write(0x07);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for roleType: " + roleType);
        }

        // Process 'Node Type'
        switch (nodeType) {
            case "NODE_TYPE_ZWAVEPLUS_NODE":
                outputData.write(0x00);
                break;
            case "NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY":
                outputData.write(0x02);
                break;
            default:
                throw new IllegalArgumentException("Unknown constant value for nodeType: " + nodeType);
        }

        // Process 'Installer Icon Type'
        outputData.write((installerIconType >> 8) & 0xff);
        outputData.write(installerIconType & 0xff);

        // Process 'User Icon Type'
        outputData.write((userIconType >> 8) & 0xff);
        outputData.write(userIconType & 0xff);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZWAVEPLUS_INFO_REPORT command<br>
     *
     * Z-Wave+ Info Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>Z_WAVE_PLUS_VERSION {@link Integer}
     * <li>ROLE_TYPE {@link String}
     * <li>NODE_TYPE {@link String}
     * <li>INSTALLER_ICON_TYPE {@link Integer}
     * <li>USER_ICON_TYPE {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZwaveplusInfoReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Z-Wave+ Version'
        response.put("Z_WAVE_PLUS_VERSION", Integer.valueOf(payload[2]));

        // Process 'Role Type'
        switch ((int) payload[3]) {
            case (byte) 0x00:
                response.put("ROLE_TYPE", "ROLE_TYPE_CONTROLLER_CENTRAL_STATIC");
                break;
            case (byte) 0x01:
                response.put("ROLE_TYPE", "ROLE_TYPE_CONTROLLER_SUB_STATIC");
                break;
            case (byte) 0x02:
                response.put("ROLE_TYPE", "ROLE_TYPE_CONTROLLER_PORTABLE");
                break;
            case (byte) 0x03:
                response.put("ROLE_TYPE", "ROLE_TYPE_CONTROLLER_PORTABLE_REPORTING");
                break;
            case (byte) 0x04:
                response.put("ROLE_TYPE", "ROLE_TYPE_SLAVE_PORTABLE");
                break;
            case (byte) 0x05:
                response.put("ROLE_TYPE", "ROLE_TYPE_SLAVE_ALWAYS_ON");
                break;
            case (byte) 0x06:
                response.put("ROLE_TYPE", "ROLE_TYPE_SLAVE_SLEEPING_REPORTING");
                break;
            case (byte) 0x07:
                response.put("ROLE_TYPE", "ROLE_TYPE_SLAVE_SLEEPING_LISTENING");
                break;
            default:
                logger.debug("Unknown value {} for constant 'ROLE_TYPE'", String.format("%02X", payload[3]));
                response.put("ROLE_TYPE", "UNKNOWN_" + String.format("%02X", payload[3]));
                break;
        }

        // Process 'Node Type'
        switch ((int) payload[4]) {
            case (byte) 0x00:
                response.put("NODE_TYPE", "NODE_TYPE_ZWAVEPLUS_NODE");
                break;
            case (byte) 0x02:
                response.put("NODE_TYPE", "NODE_TYPE_ZWAVEPLUS_FOR_IP_GATEWAY");
                break;
            default:
                logger.debug("Unknown value {} for constant 'NODE_TYPE'", String.format("%02X", payload[4]));
                response.put("NODE_TYPE", "UNKNOWN_" + String.format("%02X", payload[4]));
                break;
        }

        // Process 'Installer Icon Type'
        response.put("INSTALLER_ICON_TYPE", Integer.valueOf(payload[5] << 8 + payload[6]));

        // Process 'User Icon Type'
        response.put("USER_ICON_TYPE", Integer.valueOf(payload[7] << 8 + payload[8]));

        // Return the map of processed response data;
        return response;
    }

}