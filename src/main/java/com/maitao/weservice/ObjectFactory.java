
package com.maitao.weservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.maitao.weservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SubmitCARetryResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitCARetryResponse");
    private final static QName _SubmitContractWithSignResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContractWithSignResponse");
    private final static QName _SubmitSignResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitSignResponse");
    private final static QName _AuthenticationOTA_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "authenticationOTA");
    private final static QName _GetMsgCodeResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getMsgCodeResponse");
    private final static QName _SubmitContractResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContractResponse");
    private final static QName _AddContractResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "addContractResponse");
    private final static QName _CancelContractV2Response_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "cancelContractV2Response");
    private final static QName _GetSignCreate_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getSignCreate");
    private final static QName _AddContract_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "addContract");
    private final static QName _GetContractBaseInfo_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getContractBaseInfo");
    private final static QName _ResendMsgResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "resendMsgResponse");
    private final static QName _CancelContract_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "cancelContract");
    private final static QName _GetSignCreateResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getSignCreateResponse");
    private final static QName _SubmitContractWithSign_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContractWithSign");
    private final static QName _GetContractUuid_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getContractUuid");
    private final static QName _AuthenticationOTAResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "authenticationOTAResponse");
    private final static QName _SubmitSign_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitSign");
    private final static QName _GetMsgCode_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getMsgCode");
    private final static QName _SubmitCARetry_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitCARetry");
    private final static QName _CancelContractResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "cancelContractResponse");
    private final static QName _ConfirmContractWithEseal_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "confirmContractWithEseal");
    private final static QName _SubmitContractWithEseal_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContractWithEseal");
    private final static QName _CreateContractPayQrResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "createContractPayQrResponse");
    private final static QName _CreateContractPayQr_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "createContractPayQr");
    private final static QName _AuthenticationResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "authenticationResponse");
    private final static QName _CancelContractV2_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "cancelContractV2");
    private final static QName _ResendMsg_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "resendMsg");
    private final static QName _GetContractUuidResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getContractUuidResponse");
    private final static QName _SubmitContractWithEsealResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContractWithEsealResponse");
    private final static QName _GetContractBaseInfoResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "getContractBaseInfoResponse");
    private final static QName _UploadContract_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "uploadContract");
    private final static QName _SubmitContract_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitContract");
    private final static QName _SubmitStatusResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitStatusResponse");
    private final static QName _SubmitStatus_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "submitStatus");
    private final static QName _Authentication_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "authentication");
    private final static QName _ConfirmContractWithEsealResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "confirmContractWithEsealResponse");
    private final static QName _UploadContractResponse_QNAME = new QName("http://server.ws.api.contract.goldpalm.com/", "uploadContractResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.maitao.weservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmitSign }
     * 
     */
    public SubmitSign createSubmitSign() {
        return new SubmitSign();
    }

    /**
     * Create an instance of {@link GetMsgCode }
     * 
     */
    public GetMsgCode createGetMsgCode() {
        return new GetMsgCode();
    }

    /**
     * Create an instance of {@link SubmitCARetry }
     * 
     */
    public SubmitCARetry createSubmitCARetry() {
        return new SubmitCARetry();
    }

    /**
     * Create an instance of {@link CancelContractResponse }
     * 
     */
    public CancelContractResponse createCancelContractResponse() {
        return new CancelContractResponse();
    }

    /**
     * Create an instance of {@link ConfirmContractWithEseal }
     * 
     */
    public ConfirmContractWithEseal createConfirmContractWithEseal() {
        return new ConfirmContractWithEseal();
    }

    /**
     * Create an instance of {@link SubmitContractWithEseal }
     * 
     */
    public SubmitContractWithEseal createSubmitContractWithEseal() {
        return new SubmitContractWithEseal();
    }

    /**
     * Create an instance of {@link CreateContractPayQrResponse }
     * 
     */
    public CreateContractPayQrResponse createCreateContractPayQrResponse() {
        return new CreateContractPayQrResponse();
    }

    /**
     * Create an instance of {@link CreateContractPayQr }
     * 
     */
    public CreateContractPayQr createCreateContractPayQr() {
        return new CreateContractPayQr();
    }

    /**
     * Create an instance of {@link AuthenticationResponse }
     * 
     */
    public AuthenticationResponse createAuthenticationResponse() {
        return new AuthenticationResponse();
    }

    /**
     * Create an instance of {@link CancelContractV2 }
     * 
     */
    public CancelContractV2 createCancelContractV2() {
        return new CancelContractV2();
    }

    /**
     * Create an instance of {@link ResendMsg }
     * 
     */
    public ResendMsg createResendMsg() {
        return new ResendMsg();
    }

    /**
     * Create an instance of {@link GetContractUuidResponse }
     * 
     */
    public GetContractUuidResponse createGetContractUuidResponse() {
        return new GetContractUuidResponse();
    }

    /**
     * Create an instance of {@link SubmitContractWithEsealResponse }
     * 
     */
    public SubmitContractWithEsealResponse createSubmitContractWithEsealResponse() {
        return new SubmitContractWithEsealResponse();
    }

    /**
     * Create an instance of {@link GetContractBaseInfoResponse }
     * 
     */
    public GetContractBaseInfoResponse createGetContractBaseInfoResponse() {
        return new GetContractBaseInfoResponse();
    }

    /**
     * Create an instance of {@link UploadContract }
     * 
     */
    public UploadContract createUploadContract() {
        return new UploadContract();
    }

    /**
     * Create an instance of {@link SubmitContract }
     * 
     */
    public SubmitContract createSubmitContract() {
        return new SubmitContract();
    }

    /**
     * Create an instance of {@link SubmitStatusResponse }
     * 
     */
    public SubmitStatusResponse createSubmitStatusResponse() {
        return new SubmitStatusResponse();
    }

    /**
     * Create an instance of {@link SubmitStatus }
     * 
     */
    public SubmitStatus createSubmitStatus() {
        return new SubmitStatus();
    }

    /**
     * Create an instance of {@link Authentication }
     * 
     */
    public Authentication createAuthentication() {
        return new Authentication();
    }

    /**
     * Create an instance of {@link ConfirmContractWithEsealResponse }
     * 
     */
    public ConfirmContractWithEsealResponse createConfirmContractWithEsealResponse() {
        return new ConfirmContractWithEsealResponse();
    }

    /**
     * Create an instance of {@link UploadContractResponse }
     * 
     */
    public UploadContractResponse createUploadContractResponse() {
        return new UploadContractResponse();
    }

    /**
     * Create an instance of {@link SubmitCARetryResponse }
     * 
     */
    public SubmitCARetryResponse createSubmitCARetryResponse() {
        return new SubmitCARetryResponse();
    }

    /**
     * Create an instance of {@link SubmitContractWithSignResponse }
     * 
     */
    public SubmitContractWithSignResponse createSubmitContractWithSignResponse() {
        return new SubmitContractWithSignResponse();
    }

    /**
     * Create an instance of {@link SubmitSignResponse }
     * 
     */
    public SubmitSignResponse createSubmitSignResponse() {
        return new SubmitSignResponse();
    }

    /**
     * Create an instance of {@link AuthenticationOTA }
     * 
     */
    public AuthenticationOTA createAuthenticationOTA() {
        return new AuthenticationOTA();
    }

    /**
     * Create an instance of {@link GetMsgCodeResponse }
     * 
     */
    public GetMsgCodeResponse createGetMsgCodeResponse() {
        return new GetMsgCodeResponse();
    }

    /**
     * Create an instance of {@link SubmitContractResponse }
     * 
     */
    public SubmitContractResponse createSubmitContractResponse() {
        return new SubmitContractResponse();
    }

    /**
     * Create an instance of {@link AddContractResponse }
     * 
     */
    public AddContractResponse createAddContractResponse() {
        return new AddContractResponse();
    }

    /**
     * Create an instance of {@link CancelContractV2Response }
     * 
     */
    public CancelContractV2Response createCancelContractV2Response() {
        return new CancelContractV2Response();
    }

    /**
     * Create an instance of {@link GetSignCreate }
     * 
     */
    public GetSignCreate createGetSignCreate() {
        return new GetSignCreate();
    }

    /**
     * Create an instance of {@link AddContract }
     * 
     */
    public AddContract createAddContract() {
        return new AddContract();
    }

    /**
     * Create an instance of {@link GetContractBaseInfo }
     * 
     */
    public GetContractBaseInfo createGetContractBaseInfo() {
        return new GetContractBaseInfo();
    }

    /**
     * Create an instance of {@link ResendMsgResponse }
     * 
     */
    public ResendMsgResponse createResendMsgResponse() {
        return new ResendMsgResponse();
    }

    /**
     * Create an instance of {@link CancelContract }
     * 
     */
    public CancelContract createCancelContract() {
        return new CancelContract();
    }

    /**
     * Create an instance of {@link GetSignCreateResponse }
     * 
     */
    public GetSignCreateResponse createGetSignCreateResponse() {
        return new GetSignCreateResponse();
    }

    /**
     * Create an instance of {@link SubmitContractWithSign }
     * 
     */
    public SubmitContractWithSign createSubmitContractWithSign() {
        return new SubmitContractWithSign();
    }

    /**
     * Create an instance of {@link GetContractUuid }
     * 
     */
    public GetContractUuid createGetContractUuid() {
        return new GetContractUuid();
    }

    /**
     * Create an instance of {@link AuthenticationOTAResponse }
     * 
     */
    public AuthenticationOTAResponse createAuthenticationOTAResponse() {
        return new AuthenticationOTAResponse();
    }

    /**
     * Create an instance of {@link CancelRequest }
     * 
     */
    public CancelRequest createCancelRequest() {
        return new CancelRequest();
    }

    /**
     * Create an instance of {@link ContractJSON }
     * 
     */
    public ContractJSON createContractJSON() {
        return new ContractJSON();
    }

    /**
     * Create an instance of {@link ContractRequest }
     * 
     */
    public ContractRequest createContractRequest() {
        return new ContractRequest();
    }

    /**
     * Create an instance of {@link ConfirmRequest }
     * 
     */
    public ConfirmRequest createConfirmRequest() {
        return new ConfirmRequest();
    }

    /**
     * Create an instance of {@link SubmitRequest }
     * 
     */
    public SubmitRequest createSubmitRequest() {
        return new SubmitRequest();
    }

    /**
     * Create an instance of {@link ContractTeamRoute }
     * 
     */
    public ContractTeamRoute createContractTeamRoute() {
        return new ContractTeamRoute();
    }

    /**
     * Create an instance of {@link SubmitStatusRequest }
     * 
     */
    public SubmitStatusRequest createSubmitStatusRequest() {
        return new SubmitStatusRequest();
    }

    /**
     * Create an instance of {@link ContractTeamGuest }
     * 
     */
    public ContractTeamGuest createContractTeamGuest() {
        return new ContractTeamGuest();
    }

    /**
     * Create an instance of {@link SubmitContractRequest }
     * 
     */
    public SubmitContractRequest createSubmitContractRequest() {
        return new SubmitContractRequest();
    }

    /**
     * Create an instance of {@link ComplementSignRequest }
     * 
     */
    public ComplementSignRequest createComplementSignRequest() {
        return new ComplementSignRequest();
    }

    /**
     * Create an instance of {@link ContractTeamShopping }
     * 
     */
    public ContractTeamShopping createContractTeamShopping() {
        return new ContractTeamShopping();
    }

    /**
     * Create an instance of {@link ContractTeamActivity }
     * 
     */
    public ContractTeamActivity createContractTeamActivity() {
        return new ContractTeamActivity();
    }

    /**
     * Create an instance of {@link ContractTeam }
     * 
     */
    public ContractTeam createContractTeam() {
        return new ContractTeam();
    }

    /**
     * Create an instance of {@link CancelContractRequest }
     * 
     */
    public CancelContractRequest createCancelContractRequest() {
        return new CancelContractRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitCARetryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitCARetryResponse")
    public JAXBElement<SubmitCARetryResponse> createSubmitCARetryResponse(SubmitCARetryResponse value) {
        return new JAXBElement<SubmitCARetryResponse>(_SubmitCARetryResponse_QNAME, SubmitCARetryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractWithSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContractWithSignResponse")
    public JAXBElement<SubmitContractWithSignResponse> createSubmitContractWithSignResponse(SubmitContractWithSignResponse value) {
        return new JAXBElement<SubmitContractWithSignResponse>(_SubmitContractWithSignResponse_QNAME, SubmitContractWithSignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitSignResponse")
    public JAXBElement<SubmitSignResponse> createSubmitSignResponse(SubmitSignResponse value) {
        return new JAXBElement<SubmitSignResponse>(_SubmitSignResponse_QNAME, SubmitSignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationOTA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "authenticationOTA")
    public JAXBElement<AuthenticationOTA> createAuthenticationOTA(AuthenticationOTA value) {
        return new JAXBElement<AuthenticationOTA>(_AuthenticationOTA_QNAME, AuthenticationOTA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsgCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getMsgCodeResponse")
    public JAXBElement<GetMsgCodeResponse> createGetMsgCodeResponse(GetMsgCodeResponse value) {
        return new JAXBElement<GetMsgCodeResponse>(_GetMsgCodeResponse_QNAME, GetMsgCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContractResponse")
    public JAXBElement<SubmitContractResponse> createSubmitContractResponse(SubmitContractResponse value) {
        return new JAXBElement<SubmitContractResponse>(_SubmitContractResponse_QNAME, SubmitContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "addContractResponse")
    public JAXBElement<AddContractResponse> createAddContractResponse(AddContractResponse value) {
        return new JAXBElement<AddContractResponse>(_AddContractResponse_QNAME, AddContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelContractV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "cancelContractV2Response")
    public JAXBElement<CancelContractV2Response> createCancelContractV2Response(CancelContractV2Response value) {
        return new JAXBElement<CancelContractV2Response>(_CancelContractV2Response_QNAME, CancelContractV2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignCreate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getSignCreate")
    public JAXBElement<GetSignCreate> createGetSignCreate(GetSignCreate value) {
        return new JAXBElement<GetSignCreate>(_GetSignCreate_QNAME, GetSignCreate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "addContract")
    public JAXBElement<AddContract> createAddContract(AddContract value) {
        return new JAXBElement<AddContract>(_AddContract_QNAME, AddContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractBaseInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getContractBaseInfo")
    public JAXBElement<GetContractBaseInfo> createGetContractBaseInfo(GetContractBaseInfo value) {
        return new JAXBElement<GetContractBaseInfo>(_GetContractBaseInfo_QNAME, GetContractBaseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResendMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "resendMsgResponse")
    public JAXBElement<ResendMsgResponse> createResendMsgResponse(ResendMsgResponse value) {
        return new JAXBElement<ResendMsgResponse>(_ResendMsgResponse_QNAME, ResendMsgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "cancelContract")
    public JAXBElement<CancelContract> createCancelContract(CancelContract value) {
        return new JAXBElement<CancelContract>(_CancelContract_QNAME, CancelContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSignCreateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getSignCreateResponse")
    public JAXBElement<GetSignCreateResponse> createGetSignCreateResponse(GetSignCreateResponse value) {
        return new JAXBElement<GetSignCreateResponse>(_GetSignCreateResponse_QNAME, GetSignCreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractWithSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContractWithSign")
    public JAXBElement<SubmitContractWithSign> createSubmitContractWithSign(SubmitContractWithSign value) {
        return new JAXBElement<SubmitContractWithSign>(_SubmitContractWithSign_QNAME, SubmitContractWithSign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractUuid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getContractUuid")
    public JAXBElement<GetContractUuid> createGetContractUuid(GetContractUuid value) {
        return new JAXBElement<GetContractUuid>(_GetContractUuid_QNAME, GetContractUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationOTAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "authenticationOTAResponse")
    public JAXBElement<AuthenticationOTAResponse> createAuthenticationOTAResponse(AuthenticationOTAResponse value) {
        return new JAXBElement<AuthenticationOTAResponse>(_AuthenticationOTAResponse_QNAME, AuthenticationOTAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitSign")
    public JAXBElement<SubmitSign> createSubmitSign(SubmitSign value) {
        return new JAXBElement<SubmitSign>(_SubmitSign_QNAME, SubmitSign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsgCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getMsgCode")
    public JAXBElement<GetMsgCode> createGetMsgCode(GetMsgCode value) {
        return new JAXBElement<GetMsgCode>(_GetMsgCode_QNAME, GetMsgCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitCARetry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitCARetry")
    public JAXBElement<SubmitCARetry> createSubmitCARetry(SubmitCARetry value) {
        return new JAXBElement<SubmitCARetry>(_SubmitCARetry_QNAME, SubmitCARetry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "cancelContractResponse")
    public JAXBElement<CancelContractResponse> createCancelContractResponse(CancelContractResponse value) {
        return new JAXBElement<CancelContractResponse>(_CancelContractResponse_QNAME, CancelContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmContractWithEseal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "confirmContractWithEseal")
    public JAXBElement<ConfirmContractWithEseal> createConfirmContractWithEseal(ConfirmContractWithEseal value) {
        return new JAXBElement<ConfirmContractWithEseal>(_ConfirmContractWithEseal_QNAME, ConfirmContractWithEseal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractWithEseal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContractWithEseal")
    public JAXBElement<SubmitContractWithEseal> createSubmitContractWithEseal(SubmitContractWithEseal value) {
        return new JAXBElement<SubmitContractWithEseal>(_SubmitContractWithEseal_QNAME, SubmitContractWithEseal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractPayQrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "createContractPayQrResponse")
    public JAXBElement<CreateContractPayQrResponse> createCreateContractPayQrResponse(CreateContractPayQrResponse value) {
        return new JAXBElement<CreateContractPayQrResponse>(_CreateContractPayQrResponse_QNAME, CreateContractPayQrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateContractPayQr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "createContractPayQr")
    public JAXBElement<CreateContractPayQr> createCreateContractPayQr(CreateContractPayQr value) {
        return new JAXBElement<CreateContractPayQr>(_CreateContractPayQr_QNAME, CreateContractPayQr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "authenticationResponse")
    public JAXBElement<AuthenticationResponse> createAuthenticationResponse(AuthenticationResponse value) {
        return new JAXBElement<AuthenticationResponse>(_AuthenticationResponse_QNAME, AuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelContractV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "cancelContractV2")
    public JAXBElement<CancelContractV2> createCancelContractV2(CancelContractV2 value) {
        return new JAXBElement<CancelContractV2>(_CancelContractV2_QNAME, CancelContractV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResendMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "resendMsg")
    public JAXBElement<ResendMsg> createResendMsg(ResendMsg value) {
        return new JAXBElement<ResendMsg>(_ResendMsg_QNAME, ResendMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractUuidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getContractUuidResponse")
    public JAXBElement<GetContractUuidResponse> createGetContractUuidResponse(GetContractUuidResponse value) {
        return new JAXBElement<GetContractUuidResponse>(_GetContractUuidResponse_QNAME, GetContractUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractWithEsealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContractWithEsealResponse")
    public JAXBElement<SubmitContractWithEsealResponse> createSubmitContractWithEsealResponse(SubmitContractWithEsealResponse value) {
        return new JAXBElement<SubmitContractWithEsealResponse>(_SubmitContractWithEsealResponse_QNAME, SubmitContractWithEsealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContractBaseInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "getContractBaseInfoResponse")
    public JAXBElement<GetContractBaseInfoResponse> createGetContractBaseInfoResponse(GetContractBaseInfoResponse value) {
        return new JAXBElement<GetContractBaseInfoResponse>(_GetContractBaseInfoResponse_QNAME, GetContractBaseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "uploadContract")
    public JAXBElement<UploadContract> createUploadContract(UploadContract value) {
        return new JAXBElement<UploadContract>(_UploadContract_QNAME, UploadContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitContract")
    public JAXBElement<SubmitContract> createSubmitContract(SubmitContract value) {
        return new JAXBElement<SubmitContract>(_SubmitContract_QNAME, SubmitContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitStatusResponse")
    public JAXBElement<SubmitStatusResponse> createSubmitStatusResponse(SubmitStatusResponse value) {
        return new JAXBElement<SubmitStatusResponse>(_SubmitStatusResponse_QNAME, SubmitStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "submitStatus")
    public JAXBElement<SubmitStatus> createSubmitStatus(SubmitStatus value) {
        return new JAXBElement<SubmitStatus>(_SubmitStatus_QNAME, SubmitStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Authentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "authentication")
    public JAXBElement<Authentication> createAuthentication(Authentication value) {
        return new JAXBElement<Authentication>(_Authentication_QNAME, Authentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmContractWithEsealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "confirmContractWithEsealResponse")
    public JAXBElement<ConfirmContractWithEsealResponse> createConfirmContractWithEsealResponse(ConfirmContractWithEsealResponse value) {
        return new JAXBElement<ConfirmContractWithEsealResponse>(_ConfirmContractWithEsealResponse_QNAME, ConfirmContractWithEsealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.ws.api.contract.goldpalm.com/", name = "uploadContractResponse")
    public JAXBElement<UploadContractResponse> createUploadContractResponse(UploadContractResponse value) {
        return new JAXBElement<UploadContractResponse>(_UploadContractResponse_QNAME, UploadContractResponse.class, null, value);
    }

}
