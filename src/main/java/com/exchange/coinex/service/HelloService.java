package com.exchange.coinex.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <功能描述> <br>
 *
 * @className: HelloService
 * @package: com.exchange.coinex.api
 * @author: kunlun
 * @date: 2020/3/16 12:52 下午
 */
@FeignClient(name = "hello-service", url = "https://api.github.com")
public interface HelloService {

    @GetMapping(value = "/search/repositories")
    String searchRepo(@RequestParam("q") String queryStr);
}
