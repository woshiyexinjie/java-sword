package com.helloxin;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by yexin on 2019/12/2.
 */
public class TableTest {
    public static void main(String[] args) {
        Table<String,String,Integer> tables= HashBasedTable.create();
        tables.put("a", "javase", 80);
        tables.put("b", "javaee", 90);
        tables.put("c", "javame", 100);
        tables.put("d", "guava", 70);
        System.out.println(tables);
    }
}
