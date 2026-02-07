package com.shea.mall.api.example.builder;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 16:42
 */
public class Main {

    public static void main(String[] args) {
//        String build = SQL.builder(SQL.SqlType.SELECT)
//                .select("name", "age", "sex")
//                .table("user")
//                .where("sex = '男'")
//                .build();
//        System.out.println(build);

        String select = SQL.select("name", "age", "sex")
                .from("user")
                .where("sex = '男'")
                .build();
        System.out.println(select);

//        String build = SQL.builder(SQL.SqlType.UPDATE)
//                .table("user")
//                .update("name", "'张三'")
//                .where("sex = '男'")
//                .build();
//        System.out.println(build);

        String update = SQL.update("user")
                .where("sex = '男'")
                .set("name", "'张三'")
                .build();
        System.out.println(update);

//        String build = SQL.builder(SQL.SqlType.DELETE)
//                .delete("user")
//                .where("sex = '男'")
//                .build();
//        System.out.println(build);
        String delete = SQL.delete("user").where("sex = '男'")
                .build();
        System.out.println(delete);

//        String build = SQL.builder(SQL.SqlType.INSERT)
//                .insert("user")
//                .key("name","age","sex")
//                .value("'张三'", "20", "'男'")
//                .build();
//        System.out.println(build);

        String insert = SQL.insert("user")
                .columns("name", "age", "sex")
                .values("'张三'", "20", "'男'")
                .build();
        System.out.println(insert);
    }
}
