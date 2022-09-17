package nts.assignment.api.controller.response.error;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class PostFormError {

    private String message;

    private HttpStatus httpStatus;
    private int statusCode;

    private Map<String,String> errorList = new HashMap<>();

    public PostFormError(String message, HttpStatus httpStatus, int statusCode,Map<String,String> map) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.statusCode = statusCode;
        this.errorList = map;
    }
}
