package mx.com.undostres.otpservice.service;


import mx.com.undostres.otpservice.models.Otp;

import java.util.ArrayList;

public interface OtpService {
    ArrayList getOtpOrder() throws Exception;
    Otp insert(String mobile, Number provider) throws Exception;
}
