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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_WAKE_UP</b> version <b>1</b>.<br>
 *
 * Command Class Wake Up<br>
 *
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.<br>
 *
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassWakeUpV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassWakeUpV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_WAKE_UP
     */
    public final static int COMMAND_CLASS_KEY = 0x84;

    /**
     * Wake Up Interval Set Command Constant
     */
    public final static int WAKE_UP_INTERVAL_SET = 0x04;
    /**
     * Wake Up Interval Get Command Constant
     */
    public final static int WAKE_UP_INTERVAL_GET = 0x05;
    /**
     * Wake Up Interval Report Command Constant
     */
    public final static int WAKE_UP_INTERVAL_REPORT = 0x06;
    /**
     * Wake Up Notification Command Constant
     */
    public final static int WAKE_UP_NOTIFICATION = 0x07;
    /**
     * Wake Up No More Information Command Constant
     */
    public final static int WAKE_UP_NO_MORE_INFORMATION = 0x08;

    /**
     * Creates a new message with the WAKE_UP_INTERVAL_SET command.<br>
     *
     * Wake Up Interval Set<br>
     *
     *
     * @param nodeid {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getWakeUpIntervalSet(Integer nodeid) {
        logger.debug("Creating command message WAKE_UP_INTERVAL_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(WAKE_UP_INTERVAL_SET);

        // Process 'Seconds'

        // Process 'NodeID'
        // Check the node number boundary
        if (nodeid < 1 || nodeid > 232) {
            logger.debug("Node number is out of bounds {}", nodeid);
            return null;
        }
        outputData.write(nodeid);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the WAKE_UP_INTERVAL_SET command<br>
     *
     * Wake Up Interval Set<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NODEID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleWakeUpIntervalSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seconds'

        // Process 'NodeID'
        response.put("NODEID", Integer.valueOf(payload[5]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the WAKE_UP_INTERVAL_GET command.<br>
     *
     * Wake Up Interval Get<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getWakeUpIntervalGet() {
        logger.debug("Creating command message WAKE_UP_INTERVAL_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(WAKE_UP_INTERVAL_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the WAKE_UP_INTERVAL_GET command<br>
     *
     * Wake Up Interval Get<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleWakeUpIntervalGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the WAKE_UP_INTERVAL_REPORT command.<br>
     *
     * Wake Up Interval Report<br>
     *
     *
     * @param nodeid {@link Integer}
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getWakeUpIntervalReport(Integer nodeid) {
        logger.debug("Creating command message WAKE_UP_INTERVAL_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(WAKE_UP_INTERVAL_REPORT);

        // Process 'Seconds'

        // Process 'NodeID'
        // Check the node number boundary
        if (nodeid < 1 || nodeid > 232) {
            logger.debug("Node number is out of bounds {}", nodeid);
            return null;
        }
        outputData.write(nodeid);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the WAKE_UP_INTERVAL_REPORT command<br>
     *
     * Wake Up Interval Report<br>
     *
     *
     * The output data {@link Map} has the following properties<br>
     *
     * <ul>
     * <li>NODEID {@link Integer}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleWakeUpIntervalReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Seconds'

        // Process 'NodeID'
        response.put("NODEID", Integer.valueOf(payload[5]));

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the WAKE_UP_NOTIFICATION command.<br>
     *
     * Wake Up Notification<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getWakeUpNotification() {
        logger.debug("Creating command message WAKE_UP_NOTIFICATION version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(WAKE_UP_NOTIFICATION);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the WAKE_UP_NOTIFICATION command<br>
     *
     * Wake Up Notification<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleWakeUpNotification(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

    /**
     * Creates a new message with the WAKE_UP_NO_MORE_INFORMATION command.<br>
     *
     * Wake Up No More Information<br>
     *
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getWakeUpNoMoreInformation() {
        logger.debug("Creating command message WAKE_UP_NO_MORE_INFORMATION version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(WAKE_UP_NO_MORE_INFORMATION);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the WAKE_UP_NO_MORE_INFORMATION command<br>
     *
     * Wake Up No More Information<br>
     *
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleWakeUpNoMoreInformation(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

}