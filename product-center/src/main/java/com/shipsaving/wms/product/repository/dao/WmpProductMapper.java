package com.shipsaving.wms.product.repository.dao;

import com.shipsaving.wms.product.repository.dataobject.WmsProductDO;

public interface WmpProductMapper {
    long createProduct(WmsProductDO wmsProductDO);
}
