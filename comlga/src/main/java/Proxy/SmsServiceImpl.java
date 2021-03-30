package Proxy;

/**
 * @author lga
 * @date 2021-03-11 11:09
 * @desc
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("TargetObject ====== send message : " + message);
        return null;
    }
}
