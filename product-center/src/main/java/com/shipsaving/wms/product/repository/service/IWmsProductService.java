package com.shipsaving.wms.product.repository.service;

import com.shipsaving.wms.product.repository.dataobject.WmsProductDO;

public interface IWmsProductService {
    long createProduct(WmsProductDO wmsProductDO);
}
