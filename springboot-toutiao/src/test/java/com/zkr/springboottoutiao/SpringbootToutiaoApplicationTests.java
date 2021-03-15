package com.zkr.springboottoutiao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SpringBootTest
class SpringbootToutiaoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void jsoupList(){
        String string = "http://top.baidu.com/buzz?b=1";
        try {
            Document document = Jsoup.parse(new URL(string), 3000);
            String str = "main";
            Element element = document.getElementById(str);
            Elements elementsByTag = element.getElementsByClass("mainBody").eq(0);
            List<String> listhan = new ArrayList<>();
            List<String> listcount = new ArrayList<>();
            elementsByTag.forEach(
                    element1 -> element1.getElementsByClass("grayborder").eq(0).forEach(
                            element2 -> element2.getElementsByClass("list-table").eq(0).forEach(
                                    element3 -> element3.getElementsByTag("tbody").eq(0).forEach(
                                            element4 -> {
                                                Consumer<Element> consumer = element5 -> element5.getElementsByTag("td").forEach(
                                                        element6 -> element6.getElementsByClass("keyword").eq(0).forEach(
                                                                element7 -> element7.getElementsByTag("a").eq(0).forEach(
                                                                        element8 -> listhan.add(element8.text()))));
                                                element4.getElementsByClass("last").forEach(last-> listcount.add(last.getElementsByTag("span").eq(0).text()));
                                                element4.getElementsByTag("tr").forEach(
                                                        consumer);
                                            }))));
            for (int i = 0;i<listhan.size();i++){
                System.out.println("名称: "+listhan.get(i)+"     "+ "点击量："+listcount.get(i+1));
            }
        } catch (Exception e) {
            System.out.println("发生了爬取解析网址出错");
            e.printStackTrace();
        }
    }

}
