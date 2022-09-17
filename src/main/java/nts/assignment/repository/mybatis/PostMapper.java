package nts.assignment.repository.mybatis;

import nts.assignment.domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PostMapper {

    void save(Post post);

}
