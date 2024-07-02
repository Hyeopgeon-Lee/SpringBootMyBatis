package kopo.poly.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oracle.wls.shaded.org.apache.xpath.operations.String;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class MsgDTO {

    private int result; // 성공 : 1 / 실패 : 그 외
    private String msg; // 메시지
}
