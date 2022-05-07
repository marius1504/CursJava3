package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Data
public class Message {
    public String sender;
    public String receiver;
    public String text;
    public boolean seen;
    public Date sentDate;

//    @Override
//    public String toString() {
//        return "Message{" +
//                "sender='" + sender + '\'' +
//                ", receiver='" + receiver + '\'' +
//                ", text='" + text + '\'' +
//                ", seen=" + seen +
//                ", sentDate=" + sentDate +
//                '}';
//    }
}
