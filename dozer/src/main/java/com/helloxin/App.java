package com.helloxin;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mapper mapper = new DozerBeanMapper();
        DataA dataA = new DataA();
        dataA.setId(0L);
        dataA.setName("hello");
        dataA.setDate(new Date());
        DataB dataB =mapper.map(dataA, DataB.class);
        System.out.println(dataB.toString());
    }
}
