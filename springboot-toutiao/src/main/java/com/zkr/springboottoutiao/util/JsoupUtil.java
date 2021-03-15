package com.zkr.springboottoutiao.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author LiuGang
 * @date 2021/2/11 - 0:40
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Component
public class JsoupUtil {

    /**
     * 爬虫组件
     */


    /**
     * jsoup 爬取工具
     * @param string  爬取网址
     */
    public void jsoupList(String string){
        try {
            Document document = Jsoup.connect(string).get();
            // <a href="https://voice.hupu.com/nba/2484553.html" target="_blank">霍华德：夏休期内曾节食30天，这考验了我的身心</a>
            //Elements elements = document.select("div.news-list > ul > li > div.list-hd > h4 > a");
            String str = "div.s-news-rank-wrapper s-news-special-rank-wrapper c-container-r > div.s-rank-title s-opacity-border1-bottom > a > div";
            Elements select = document.select(str);
            System.out.println(select);
        } catch (IOException e) {
            System.out.println("发生了爬取解析网址出错");
            e.printStackTrace();
        }
    }
}
