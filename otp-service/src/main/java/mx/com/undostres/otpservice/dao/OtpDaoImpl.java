package mx.com.undostres.otpservice.dao;

import lombok.extern.slf4j.Slf4j;
import mx.com.undostres.otpservice.models.Otp;
import mx.com.undostres.otpservice.models.OtpOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
@Slf4j
public class OtpDaoImpl implements OtpDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    private static final String query_getOtpOrder="SELECT name FROM otp_order ORDER BY id ASC";

    @Override
    public ArrayList getOtpOrder() throws Exception {
        try {

        } catch (DataAccessException e) {
            log.error("Error -> "+ e.toString());
        }
        return null;
    }

    private RowMapper<OtpOrder> UserRowMapper=((rs, rowNum)->{
        return new OtpOrder(rs.getString("name"));

    });
}
