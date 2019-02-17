package com.zxm.sparkmall.common.bean

/**
  * @author zxm
  * @create 2019/2/16 - 14:19
  */
/**
  * 产品表
  *
  * @param product_id   商品的ID
  * @param product_name 商品的名称
  * @param extend_info  商品额外的信息
  */
case class ProductInfo(product_id: Long,
                       product_name: String,
                       extend_info: String
                      )

