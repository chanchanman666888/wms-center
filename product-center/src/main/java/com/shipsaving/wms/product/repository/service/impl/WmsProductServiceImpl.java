package com.shipsaving.wms.product.repository.service.impl;

import com.shipsaving.wms.product.repository.dao.WmpProductMapper;
import com.shipsaving.wms.product.repository.dataobject.WmsProductDO;
import com.shipsaving.wms.product.repository.service.IWmsProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class WmsProductServiceImpl implements IWmsProductService {

    @Autowired
    private WmpProductMapper wmpProductMapper;

    @Override
    public long createProduct(WmsProductDO wmsProductDO) {
        return 0;
    }
}
