package com.maitao.webservice;

import com.alibaba.fastjson.JSON;
import com.maitao.result.ResponseResult;
import com.maitao.weservice.ContractWebService;
import com.maitao.weservice.ContractWebService_Service;
import com.maitao.weservice.SubmitContractRequest;
import org.junit.Test;

/**
 * 2017/8/26.
 */
public class WebServiceTest {

    private ContractWebService service = new ContractWebService_Service().getContractWebServiceImplPort();

    /**
     * 认证接口
     */
    @Test
    public void authenticationOTA () {

        String code = "goldpalm-a1";
        String password = "bb33374d29ccdc19ad634401f332da75";

        String result = service.authenticationOTA(code, password);
        ResponseResult responseResult = JSON.parseObject(result, ResponseResult.class);

        System.out.println(responseResult.toString());

        String token = responseResult.getToken();

    }

    private SubmitContractRequest getSubmitContractRequest () {
        SubmitContractRequest submitContractRequest = new SubmitContractRequest();

        return submitContractRequest;
    }


}
