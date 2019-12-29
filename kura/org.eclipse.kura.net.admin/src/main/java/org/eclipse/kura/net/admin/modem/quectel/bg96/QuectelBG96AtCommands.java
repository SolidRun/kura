/*******************************************************************************
 * Copyright (c) 2019 Sterwen-Technology
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *     Sterwen-Technology
 *******************************************************************************/
package org.eclipse.kura.net.admin.modem.quectel.bg96;

/**
 * Defines AT commands for the Quectel BG96 modem.
 *
 * 
 *
 */
public enum QuectelBG96AtCommands {

    getSimStatus("AT+QSIMSTAT?\r\n"),
    getSimPinStatus("at+cpin?\r\n"),
    setAutoSimDetection("at+qsimdet=1,0\r\nat+qsimstat=1"),
    getSmsc("at+csca?\r\n"),
    getMobileStationClass("at+cgclass?\r\n"),
    getRegistrationStatus("at+cgreg?\r\n"),
    getGprsSessionDataVolume("at+QGDCNT?\r\n"),
    getSignalStrength("at+csq\r\n"),
    getModelNumber("at+gmm\r\n"),
    getManufacturer("at+gmi\r\n"),
    getSerialNumber("at+cgsn\r\n"),
    pdpContext("AT+CGDCONT");

    private String command;

    private QuectelBG96AtCommands(String atCommand) {
        this.command = atCommand;
    }

    public String getCommand() {
        return this.command;
    }
}