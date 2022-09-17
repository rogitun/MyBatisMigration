package nts.assignment.repository.mybatis;

import nts.assignment.domain.TempEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface TmpEntityMapper {

    void save(TempEntity tempEntity);

    void update(@Param("id") Integer id, @Param("updateDto") TmpUpdateDto tmpUpdateDto);

    List<TempEntity> findAll(TmpCond cond);

    Optional<TempEntity> findById(Integer id);
}
