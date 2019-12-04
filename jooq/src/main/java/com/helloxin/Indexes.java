/*
 * This file is generated by jOOQ.
 */
package com.helloxin;


import com.helloxin.tables.Lottery;
import com.helloxin.tables.Movie;
import com.helloxin.tables.User;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>zootopia</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index LOTTERY_PRIMARY = Indexes0.LOTTERY_PRIMARY;
    public static final Index MOVIE_PRIMARY = Indexes0.MOVIE_PRIMARY;
    public static final Index USER_PRIMARY = Indexes0.USER_PRIMARY;
    public static final Index USER_USER_ID_INDEX = Indexes0.USER_USER_ID_INDEX;
    public static final Index USER_USER_PHONE_INDEX = Indexes0.USER_USER_PHONE_INDEX;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index LOTTERY_PRIMARY = Internal.createIndex("PRIMARY", Lottery.LOTTERY, new OrderField[] { Lottery.LOTTERY.ID }, true);
        public static Index MOVIE_PRIMARY = Internal.createIndex("PRIMARY", Movie.MOVIE, new OrderField[] { Movie.MOVIE.ID }, true);
        public static Index USER_PRIMARY = Internal.createIndex("PRIMARY", User.USER, new OrderField[] { User.USER.ID }, true);
        public static Index USER_USER_ID_INDEX = Internal.createIndex("user_id_index", User.USER, new OrderField[] { User.USER.USER_ID }, true);
        public static Index USER_USER_PHONE_INDEX = Internal.createIndex("user_phone_index", User.USER, new OrderField[] { User.USER.USER_PHONE }, false);
    }
}