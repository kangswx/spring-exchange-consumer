package com.kangswx.rabbitmq.consumer;

import com.kangswx.rabbitmq.domain.News;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NewsConsumer {

    public void recv(News news){
        System.out.println("接收到最新消息： " + news.getTitle() + ":" + news.getSource());
    }

    public static void main(String[] args) {
        //手动初始化Spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }
}
