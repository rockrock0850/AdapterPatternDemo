package com.example.lib.component;

import com.example.lib.connector.USConnector;

/**
 * @author adam_yeh
 * @date 7/13/18
 */
public class USFan implements USConnector {

    @Override
    public void getUSElectricity () {
        System.out.println("US electricity is working...");
    }

}
