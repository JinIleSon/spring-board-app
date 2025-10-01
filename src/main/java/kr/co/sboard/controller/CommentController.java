package kr.co.sboard.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @GetMapping("/comment/{ano}")
    public void list(@PathVariable("ano") String ano){}

    @GetMapping("/comment/{cno}")
    public void comment(@PathVariable("cno") String cno){}

    @PostMapping("/comment")
    public void register(){}

    @PutMapping("/comment")
    public void modify(){}

    @DeleteMapping("/comment")
    public void delete(){}
}
