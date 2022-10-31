package mx.com.undostres.otpservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name="otp_order")
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
@NoArgsConstructor
public class OtpOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Type(type = "org.hibernate.type.UUIDCharType")
    private UUID id;
    private String  name;	//varchar(16)

    public OtpOrder(String name) {
        this.name = name;
    }
}
