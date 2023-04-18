package th.co.opentechlab.spring.model;

import lombok.Data;

@Data
public class ResponseModel<T> {
    private int status;
    private String message;
    private String error;
    private T data;
}
