package com.helloxin;

import lombok.Data;
import lombok.ToString;
import org.dozer.Mapping;

import java.util.Date;

/**
 * @author: xjye  @create: 2019-11-29
 **/
@Data
@ToString
public class DataB {
    private long id;
    @Mapping("name")
    private String name2;
    private Date date;
}
