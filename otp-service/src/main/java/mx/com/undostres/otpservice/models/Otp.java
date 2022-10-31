package mx.com.undostres.otpservice.models;


import java.sql.Timestamp;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.hibernate.annotations.Type;
import javax.persistence.Id;

@Entity
@Table(name="otp")
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class Otp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    private String  session_id;	//varchar(50)
    private String  mobile;	//varchar(10)
    private int  provider;	//int(11)
    private Timestamp  created_at;	//timestamp
    private Timestamp updated_at;	//timestamp
    private String   otp_send_response;	//mediumtext
    private String  otp_verify_response;	//mediumtext
    private int  status;	//int(11)
}
