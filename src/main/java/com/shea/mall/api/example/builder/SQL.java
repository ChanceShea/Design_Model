package com.shea.mall.api.example.builder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author : Shea.
 * @description: TODO
 * @since : 2026/2/6 16:31
 */
public class SQL {
    private SQL() {}

//    public static SqlBuilder builder(SqlType type) {
//        return new SqlBuilder(type);
//    }

    public static SelectStage select(String... columns) {
        return new SelectBuilder(columns);
    }

    public static UpdateStage update(String table){
        return new UpdateBuilder(table);
    }

    public static DeleteStage delete(String table){
        return new DeleteBuilder(table);
    }

    public static InsertStage insert(String table){
        return new InsertBuilder(table);
    }

    public static class SelectBuilder implements SelectStage, WhereStage, BuildStage {
        private String[] columns;
        private String table;
        private String where;
        private SelectBuilder(String... columns) {
            this.columns = columns;
        }

        public WhereStage from(String table) {
            this.table = table;
            return this;
        }

        public BuildStage where(String where) {
            this.where = where;
            return this;
        }
        public String build(){
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ")
                    .append(String.join(", ", columns))
                    .append(" FROM ")
                    .append(table);
            if(where != null){
                sql.append(" WHERE ").append(where);
            }
            sql.append(";");
            return sql.toString();
        }
    }

    public static class UpdateBuilder implements SetStage,UpdateStage,BuildStage {
        private String table;
        private Map<String,String> setMap = new LinkedHashMap<>();
        private String where;

        private UpdateBuilder(String table) {
            this.table = table;
        }

        public SetStage set(String column, String value) {
            setMap.put(column, value);
            return this;
        }

        public SetStage where(String where){
            this.where = where;
            return this;
        }

        public String build(){
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE ")
                    .append(table)
                    .append(" SET ")
                    .append(String.join(", ", setMap.entrySet()
                            .stream()
                            .map(e -> e.getKey() + " = " + e.getValue())
                            .collect(Collectors.joining(","))));
            if (where != null) {
                sql.append(" WHERE ").append(where);
            }
            sql.append(";");
            return sql.toString();
        }
    }

    public static class DeleteBuilder implements DeleteStage,BuildStage {

        private String table;
        private String where;
        private DeleteBuilder(String table) {
            this.table = table;
        }

        public BuildStage where(String where){
            this.where = where;
            return this;
        }

        public String build(){
            StringBuilder sql = new StringBuilder();
            sql.append("DELETE FROM ")
                    .append(table)
                    .append(" WHERE ")
                    .append(where);
            sql.append(";");
            return sql.toString();
        }
    }

    public static class InsertBuilder implements InsertStage, BuildStage, ValuesStage {
        private String table;
        private String[] columns;
        private String[] values;

        private InsertBuilder(String table) {
            this.table = table;
        }

        public ValuesStage columns(String... columns) {
            this.columns = columns;
            return this;
        }

        public BuildStage values(String... values) {
            this.values = values;
            return this;
        }

        public String build(){
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO ")
                    .append(table)
                    .append(" (")
                    .append(String.join(", ", columns))
                    .append(") VALUES (")
                    .append(String.join(", ", values))
                    .append(")");
            sql.append(";");
            return sql.toString();
        }
    }
//    public static class SqlBuilder {
//        private final SqlType type;
//
//        private String[] columns;
//        private String table;
//        private String where;
//        private final Map<String,String> setMap = new LinkedHashMap<>();
//        private String[] insertKeys;
//        private String[] insertValues;
//
//        private SqlBuilder(SqlType type) {
//            this.type = type;
//        }
//
//        public SqlBuilder select(String... columns) {
//            this.columns = columns;
//            return this;
//        }
//        public SqlBuilder update(String key, String value) {
//            setMap.put(key, value);
//            return this;
//        }
//        public SqlBuilder delete(String table){
//            this.table = table;
//            return this;
//        }
//        // INSERT INTO TABLE(col1,col2,col3) VALUES(val1,val2,val3)
//        public SqlBuilder insert(String table){
//            this.table = table;
//            return this;
//        }
//        public SqlBuilder table(String table) {
//            this.table = table;
//            return this;
//        }
//        public SqlBuilder where(String where) {
//            this.where = where;
//            return this;
//        }
//        public SqlBuilder key(String... keys) {
//            this.insertKeys = keys;
//            return this;
//        }
//        public SqlBuilder value(String... values) {
//            this.insertValues = values;
//            return this;
//        }
//
//        public String build(){
//            StringBuilder sql = new StringBuilder();
//            switch (type) {
//                case SELECT -> {
//                    sql.append("SELECT ")
//                            .append(String.join(", ", columns))
//                            .append(" FROM ")
//                            .append(table)
//                            .append(" WHERE ")
//                            .append(where);
//                }
//                case UPDATE -> {
//                    sql.append("UPDATE ")
//                            .append(table)
//                            .append(" SET ")
//                            .append(String.join(", ", setMap.entrySet()
//                                    .stream()
//                                    .map(e -> e.getKey() + " = " + e.getValue())
//                                    .collect(Collectors.joining(","))));
//                    if (where != null) {
//                        sql.append(" WHERE ").append(where);
//                    }
//                }
//                case INSERT -> {
//                    sql.append("INSERT INTO ")
//                            .append(table)
//                            .append(" (")
//                            .append(String.join(", ", insertKeys))
//                            .append(") VALUES (")
//                            .append(String.join(", ", insertValues))
//                            .append(")");
//                }
//                case DELETE -> {
//                    sql.append("DELETE FROM ")
//                            .append(table)
//                            .append(" WHERE ")
//                            .append(where);
//                }
//            }
//            sql.append(";");
//            return sql.toString();
//        }
//    }
//
//    enum SqlType{
//        INSERT,
//        DELETE,
//        UPDATE,
//        SELECT
//    }
}
interface SelectStage {
    WhereStage from(String table);
}
interface WhereStage {
    BuildStage where(String where);
    String build();
}
interface BuildStage {
    String build();
}
interface SetStage {
    SetStage set(String column, String value);
    String build();
}
interface UpdateStage {
    SetStage where(String where);
}
interface DeleteStage {
    BuildStage where(String where);
}
interface InsertStage {
    ValuesStage columns(String... columns);
}
interface ValuesStage {
    BuildStage values(String... values);
}


