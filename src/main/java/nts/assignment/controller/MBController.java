package nts.assignment.controller;

import lombok.RequiredArgsConstructor;
import nts.assignment.domain.TempEntity;
import nts.assignment.repository.TmpService;
import nts.assignment.repository.mybatis.TmpUpdateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MBController {

    private final TmpService repo;

    @GetMapping("/get-all")
    public ResponseEntity findAll(){
        return ResponseEntity.ok()
                .body(repo.findAll(null));
    }

    @GetMapping("/{id}/get")
    public ResponseEntity findbyId(@PathVariable("id") Integer id){
        return ResponseEntity.ok()
                .body(repo.findById(id));
    }

    @PostMapping("save")
    public String save(TempEntity entity){
        repo.saveTmp(entity);
        return "ok";
    }

    @PostMapping("/{id}/update")
    public String update(@PathVariable("id") Integer id, TmpUpdateDto dto){
        repo.update(id,dto);
        return "ok";
    }


}
