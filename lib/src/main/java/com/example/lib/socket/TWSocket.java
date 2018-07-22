package com.example.lib.socket;

import com.example.lib.connector.TWConnector;

/**
 * @author adam_yeh
 * @date 7/13/18
 */
public class TWSocket {

    public void plugIn (TWConnector connector) {
        connector.getTWElectricity();
    }

}
