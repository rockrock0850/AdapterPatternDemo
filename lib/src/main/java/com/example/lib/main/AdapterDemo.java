package com.example.lib.main;

import com.example.lib.Adapter;
import com.example.lib.component.TWFan;
import com.example.lib.component.USFan;
import com.example.lib.connector.TWConnector;
import com.example.lib.connector.USConnector;
import com.example.lib.socket.TWSocket;
import com.example.lib.socket.USSocket;

public class AdapterDemo {

    public static void main (String[] arg0) {
        USConnector usAdapter = new Adapter(new TWFan());// 台灣的電風扇接上轉接器
        new USSocket().plugIn(usAdapter);// 將轉接器插上美國的插座

        System.out.println("--------------------------------------------------");

        TWConnector twAdapter = new Adapter(new USFan());// 美國的電風扇接上轉接器
        new TWSocket().plugIn(twAdapter);// 將轉接器插上台灣的插座
    }

}
