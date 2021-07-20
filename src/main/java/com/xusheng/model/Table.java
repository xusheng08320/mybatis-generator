package com.xusheng.model;

import lombok.Data;

import java.util.List;

/**
 * @Author xusheng
 * @Date 2021/7/20 7:35 下午
 * @Desc
 */
@Data
public class Table {
    private String tableName;
    private String tableComment;
    private List<Column> columns;

}
