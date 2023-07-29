package com.example.product;

import com.example.product.model.Sku;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestTemplateService {

    public ResponseEntity<List<Object>> getRequestSku(){
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> params = new HashMap<>();
        params.put("id", "prod1");
        ResponseEntity response = restTemplate
                .getForEntity("http://localhost:8081/getSkuByProduct?id=prod1",  Object.class);
        return response;
    }


}
