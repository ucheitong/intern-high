package kr.ac.maist.yonsei.internHigh.global.reponse;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseMessage {

    private String id = "200";
    private String version = "0.1" ;
    private String result = "success";

    public ResponseMessage() {}

}