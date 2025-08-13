package com.zhoujian.forest.api;


import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.annotation.*;
import com.dtflys.forest.http.ForestResponse;

import java.util.List;
import java.util.Map;
public interface FlowApi {

    @Get(
            url = "http://127.0.0.1:6123/Middleware/v16/FlowWorkTask/getUserIdList"
    )
    Map<String, Object> getUserIdList(@Query("workFlowInsId") String workFlowInsId);

    @Get(
            url = "http://127.0.0.1:7001/pass-product/network-manage/business/import/network",
            headers = "Authorization: Test"
    )
    Map getTest(@Query("tenantId") String tenantId);
}
