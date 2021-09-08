package kr.ac.maist.yonsei.internHigh.global.reponse.dataMessage;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralDataMessage {

    private String id = "200";
    private String version = "0.1" ;
    private String result = "success";
    private Object data;

    public GeneralDataMessage() {}

    @Builder
    public GeneralDataMessage(String result, Object data) {
        this.result = result;
        this.data = data;
    }

}
