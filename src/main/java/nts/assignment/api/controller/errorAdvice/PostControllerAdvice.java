package nts.assignment.api.controller.errorAdvice;

import nts.assignment.api.controller.postException.PostFormException;
import nts.assignment.api.controller.response.error.PostFormError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestControllerAdvice
public class PostControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<PostFormError> addPostError(PostFormException e){
        Map<String, String> map = e.getMap();
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }

        PostFormError formError = new PostFormError("error!", BAD_REQUEST, BAD_REQUEST.value(),e.getMap());

        return new ResponseEntity<>(formError,formError.getHttpStatus());
    }
}
