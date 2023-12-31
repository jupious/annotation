package edu.mit.annotation.dto;

import lombok.*;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReceiveDetailDTO {
    //품목코드
    private String itemCode;
    //입고일
    private Date receiveDate;
    //정품수량
    private Integer fairQuantity;
    //반품수량
    private Integer returnQuantity;
}
