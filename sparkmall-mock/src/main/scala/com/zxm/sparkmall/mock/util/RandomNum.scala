package com.zxm.sparkmall.mock.util

import java.util.Random

/**
  * @author zxm
  * @create 2019/2/16 - 14:34
  */
object RandomNum {

    /**
      * //nextInt(10)产生0-9,现在要实现前包后包的数据.
      * @param fromNum 2
      * @param toNum 12
      * @return 2-12的数据
      */
    def apply(fromNum:Int,toNum:Int): Int =  {
        fromNum + new Random().nextInt(toNum-fromNum+1)

    }
    def multi(fromNum:Int,toNum:Int,amount:Int,delimiter:String,canRepeat:Boolean) ={
        // 实现方法  在fromNum和 toNum之间的 多个数组拼接的字符串 共amount个
        //用delimiter分割  canRepeat为false则不允许重复
        ""
    }
}