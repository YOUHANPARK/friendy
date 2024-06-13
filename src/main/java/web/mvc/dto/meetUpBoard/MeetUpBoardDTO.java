package web.mvc.dto.meetUpBoard;


import lombok.*;
import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MeetUpBoardDTO {
    private Long meetUpSeq;
    private Long userSeq;
    private String meetUpName;
    private String meetUpDesc;
    private Long meetUpMainImg;
    private int meetUpPwd;
    private int checkPwd;
    private int meetUpMaxEntry;
    private  String  meetUpDeadLine;
    private int  meetUpStatus;
}
