package com.jack.test;

/**
 * Created by jack on 2017/10/25.
 */

import com.jack.bean.Client;

import javax.websocket.ContainerProvider;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;
import java.net.URI;

/**
 * http://www.cnblogs.com/akanairen/p/5616351.html
 */
public class WebsocketClient2 {

    public static void main(String[] args) {
        try {

            WebSocketContainer container = ContainerProvider.getWebSocketContainer(); // 获取WebSocket连接器，其中具体实现可以参照websocket-api.jar的源码,Class.forName("org.apache.tomcat.websocket.WsWebSocketContainer");
            String uri = "ws://localhost:9090/websocket";
            //String uri = "ws://localhost:9090/log";
            Session session = null; // 连接会话
            session = container.connectToServer(Client.class, new URI(uri));
            session.getBasicRemote().sendText("123132132131"); // 发送文本消息
            session.getBasicRemote().sendText("4564546");
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
