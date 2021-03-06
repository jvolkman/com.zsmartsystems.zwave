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
 * Class to implement the Z-Wave command class <b>COMMAND_CLASS_AV_TAGGING_MD</b> version <b>1</b>.
 * <p>
 * Command Class Av Tagging Md
 * <p>
 * This class provides static methods for processing received messages (message handler) and
 * methods to get a message to send on the Z-Wave network.
 * <p>
 * Command class key is 0x99.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class CommandClassAvTaggingMdV1 {
    private static final Logger logger = LoggerFactory.getLogger(CommandClassAvTaggingMdV1.class);

    /**
     * Integer command class key for COMMAND_CLASS_AV_TAGGING_MD
     */
    public final static int COMMAND_CLASS_KEY = 0x99;

    /**
     * Av Tagging Md Get Command Constant
     */
    public final static int AV_TAGGING_MD_GET = 0x01;
    /**
     * Av Tagging Md Report Command Constant
     */
    public final static int AV_TAGGING_MD_REPORT = 0x02;


    /**
     * Creates a new message with the AV_TAGGING_MD_GET command.
     * <p>
     * Av Tagging Md Get
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAvTaggingMdGet() {
        logger.debug("Creating command message AV_TAGGING_MD_GET version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(AV_TAGGING_MD_GET);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the AV_TAGGING_MD_GET command.
     * <p>
     * Av Tagging Md Get
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAvTaggingMdGet(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }


    /**
     * Creates a new message with the AV_TAGGING_MD_REPORT command.
     * <p>
     * Av Tagging Md Report
     *
     * @return the {@link byte[]} array with the command to send
     */
    static public byte[] getAvTaggingMdReport() {
        logger.debug("Creating command message AV_TAGGING_MD_REPORT version 1");

        ByteArrayOutputStream outputData = new ByteArrayOutputStream();
        outputData.write(COMMAND_CLASS_KEY);
        outputData.write(AV_TAGGING_MD_REPORT);

        return outputData.toByteArray();
    }

    /**
     * Processes a received frame with the AV_TAGGING_MD_REPORT command.
     * <p>
     * Av Tagging Md Report
     *
     * @param payload the {@link byte[]} payload data to process
     * @return a {@link Map} of processed response data
     */
    public static Map<String, Object> handleAvTaggingMdReport(byte[] payload) {
        // Create our response map
        Map<String, Object> response = new HashMap<String, Object>();

        // Return the map of processed response data;
        return response;
    }

}
