/*
 #################################################################
 #              _      _    _                       _            #
 #   __ _ _   _(_) ___| | _| |_   _    ___ ___   __| | ___ _ __  #
 #  / _` | | | | |/ __| |/ / | | | |  / __/ _ \ / _` |/ _ \ '__| #
 # | (_| | |_| | | (__|   <| | |_| | | (_| (_) | (_| |  __/ |    #
 #  \__, |\__,_|_|\___|_|\_\_|\__, |  \___\___/ \__,_|\___|_|    #
 #     |_|                    |___/                              #
 #################################################################
 #                  一缕青丝一缕魂，一生一世一双人。                  #
 #################################################################
 */
package com.codingapi.txlcn.manager;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：TX-LCN分布式事务服务端主启动类
 *
 * @author 头骨先生
 * @version 1.0-SNAPSHOT
 * @see SpringBootApplication
 * @see EnableTransactionManagerServer
 * @since 1.0-SNAPSHOT
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class Application {

    /**
     * 功能：TX-LCN分布式事务服务端启动方法
     *
     * @param args 启动参数数组
     * @since 1.0-SNAPSHOT
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
