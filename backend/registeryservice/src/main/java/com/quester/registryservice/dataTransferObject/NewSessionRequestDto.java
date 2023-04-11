package com.quester.registryservice.dataTransferObject;

import lombok.Setter;

@Setter
public class NewSessionRequestDto {
    private Long sessionId;
    private Integer start;
    private Integer end;
    public Integer numberOfTerms;
}
