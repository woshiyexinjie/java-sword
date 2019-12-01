package com.helloxin;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * Created by yexin on 2019/12/2.
 */
public class CacheTest {

    public static void main(String[] args) {
        Cache<String,String> cache = CacheBuilder.newBuilder().build();
        cache.put("word","Hello Guava Cache");
        System.out.println(cache.getIfPresent("word"));
    }
}
