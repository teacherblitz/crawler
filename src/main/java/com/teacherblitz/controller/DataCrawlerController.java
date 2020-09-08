package com.teacherblitz.controller;

import com.teacherblitz.service.DataCrawlerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 数据爬取
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/9/8
 */
@RestController
@RequestMapping("/data/crawler")
public class DataCrawlerController {

    private final DataCrawlerService dataCrawlerService;

    public DataCrawlerController(final DataCrawlerService dataCrawlerService) {
        this.dataCrawlerService = dataCrawlerService;
    }

    @PostMapping("/index")
    public String index() {
        dataCrawlerService.crawler();
        return "index";
    }

}
