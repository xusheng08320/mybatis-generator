package com.xusheng.model;

import com.xusheng.utils.CommonStringUtil;
import lombok.Data;

/**
 * @Author xusheng
 * @Date 2021/7/20 7:26 下午
 * @Desc
 */
@Data
public class Column {

    private String tableName;

    private String columnName;

    private String columnType;

    private String columnComment;

    // TODO xusheng
    public String getFieldType() {
        return null;
    }

    public String getFieldName() {
        return CommonStringUtil.convertUnderStream2Camel(columnName);
    }
}
