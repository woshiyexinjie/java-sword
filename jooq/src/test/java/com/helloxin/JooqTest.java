package com.helloxin;

import com.helloxin.tables.User;
import com.helloxin.tables.records.UserRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by yebanxian on 2019/12/4.
 */
@Slf4j
public class JooqTest {

    private static DSLContext dslContext;

    @BeforeAll
    public static void before() {
        dslContext = getDSLContext();
    }

    @Test
    public void find() {
        dslContext.selectFrom(Tables.USER)
                .where(User.USER.USER_ID.eq("23423452354"))
                .fetchInto(UserRecord.class)
                .stream()
                .forEach(user -> System.out.println(user.get(2)));
    }


    private static DSLContext getDSLContext() {
        try {
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/zootopia", "root","souche2015");
            return DSL.using(connection, SQLDialect.MYSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
