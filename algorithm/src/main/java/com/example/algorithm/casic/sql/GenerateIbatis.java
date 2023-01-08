package com.example.algorithm.casic.sql;

/**
 * 生成ibatis对应的语句，提高生产效率
 */
public class GenerateIbatis {
    /**
     * 使用DBeaver自动生成SQL语句，使用此方法，生成dynamic，按条件查询结构
     * @param sql
     * @apiNote
     *  需要注意的是传入的sql语句FROM需大写
     */
    public static void generateSelectMethod(String sql){
        int from = sql.indexOf("FROM");
        String substring = sql.substring(6, from);
        substring = substring.replaceAll(" ", "");
        substring = substring.replaceAll("\r", "");
        substring = substring.replaceAll("\n", "");
        substring = substring.replaceAll("`", "");
        String[] split = substring.split(",");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<dynamic prepend=\"where\">");
        stringBuilder.append("\r\n");
        for (String str : split) {
            stringBuilder.append("<isNotEmpty property=\"");
            stringBuilder.append(str);
            stringBuilder.append("\" prepend=\"and\">");
            stringBuilder.append("\r\n");
            stringBuilder.append(str+"=#"+str+"#");
            stringBuilder.append("\r\n");
            stringBuilder.append("</isNotEmpty>");
            stringBuilder.append("\r\n");
        }
        stringBuilder.append("</dynamic>");
        System.out.println(stringBuilder);
    }

    /**
     * 使用DBeaver自动生成SQL语句，使用此方法，生成vaulues中的结构
     * @param sql
     * @apiNote
     * 参考以下例子：
     *
     *  <pre>{@code
     * INSERT INTO unary.tbl_backup_billing(uhostid, bksrc_name, uhostip, uhostname, cycleplan, id, bktype, retentiondays, storagesize, backuptime, datatime)
     * VALUES(NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);}</pre>
     *
     * generate
     * <pre>{@code
     * #uhostid#, #bksrc_name#, #uhostip#, #uhostname#, #cycleplan#, #id#, #bktype#, #retentiondays#, #storagesize#, #backuptime#, #datatime#，
     * }</pre>
     * 获得拼接好后的字符串，自行进行拼接
     */
    public static void generateInsertMethod(String sql){
        int start = sql.indexOf("(");
        int end = sql.indexOf(")");
        String substring = sql.substring(start+1, end);

        substring = substring.replaceAll(" ", "");
        substring = substring.replaceAll("\r", "");
        substring = substring.replaceAll("\n", "");
        substring = substring.replaceAll("`", "");
        substring = substring.replaceAll("\t", "");
        String[] split = substring.split(",");

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : split) {
            stringBuilder.append("#"+str+"#, ");
        }
        System.out.println(stringBuilder);
    }
    public static void main(String[] args) {
        String selectsql = "SELECT uhostid, bksrc_name, uhostip, uhostname, cycleplan, id, bktype, retentiondays, storagesize, backuptime, datatime\n" +
                "\t\t\t FROM unary.tbl_backup_billing;";
        String insertsql = "INSERT INTO unary.tbl_backup_billing\n" +
                "(uhostid, bksrc_name, uhostip, uhostname, cycleplan, id, bktype, retentiondays, storagesize, backuptime, datatime)\n" +
                "VALUES(NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);\n";

        generateSelectMethod(selectsql);
        generateInsertMethod(insertsql);
    }
}
