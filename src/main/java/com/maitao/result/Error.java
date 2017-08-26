package com.maitao.result;

/**
 * 2017/8/26. 响应的错误信息
 */
public class Error {

    /**
     * 错误代码
     */
    private String code;

    /**
     * 错误信息
     */
    private String info;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
