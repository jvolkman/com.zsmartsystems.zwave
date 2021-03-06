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
import java.lang.IllegalArgumentException;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_ZIP_ND</b> version <b>1</b>.
 * <p>
 * Command Class Z/IP-ND
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x58.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassZipNdV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassZipNdV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_ZIP_ND
     */
    public final static int COMMAND_CLASS_KEY = 0x58;

    /**
     * Zip Node Advertisement Command Constant
     */
    public final static int ZIP_NODE_ADVERTISEMENT = 0x01;
    /**
     * Zip Node Solicitation Command Constant
     */
    public final static int ZIP_NODE_SOLICITATION = 0x03;
    /**
     * Zip Inverse Node Solicitation Command Constant
     */
    public final static int ZIP_INV_NODE_SOLICITATION = 0x04;


    /**
     * Map holding constants for ZipInvNodeSolicitationProperties1
     */
    private static Map<Integer, String> constantZipInvNodeSolicitationProperties1 = new HashMap<Integer, String>();

    /**
     * Map holding constants for ZipNodeAdvertisementProperties1
     */
    private static Map<Integer, String> constantZipNodeAdvertisementProperties1 = new HashMap<Integer, String>();
    static {

        // Constants for ZipInvNodeSolicitationProperties1
        constantZipInvNodeSolicitationProperties1.put(0x04, "LOCAL");

        // Constants for ZipNodeAdvertisementProperties1
        constantZipNodeAdvertisementProperties1.put(0x04, "LOCAL");
    }

    /**
     * Creates a new message with the ZIP_NODE_ADVERTISEMENT command.
     * <p>
     * Zip Node Advertisement
     *
     * @param validity {@link String}
     * @param local {@link Boolean}
     * @param nodeId {@link Integer}
     * @param ipv6Address {@link byte[]}
     * @param homeId {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNodeAdvertisement(String validity, Boolean local, Integer nodeId, byte[] ipv6Address,
            byte[] homeId) {
        logger.debug("Creating command message ZIP_NODE_ADVERTISEMENT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NODE_ADVERTISEMENT);

        // Process 'Properties1'
        int valProperties1 = 0;
        int valvalidity;
        switch (validity) {
            case "INFORMATION_OK":
                valvalidity = 0;
                break;
            case "INFORMATION_OBSOLETE":
                valvalidity = 1;
                break;
            case "INFORMATION_NOT_FOUND":
                valvalidity = 2;
                break;
            default:
                throw new IllegalArgumentException("Unknown enum value for validity: " + validity);
        }
        valProperties1 |= valvalidity & 0x03;
        valProperties1 |= local ? 0x04 : 0;
        outputData.write(valProperties1);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        // Process 'IPv6 Address'
        if (ipv6Address != null) {
            if (ipv6Address.length > 16) {
                throw new IllegalArgumentException("Length of array ipv6Address exceeds maximum length of 16 bytes");
            }
            try {
                outputData.write(ipv6Address);
            } catch (IOException e) {
            }
        }

        // Process 'Home ID'
        if (homeId != null) {
            if (homeId.length > 4) {
                throw new IllegalArgumentException("Length of array homeId exceeds maximum length of 4 bytes");
            }
            try {
                outputData.write(homeId);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NODE_ADVERTISEMENT command.
     * <p>
     * Zip Node Advertisement
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>VALIDITY {@link String}
     * <li>LOCAL {@link Boolean}
     * <li>NODE_ID {@link Integer}
     * <li>IPV6_ADDRESS {@link byte[]}
     * <li>HOME_ID {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNodeAdvertisement(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        switch (payload[2] & 0x03) {
            case 0x00:
                response.put("VALIDITY", "INFORMATION_OK");
                break;
            case 0x01:
                response.put("VALIDITY", "INFORMATION_OBSOLETE");
                break;
            case 0x02:
                response.put("VALIDITY", "INFORMATION_NOT_FOUND");
                break;
            default:
                logger.debug("Unknown enum value {} for VALIDITY", String.format("0x%02X", 2));
        }
        response.put("LOCAL", Boolean.valueOf((payload[2] & 0x04) != 0));

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[3]));

        // Process 'IPv6 Address'
        int lenIpv6Address = Math.min(16, payload.length - 4);
        byte[] valIpv6Address = new byte[lenIpv6Address];
        for (int cntIpv6Address = 0; cntIpv6Address < lenIpv6Address; cntIpv6Address++) {
            valIpv6Address[cntIpv6Address] = payload[4 + cntIpv6Address];
        }
        response.put("IPV6_ADDRESS", valIpv6Address);

        // Process 'Home ID'
        int lenHomeId = Math.min(4, payload.length - 20);
        byte[] valHomeId = new byte[lenHomeId];
        for (int cntHomeId = 0; cntHomeId < lenHomeId; cntHomeId++) {
            valHomeId[cntHomeId] = payload[20 + cntHomeId];
        }
        response.put("HOME_ID", valHomeId);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the ZIP_NODE_SOLICITATION command.
     * <p>
     * Zip Node Solicitation
     *
     * @param nodeId {@link Integer}
     * @param ipv6Address {@link byte[]}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipNodeSolicitation(Integer nodeId, byte[] ipv6Address) {
        logger.debug("Creating command message ZIP_NODE_SOLICITATION version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_NODE_SOLICITATION);

        // Process 'Reserved'
        outputData.write(0);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        // Process 'IPv6 Address'
        if (ipv6Address != null) {
            if (ipv6Address.length > 16) {
                throw new IllegalArgumentException("Length of array ipv6Address exceeds maximum length of 16 bytes");
            }
            try {
                outputData.write(ipv6Address);
            } catch (IOException e) {
            }
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_NODE_SOLICITATION command.
     * <p>
     * Zip Node Solicitation
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>NODE_ID {@link Integer}
     * <li>IPV6_ADDRESS {@link byte[]}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipNodeSolicitation(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[3]));

        // Process 'IPv6 Address'
        int lenIpv6Address = Math.min(16, payload.length - 4);
        byte[] valIpv6Address = new byte[lenIpv6Address];
        for (int cntIpv6Address = 0; cntIpv6Address < lenIpv6Address; cntIpv6Address++) {
            valIpv6Address[cntIpv6Address] = payload[4 + cntIpv6Address];
        }
        response.put("IPV6_ADDRESS", valIpv6Address);

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the ZIP_INV_NODE_SOLICITATION command.
     * <p>
     * Zip Inverse Node Solicitation
     *
     * @param local {@link Boolean}
     * @param nodeId {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getZipInvNodeSolicitation(Boolean local, Integer nodeId) {
        logger.debug("Creating command message ZIP_INV_NODE_SOLICITATION version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(ZIP_INV_NODE_SOLICITATION);

        // Process 'Properties1'
        outputData.write(local ? 0x04 : 0);

        // Process 'Node ID'
        // Check the node number boundary
        if (nodeId < 1 || nodeId > 232) {
            logger.debug("Node number is out of bounds {}", nodeId);
            return null;
        }
        outputData.write(nodeId);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the ZIP_INV_NODE_SOLICITATION command.
     * <p>
     * Zip Inverse Node Solicitation
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LOCAL {@link Boolean}
     * <li>NODE_ID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleZipInvNodeSolicitation(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Properties1'
        response.put("LOCAL", Boolean.valueOf((payload[2] & 0x04) != 0));

        // Process 'Node ID'
        response.put("NODE_ID", Integer.valueOf(payload[3]));

        // Return the map of processed response data;
        return response;
    }

}
