/*
 * (c) Midland Software Limited 2019
 * Name     : Maps.java
 * Author   : ferraciolliw
 * Date     : 09 Jul 2019
 */
package com.wiltech.chapter.one;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Maps {

    Map<String, String> map = new HashMap<>();

    {
        map.put("india", "delhi");
    }

    public static void main(String[] args) {

        Maps m = new Maps();
        System.out.println(m.map.get("india"));
    }
}


