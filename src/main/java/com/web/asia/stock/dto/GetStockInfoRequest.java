package com.web.asia.stock.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GetStockInfoRequest {
    /*
    @Min(0)
    @Max(5000000)
    @NotBlank(message = "1회 이체 한도값은 필수입니다.")
    @JsonProperty("transfer_limit")
    int transferLimit;

    @Min(0)
    @Max(10000000)
    @NotBlank(message = "1일 이체 한도값은 필수입니다.")
    @JsonProperty("daily_transfer_limit")
    int dailyTransferLimit;
    */

    /*
    int numOfRows;
    int pageNo;
    String resultType;
    String basDt;
    String beginBasDt;
    String endBasDt;
    String likeBasDt;
    String likeSrtnCd;
    String isinCd;
    */
    String itmsNm;
    String likeBasDt;

}
