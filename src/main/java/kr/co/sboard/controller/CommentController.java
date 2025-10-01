package kr.co.sboard.controller;

import kr.co.sboard.dto.CommentDTO;
import kr.co.sboard.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/comments/{ano}")
    public ResponseEntity<List<CommentDTO>> list(@PathVariable("ano") int ano){

        List<CommentDTO> dtoList = commentService.getCommentAll(ano);

        return ResponseEntity.ok(dtoList);
    }

    @GetMapping("/comment/{cno}")
    public ResponseEntity<?> comment(@PathVariable("cno") int cno){
        kr.co.sboard.dto.CommentDTO commentDTO = commentService.getComment(cno);

        return ResponseEntity.ok(commentDTO);
    }

    @PostMapping("/comment")
    public ResponseEntity<?> register(@RequestBody CommentDTO commentDTO){
        commentService.save(commentDTO);

        return ResponseEntity.ok("success");
    }

    @PutMapping("/comment")
    public void modify(){}

    @DeleteMapping("/comment")
    public void delete(){}
}
