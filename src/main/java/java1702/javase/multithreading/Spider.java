package java1702.javase.multithreading;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by ${刘晋勇}
 * on 2017/5/9.
 */
public class Spider {
    public static void main(String[] args) throws IOException {
        String url = "http://bj.lianjia.com/ershoufang/chaoyang/";
        Document document = Jsoup.connect(url).cookie("lianjia_uuid", "e7bb83d3-6db3-48cd-998b-94777fe2a237").get();
        Elements element = document.select("li[class=clear]");
        for (Element element1 : element) {
//            String region = element1.select("a[data-el=region]").first().text();
//            String totalPrice = element1.select("div[class=totalPrice]").first().text();
//            System.out.println("小区: " + region + "总价: " + totalPrice);
            Element houseInfo = element1.select("div[class = houseInfo]").first();
            for (Node node : houseInfo.childNodes()) {
                if (node instanceof TextNode) {
                    System.out.println(node.toString());
                }
            }

        }
    }
}
