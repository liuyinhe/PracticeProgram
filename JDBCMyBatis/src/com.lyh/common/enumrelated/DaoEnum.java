package com.lyh.common.enumrelated;

/**
 * DaoEnum
 *
 * @author Galaxy  Liu
 * @date 2017/1/2
 */
public enum DaoEnum {

    QUERYFAIL("0000", "查询失败！");
    private String code;
    private String message;

    DaoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
