/*
 * This file is generated by jOOQ.
 */
package com.helloxin;


import com.helloxin.tables.Lottery;
import com.helloxin.tables.Movie;
import com.helloxin.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in zootopia
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>zootopia.lottery</code>.
     */
    public static final Lottery LOTTERY = Lottery.LOTTERY;

    /**
     * The table <code>zootopia.movie</code>.
     */
    public static final Movie MOVIE = Movie.MOVIE;

    /**
     * The table <code>zootopia.user</code>.
     */
    public static final User USER = User.USER;
}