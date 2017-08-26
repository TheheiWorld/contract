package com.maitao.webservice;

import com.maitao.weservice.ContractWebService;
import com.maitao.weservice.ContractWebService_Service;
import org.junit.Test;

/**
 * 2017/8/26.
 */
public class WebServiceTest {

    private ContractWebService service = new ContractWebService_Service().getContractWebServiceImplPort();

    @Test
    public void authenticationOTA () {

        String code = "goldpalm-a1";
        String password = "bb33374d29ccdc19ad634401f332da75";

        String result = service.authenticationOTA(code, password);
    }
}
