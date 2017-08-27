package com.maitao.webservice;

import com.alibaba.fastjson.JSON;
import com.maitao.result.ResponseResult;
import com.maitao.weservice.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

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
        String s = service.submitContract(token, this.getSubmitContractRequest());
        System.out.println(s);

    }

    private SubmitContractRequest getSubmitContractRequest () {
        SubmitContractRequest submitContractRequest = new SubmitContractRequest();
        submitContractRequest.setNo("MT12");
        submitContractRequest.setNoemail("juststand@yeah.net");
        submitContractRequest.setNomsg("测试代码");
        submitContractRequest.setPlatsource("麦淘");
        submitContractRequest.setPrice(12.22);
        submitContractRequest.setTransactor("XIAO ZHU");
        submitContractRequest.setTravelemail("juststand@yeah.net");
        submitContractRequest.setTravelmobile("1093424242");
        submitContractRequest.setTravelname("zhangsan");
        submitContractRequest.setVersion("dlcj2014");
        submitContractRequest.setContractJSON(new ContractJSON());
        submitContractRequest.setContractTeam(this.getContractTeam());
        return submitContractRequest;

    }

    private ContractTeam getContractTeam () {
        ContractTeam contractTeam = new ContractTeam();
        contractTeam.setTeamcode("V161211015");
        contractTeam.setLinename("台湾环岛8日经济实惠游（3钻）—升级2晚五花酒店");
        contractTeam.setDays(4);
        contractTeam.setNights(4);
        contractTeam.setEnddate(new Date());
        Date end = new Date();

        Calendar instance = Calendar.getInstance();
        instance.setTime(end);
        instance.add(Calendar.DATE,4);
        end = instance.getTime();

        contractTeam.setBgndate(end);
        contractTeam.setQty(1);
        contractTeam.setOptype("出境");
        contractTeam.getRoutes().add(this.getContractTeamRoute());
        contractTeam.getGuests().add(this.getContractTeamGuest());
        return contractTeam;
    }

    private ContractTeamRoute getContractTeamRoute () {
        ContractTeamRoute contractTeamRoute = new ContractTeamRoute();
        contractTeamRoute.setDay(4);
        contractTeamRoute.setStop(2);
        contractTeamRoute.setDepartcity("shanghai");
        contractTeamRoute.setArrivecity("shanghai");
        contractTeamRoute.setArrivenation("zhongguo");
        contractTeamRoute.setArrivestate("shanghai");
        contractTeamRoute.setMemo("nihaonihao");
        contractTeamRoute.setTransit("1");
        return contractTeamRoute;
    }

    private ContractTeamGuest getContractTeamGuest () {
        ContractTeamGuest guest = new ContractTeamGuest();
        guest.setIdtype(2);
        guest.setIdcode("dsdsds");
        guest.setName("xiao h");
        guest.setSex("nan");
        guest.setNo(12324);
        return guest;
    }

    private ContractJSON getContractJSON () {
        return null;
    }

}
