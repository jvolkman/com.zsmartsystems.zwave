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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_LOCK</b> version <b>1</b>.
 * <p>
 * Command Class Lock
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassLockV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassLockV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_LOCK
     */
    public final static int COMMAND_CLASS_KEY = 0x76;

    /**
     * Lock Set Command Constant
     */
    public final static int LOCK_SET = 0x01;
    /**
     * Lock Get Command Constant
     */
    public final static int LOCK_GET = 0x02;
    /**
     * Lock Report Command Constant
     */
    public final static int LOCK_REPORT = 0x03;


    /**
     * Map holding constants for Lock State
     */
    private static Map<Integer, String> constantLockState = new HashMap<Integer, String>();
    static {

        // Constants for Lock State
        constantLockState.put(0x00, "UNLOCKED");
        constantLockState.put(0x01, "LOCKED");
    }

    /**
     * Creates a new message with the LOCK_SET command.
     * <p>
     * Lock Set
     *
     * @param lockState {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>UNLOCKED
     *            <li>LOCKED
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLockSet(String lockState) {
        logger.debug("Creating command message LOCK_SET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LOCK_SET);

        // Process 'Lock State'
        boolean foundLockState = false;
        for (Integer entry : constantLockState.keySet()) {
            if (constantLockState.get(entry).equals(lockState)) {
                outputData.write(entry);
                foundLockState = true;
                break;
            }
        }
        if (!foundLockState) {
            throw new IllegalArgumentException("Unknown constant value '" + lockState + "' for lockState");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LOCK_SET command.
     * <p>
     * Lock Set
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LOCK_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLockSet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Lock State'
        response.put("LOCK_STATE", constantLockState.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the LOCK_GET command.
     * <p>
     * Lock Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLockGet() {
        logger.debug("Creating command message LOCK_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LOCK_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LOCK_GET command.
     * <p>
     * Lock Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLockGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the LOCK_REPORT command.
     * <p>
     * Lock Report
     *
     * @param lockState {@link String}
     *            Can be one of the following -:
     *            <ul>
     *            <li>UNLOCKED
     *            <li>LOCKED
     *            </ul>
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getLockReport(String lockState) {
        logger.debug("Creating command message LOCK_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(LOCK_REPORT);

        // Process 'Lock State'
        boolean foundLockState = false;
        for (Integer entry : constantLockState.keySet()) {
            if (constantLockState.get(entry).equals(lockState)) {
                outputData.write(entry);
                foundLockState = true;
                break;
            }
        }
        if (!foundLockState) {
            throw new IllegalArgumentException("Unknown constant value '" + lockState + "' for lockState");
        }

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the LOCK_REPORT command.
     * <p>
     * Lock Report
     * <p>
     * The output data {@link Map} has the following properties -:
     *
     * <ul>
     * <li>LOCK_STATE {@link String}
     * </ul>
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleLockReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Process 'Lock State'
        response.put("LOCK_STATE", constantLockState.get(payload[2] & 0xff));

        // Return the map of processed response data;
        return response;
    }

}
