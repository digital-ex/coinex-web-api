package com.exchange.coinex.api;

import com.exchange.coinex.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <功能描述> <br>
 *
 * @className: HelloController
 * @package: com.exchange.coinex.api
 * @author: kunlun
 * @date: 2020/3/16 1:00 下午
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/search/github")
    public String search(@RequestParam("str")String queryStr){
        return helloService.searchRepo(queryStr);
    }
}
