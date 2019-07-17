package com.imooc.ad.service;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.*;


import java.io.IOException;

/**
 * @author zmsb
 * @data 2019/7/10
 */
public class BinlogServiceTest {

    public static void  main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient(
                "localhost",
                3306,
                "root",
                "123456"
        );
        client.registerEventListener(event -> {
            EventData data = event.getData();
            if (data instanceof UpdateRowsEventData){
                System.out.println("Update---------------");
                System.out.println(data.toString());
            }else if (data instanceof WriteRowsEventData){
                System.out.println("Write---------------");
                System.out.println(data.toString());
            }else if (data instanceof DeleteRowsEventData){
                System.out.println("Delete---------------");
                System.out.println(data.toString());
            }
          }
        );
        client.connect();
    }
}
