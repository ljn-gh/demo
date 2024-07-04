package com.jianan.demomodule.test.es;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jianan.demomodule.test.es.model.Case;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author: jn
 * @Date: 2024/6/27
 * @description
 **/
public class EsTest {
    private RestHighLevelClient client;
    
    @BeforeEach
    public void bofore(){
        this.client = new RestHighLevelClient(RestClient.builder(HttpHost.create("http://localhost:9200")));
    }
    
    @Test
    public void test() throws IOException {
        
    }
    
    @Test
    public void init() throws Exception {
        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(RestClient.builder(HttpHost.create("http://localhost:9200")));
        String data = Files.readString(Paths.get("E:\\project\\lijianan\\文档\\aj.txt"));
        JSONArray array = JSON.parseArray(data);
        BulkRequest request = new BulkRequest();
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = array.getJSONObject(i).getJSONObject("_source");
            request.add(new IndexRequest("caseinfoall3").id(object.getString("caseid")).source(object.toJSONString(), XContentType.JSON));
        }
        restHighLevelClient.bulk(request, RequestOptions.DEFAULT);
        restHighLevelClient.close();
    }
    
    @AfterEach
    public void after() throws IOException {
        this.client.close();
    }
}
