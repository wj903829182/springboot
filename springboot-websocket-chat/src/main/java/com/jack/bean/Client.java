package com.jack.bean;

import org.springframework.stereotype.Component;

import javax.websocket.*;

/**
 * Created by jack on 2017/10/25.
 */
@ClientEndpoint
public class Client {
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected to endpoint: " + session.getBasicRemote());
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);
    }

    @OnError
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @OnClose
    public void onClose(Session session){
        System.out.println("websocket连接关闭:"+session.getId());
    }
}
