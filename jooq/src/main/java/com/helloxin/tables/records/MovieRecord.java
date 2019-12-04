/*
 * This file is generated by jOOQ.
 */
package com.helloxin.tables.records;


import com.helloxin.tables.Movie;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MovieRecord extends UpdatableRecordImpl<MovieRecord> implements Record14<UInteger, String, String, String, Double, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> {

    private static final long serialVersionUID = -1691021085;

    /**
     * Setter for <code>zootopia.movie.id</code>. 电影表主键
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>zootopia.movie.id</code>. 电影表主键
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>zootopia.movie.movie_name</code>. 电影名字
     */
    public void setMovieName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>zootopia.movie.movie_name</code>. 电影名字
     */
    public String getMovieName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>zootopia.movie.director</code>. 导演
     */
    public void setDirector(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>zootopia.movie.director</code>. 导演
     */
    public String getDirector() {
        return (String) get(2);
    }

    /**
     * Setter for <code>zootopia.movie.duration</code>. 时长
     */
    public void setDuration(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>zootopia.movie.duration</code>. 时长
     */
    public String getDuration() {
        return (String) get(3);
    }

    /**
     * Setter for <code>zootopia.movie.score</code>. 评分
     */
    public void setScore(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>zootopia.movie.score</code>. 评分
     */
    public Double getScore() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>zootopia.movie.date_release</code>. 发型时间
     */
    public void setDateRelease(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>zootopia.movie.date_release</code>. 发型时间
     */
    public String getDateRelease() {
        return (String) get(5);
    }

    /**
     * Setter for <code>zootopia.movie.region</code>. 地区
     */
    public void setRegion(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>zootopia.movie.region</code>. 地区
     */
    public String getRegion() {
        return (String) get(6);
    }

    /**
     * Setter for <code>zootopia.movie.actors</code>. 主演
     */
    public void setActors(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>zootopia.movie.actors</code>. 主演
     */
    public String getActors() {
        return (String) get(7);
    }

    /**
     * Setter for <code>zootopia.movie.category</code>. 分类
     */
    public void setCategory(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>zootopia.movie.category</code>. 分类
     */
    public String getCategory() {
        return (String) get(8);
    }

    /**
     * Setter for <code>zootopia.movie.source</code>. 来源
     */
    public void setSource(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>zootopia.movie.source</code>. 来源
     */
    public String getSource() {
        return (String) get(9);
    }

    /**
     * Setter for <code>zootopia.movie.douban_detail</code>. 豆瓣详情地址
     */
    public void setDoubanDetail(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>zootopia.movie.douban_detail</code>. 豆瓣详情地址
     */
    public String getDoubanDetail() {
        return (String) get(10);
    }

    /**
     * Setter for <code>zootopia.movie.date_create</code>. 创建时间
     */
    public void setDateCreate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>zootopia.movie.date_create</code>. 创建时间
     */
    public Timestamp getDateCreate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>zootopia.movie.date_update</code>. 更新时间
     */
    public void setDateUpdate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>zootopia.movie.date_update</code>. 更新时间
     */
    public Timestamp getDateUpdate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>zootopia.movie.is_delete</code>. 是否删除 0-&gt;默认，1-&gt;软删除
     */
    public void setIsDelete(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>zootopia.movie.is_delete</code>. 是否删除 0-&gt;默认，1-&gt;软删除
     */
    public Boolean getIsDelete() {
        return (Boolean) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UInteger, String, String, String, Double, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UInteger, String, String, String, Double, String, String, String, String, String, String, Timestamp, Timestamp, Boolean> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return Movie.MOVIE.ID;
    }

    @Override
    public Field<String> field2() {
        return Movie.MOVIE.MOVIE_NAME;
    }

    @Override
    public Field<String> field3() {
        return Movie.MOVIE.DIRECTOR;
    }

    @Override
    public Field<String> field4() {
        return Movie.MOVIE.DURATION;
    }

    @Override
    public Field<Double> field5() {
        return Movie.MOVIE.SCORE;
    }

    @Override
    public Field<String> field6() {
        return Movie.MOVIE.DATE_RELEASE;
    }

    @Override
    public Field<String> field7() {
        return Movie.MOVIE.REGION;
    }

    @Override
    public Field<String> field8() {
        return Movie.MOVIE.ACTORS;
    }

    @Override
    public Field<String> field9() {
        return Movie.MOVIE.CATEGORY;
    }

    @Override
    public Field<String> field10() {
        return Movie.MOVIE.SOURCE;
    }

    @Override
    public Field<String> field11() {
        return Movie.MOVIE.DOUBAN_DETAIL;
    }

    @Override
    public Field<Timestamp> field12() {
        return Movie.MOVIE.DATE_CREATE;
    }

    @Override
    public Field<Timestamp> field13() {
        return Movie.MOVIE.DATE_UPDATE;
    }

    @Override
    public Field<Boolean> field14() {
        return Movie.MOVIE.IS_DELETE;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getMovieName();
    }

    @Override
    public String component3() {
        return getDirector();
    }

    @Override
    public String component4() {
        return getDuration();
    }

    @Override
    public Double component5() {
        return getScore();
    }

    @Override
    public String component6() {
        return getDateRelease();
    }

    @Override
    public String component7() {
        return getRegion();
    }

    @Override
    public String component8() {
        return getActors();
    }

    @Override
    public String component9() {
        return getCategory();
    }

    @Override
    public String component10() {
        return getSource();
    }

    @Override
    public String component11() {
        return getDoubanDetail();
    }

    @Override
    public Timestamp component12() {
        return getDateCreate();
    }

    @Override
    public Timestamp component13() {
        return getDateUpdate();
    }

    @Override
    public Boolean component14() {
        return getIsDelete();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getMovieName();
    }

    @Override
    public String value3() {
        return getDirector();
    }

    @Override
    public String value4() {
        return getDuration();
    }

    @Override
    public Double value5() {
        return getScore();
    }

    @Override
    public String value6() {
        return getDateRelease();
    }

    @Override
    public String value7() {
        return getRegion();
    }

    @Override
    public String value8() {
        return getActors();
    }

    @Override
    public String value9() {
        return getCategory();
    }

    @Override
    public String value10() {
        return getSource();
    }

    @Override
    public String value11() {
        return getDoubanDetail();
    }

    @Override
    public Timestamp value12() {
        return getDateCreate();
    }

    @Override
    public Timestamp value13() {
        return getDateUpdate();
    }

    @Override
    public Boolean value14() {
        return getIsDelete();
    }

    @Override
    public MovieRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public MovieRecord value2(String value) {
        setMovieName(value);
        return this;
    }

    @Override
    public MovieRecord value3(String value) {
        setDirector(value);
        return this;
    }

    @Override
    public MovieRecord value4(String value) {
        setDuration(value);
        return this;
    }

    @Override
    public MovieRecord value5(Double value) {
        setScore(value);
        return this;
    }

    @Override
    public MovieRecord value6(String value) {
        setDateRelease(value);
        return this;
    }

    @Override
    public MovieRecord value7(String value) {
        setRegion(value);
        return this;
    }

    @Override
    public MovieRecord value8(String value) {
        setActors(value);
        return this;
    }

    @Override
    public MovieRecord value9(String value) {
        setCategory(value);
        return this;
    }

    @Override
    public MovieRecord value10(String value) {
        setSource(value);
        return this;
    }

    @Override
    public MovieRecord value11(String value) {
        setDoubanDetail(value);
        return this;
    }

    @Override
    public MovieRecord value12(Timestamp value) {
        setDateCreate(value);
        return this;
    }

    @Override
    public MovieRecord value13(Timestamp value) {
        setDateUpdate(value);
        return this;
    }

    @Override
    public MovieRecord value14(Boolean value) {
        setIsDelete(value);
        return this;
    }

    @Override
    public MovieRecord values(UInteger value1, String value2, String value3, String value4, Double value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12, Timestamp value13, Boolean value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MovieRecord
     */
    public MovieRecord() {
        super(Movie.MOVIE);
    }

    /**
     * Create a detached, initialised MovieRecord
     */
    public MovieRecord(UInteger id, String movieName, String director, String duration, Double score, String dateRelease, String region, String actors, String category, String source, String doubanDetail, Timestamp dateCreate, Timestamp dateUpdate, Boolean isDelete) {
        super(Movie.MOVIE);

        set(0, id);
        set(1, movieName);
        set(2, director);
        set(3, duration);
        set(4, score);
        set(5, dateRelease);
        set(6, region);
        set(7, actors);
        set(8, category);
        set(9, source);
        set(10, doubanDetail);
        set(11, dateCreate);
        set(12, dateUpdate);
        set(13, isDelete);
    }
}
