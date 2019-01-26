/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.rflink.config;

import org.openhab.binding.rflink.RfLinkBindingConstants;

/**
 * Configuration class for {@link RflinkBinding} device.
 *
 * @author Cyril Cauchois - Initial contribution
 * @author Marvyn Zalewski - added disableDiscovery Configuration
 * @author Wolfram Webers - added delay configuration
 */
public class RfLinkBridgeConfiguration {

    // Configuration for discovered bridge devices
    public String bridgeId;

    // Serial port for manual configuration
    public String serialPort;

    // Serial port baud rate
    public int baudRate = RfLinkBindingConstants.BAUD_RATE_DEFAULT;

    // Prevent unknown devices from being added to the inbox
    public boolean disableDiscovery;

    // Configurable delay between messages sent out
    public int sendDelay = RfLinkBindingConstants.SEND_DELAY;
}
