package com.zhoujian.forest;

import com.alibaba.fastjson.JSONObject;
import com.dtflys.forest.http.ForestResponse;
import com.zhoujian.forest.api.FlowApi;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class ForestApplicationTests {

    @Resource
    private FlowApi flowApi;

    @Test
    void contextLoads() {
        //Map test = flowApi.getTest("1");
        //System.out.println(test);
        flowApi.getUserIdList("1");
    }

}
