package com.maitao.result;

import java.util.List;

/**
 * 2017/8/26.
 */
public class ResponseResult {

    /**
     * 请求结果，success‐操作成功，failure‐操作失败
     */
    private String result;

    /**
     * result 为 failure 时该属性起效，并返回失败信息
     */
    private List<Error> errors;

    /**
     * authentication 接口限定的返回值，result 为 success 时返回，用于后续的提交或取消合同接口的 token 验证
     */
    private String token;

    /**
     * submitContract 接口限定的返回值，result 为 success 时返回，用于后续取消合同时的操作
     */
    private Contract contract;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "result='" + result + '\'' +
                ", errors=" + errors +
                ", token='" + token + '\'' +
                ", contract=" + contract +
                '}';
    }
}
