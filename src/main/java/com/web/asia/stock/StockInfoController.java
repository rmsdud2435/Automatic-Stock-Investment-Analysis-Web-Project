package com.web.asia.stock;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.web.asia.stock.dto.StockDto;
import com.web.asia.utils.ApiUtils.ApiResult;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock/info")
public class StockInfoController {
    
    @GetMapping(value="{stockName}/{date}")
    public ApiResult<List<StockDto>> findName(@PathVariable String stockName, @PathVariable String date){
/* 
        @Value("${stock.info.site}")
        String site;

        @Value("${stock.info.api}")
        String api; */

        URL url = new URL(site+api);
        HttpURLConnection con = (HttpURLConnection)url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("X-Naver-Client-Id", clientId);


        return;
    }
