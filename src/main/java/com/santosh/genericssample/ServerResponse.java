package com.santosh.genericssample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerResponse<T> {
    private boolean success;
    private String respCode;
    private String respDescription;
    private T obj;
}
