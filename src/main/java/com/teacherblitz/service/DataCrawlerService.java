package com.teacherblitz.service;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 数据爬取业务
 * 
 * @author: <a href="mailto:teacherblitz@gmail.com">teacherblitz</a>
 * @since: 2020/9/8
 */
@Slf4j
@Service("dataCrawlerService")
public class DataCrawlerService {


    /**
     * 数据抓取
     */
    public void crawler() {
        try {
            Document doc = Jsoup.connect("https://www.baidu.com/").get();
            Elements newsHeadlines = doc.select("a[href]");
            for (Element headline : newsHeadlines) {
                System.out.println("href: " +headline.absUrl("href") );
            }
        } catch (IOException e) {
            log.info("数据爬取失败：{}", e.getMessage());
            e.printStackTrace();
        }
    }
}
