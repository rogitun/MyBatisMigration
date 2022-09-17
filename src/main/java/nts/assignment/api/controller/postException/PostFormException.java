package nts.assignment.api.controller.postException;

import lombok.Getter;

import java.util.Map;

@Getter
public class PostFormException extends RuntimeException{

    private Map<String,String> map;

    public PostFormException() {
        super();
    }

    public PostFormException(String message) {
        super(message);
    }

    public PostFormException(Map<String,String> errors){
        this.map = errors;
    }

}
