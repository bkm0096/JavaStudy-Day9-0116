package org.example;

import org.example.menu.*;
import org.example.store.BasicRes;
import org.example.store.BusanRes;
import org.example.store.DaeguRes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws Exception {

        HashMap<String, MenuService> map = new HashMap<>();

        map.put("mega", new MegaMenuService());
        map.put("compose", new ComposeMenuService());

        MenuService menuService = map.get("mega");

        menuService.getMenuList();


//        String url = "https://www.mega-mgccoffee.com/menu/menu.php?menu_category1=1&menu_category2=1&category=&list_checkbox_all=all";
//        Document doc = Jsoup.connect(url).get();
//        //System.out.println(doc);
//
//        Element element = doc.selectFirst("#menu_list");
//        //System.out.println(element);
//
//        Elements names = element.select(".text1 b");
//        //System.out.println(names);
//
//        List<String> nameList = names.eachText();
//        System.out.println(nameList);

//        ArrayList<BasicRes> resList = new ArrayList<>();
//
//        resList.add(new BasicRes());
//        resList.add(new BusanRes());
//        resList.add(new DaeguRes());
//
//        resList.forEach(r -> {
//            r.makeZazang();
//        });



    }
}