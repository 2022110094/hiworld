package cn.how2j.jsoup;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Test3 {

    public static void main(String[] args) throws Exception {

        File f = new File("c.html");
        if(!f.exists())
            return;

        Document doc = Jsoup.parse(f,"utf-8");

        Element e =doc.getElementById("d1");

        //获取属性
        System.out.println(e.attr("id"));

        //获取所有属性

        System.out.println(e.attributes());

        //获取id

        System.out.println(e.id());

        //获取类名称

        System.out.println(e.className());
        //获取所有类名称
        System.out.println(e.classNames());
        //获取文本
        System.out.println(e.text());
        //获取html
        System.out.println(e.html());
        //获取外html
        System.out.println(e.outerHtml());
        //获取标签信息
        System.out.println(e.tagName());

    }

}
