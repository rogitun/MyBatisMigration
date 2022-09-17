package nts.assignment.repository;

import lombok.RequiredArgsConstructor;
import nts.assignment.domain.TempEntity;
import nts.assignment.repository.mybatis.TmpCond;
import nts.assignment.repository.mybatis.TmpEntityMapper;
import nts.assignment.repository.mybatis.TmpUpdateDto;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TmpService {

    private final TmpEntityMapper mapper;

    public void saveTmp(TempEntity entity){
        mapper.save(entity);
    }

    public void update(Integer tmpId, TmpUpdateDto dto){
        mapper.update(tmpId,dto);
    }

    public List<TempEntity> findAll(TmpCond cond){
        return mapper.findAll(cond);
    }

    public TempEntity findById(Integer id){
        return mapper.findById(id).get();
    }

}
