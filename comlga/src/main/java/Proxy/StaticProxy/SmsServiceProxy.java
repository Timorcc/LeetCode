package Proxy.StaticProxy;

import Proxy.SmsService;

/**
 * @author lga
 * @date 2021-03-11 11:10
 * @desc
 */
public class SmsServiceProxy implements SmsService {
    private SmsService smsService;

    public SmsServiceProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    public SmsServiceProxy() {
    }

    @Override
    public String send(String message) {
        System.out.println("Proxy=====before");
        smsService.send(message);
        System.out.println("Proxy=====before");
        return null;
    }
}
