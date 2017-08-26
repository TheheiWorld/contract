package com.maitao.result;

/**
 * 2017/8/26. 响应的合同相关信息
 */
public class Contract {

    /**
     * 合同对应服务端的唯一 ID
     */
    private String uid;

    /**
     * 合同号，无论是由客户端还是服务端生成都会返回
     */
    private String no;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
