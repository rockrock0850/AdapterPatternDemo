package com.example.lib.component;

import com.example.lib.connector.TWConnector;

/**
 * @author adam_yeh
 * @date 7/13/18
 */
public class TWFan implements TWConnector {

    @Override
    public void getTWElectricity () {
        System.out.println("TW electricity is working...");
    }

}
