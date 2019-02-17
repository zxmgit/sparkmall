package com.zxm.sparkmall.common.utils

import java.io.InputStreamReader
import java.util.Properties

/**
  * @author zxm
  * @create 2019/2/16 - 14:13
  */
object PropertiesUtil {
    def main(args: Array[String]): Unit = {
        val properties: Properties = PropertiesUtil.load("config.properties")

        println(properties.getProperty("kafka.broker.list"))
    }

    def load(propertieName:String): Properties ={
        val prop=new Properties();
        prop.load(new InputStreamReader(Thread.currentThread().getContextClassLoader.getResourceAsStream(propertieName) , "UTF-8"))
        prop
    }
}
