package com.example.lib;

import com.example.lib.connector.TWConnector;
import com.example.lib.connector.USConnector;

/**
 * @author adam_yeh
 * @date 7/13/18
 */
public class Adapter implements TWConnector, USConnector {

    private TWConnector twConnector;
    private USConnector usConnector;

    public Adapter (TWConnector connector) {
        this.twConnector = connector;
    }

    public Adapter (USConnector connector) {
        this.usConnector = connector;
    }

    @Override
    public void getTWElectricity () {
        System.out.println("TW electricity transfer to US electricity...");
        usConnector.getUSElectricity();
    }

    @Override
    public void getUSElectricity () {
        System.out.println("US electricity transfer to TW electricity...");
        twConnector.getTWElectricity();
    }

}
