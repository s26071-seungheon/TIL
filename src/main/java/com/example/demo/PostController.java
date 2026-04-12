package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/post/new")
    public String test() {
        return "postform";
    }
    @GetMapping("/post/list")
    public String list() {
        return "postList";
    }

    @PostMapping("/post/new")
    @ResponseBody
    public String create(@RequestBody PostDto postDto) {
        postService.save(postDto);
        return "ok";
    }

    @GetMapping("/posts")
    @ResponseBody
    public List<PostDto> getPosts() {
        return postService.findAll();
    }

    @DeleteMapping("/post/{id}")
    @ResponseBody
    public String delete(@PathVariable Long id) {
        postService.delete(id);
        return "ok";
    }

    @PutMapping("/post/{id}")
    @ResponseBody
    public String update(@PathVariable Long id, @RequestBody PostDto postDto) {
        postService.update(id, postDto);
        return "ok";
    }
}
