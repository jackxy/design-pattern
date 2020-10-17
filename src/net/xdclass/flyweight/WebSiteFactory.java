package net.xdclass.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class WebSiteFactory {

    /**
     * map里面的key是分类
     */
    private Map<String,ConcreteWebSite> map = new HashMap<>();


    /**
     * 根据key获取分类站点
     * @param category
     * @return
     */
    public CloudWebSite getWebSiteByCategory(String category){

        if(map.containsKey(category)){
            return map.get(category);
        }else {
            ConcreteWebSite site = new ConcreteWebSite(category);
            map.put(category,site);
            return site;
        }
    }
    /**
     * 获取分类个数
     * @return
     */
    public int getWebsiteCategorySize(){
        return map.size();
    }

}
