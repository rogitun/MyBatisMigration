package nts.assignment.domain.form;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
public class PostForm {

    private String title;

    private String writer;

    private String password;

    private String content;

    private String hashtag;
}
