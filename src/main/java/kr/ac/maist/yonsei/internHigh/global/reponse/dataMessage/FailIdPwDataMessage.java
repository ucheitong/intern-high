package kr.ac.maist.yonsei.internHigh.global.reponse.dataMessage;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FailIdPwDataMessage {

    private String id = "200";
    private String version = "0.1" ;
    private String result = "fail";
    private String id_password = "inconsistency";
    private Object data;

    public FailIdPwDataMessage(){}

    @Builder
    public FailIdPwDataMessage(Object data) {
        this.data = data;
    }

}