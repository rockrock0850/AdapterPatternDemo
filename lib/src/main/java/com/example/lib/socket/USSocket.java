package com.example.lib.socket;

import com.example.lib.connector.USConnector;

/**
 * @author adam_yeh
 * @date 7/13/18
 */
public class USSocket {

    public void plugIn (USConnector connector) {
        connector.getUSElectricity();
    }

}
