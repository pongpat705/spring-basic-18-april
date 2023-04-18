package th.co.opentechlab.spring.model;

import lombok.Data;

@Data
public class RequestModel<T> {

    private int status;
    private String message;
    private T data;
}
