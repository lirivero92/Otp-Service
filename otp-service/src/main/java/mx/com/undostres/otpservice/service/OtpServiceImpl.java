package mx.com.undostres.otpservice.service;

import mx.com.undostres.otpservice.dao.OtpDao;
import mx.com.undostres.otpservice.models.Otp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class OtpServiceImpl implements OtpService{

    @Autowired
    private OtpDao OtpRepository;



    @Override
    public ArrayList getOtpOrder() throws Exception {
        return null;
    }

    @Override
    public Otp insert(String mobile, Number provider) throws Exception {
        return null;
    }
}
