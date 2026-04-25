package com.example.demo.controller;

import com.example.demo.dto.PostDto;
import com.example.demo.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/gwaje")
public class PostController {
    private final PostService postService;

    @PostMapping("/create")
    public ResponseEntity<PostDto> create(@RequestBody PostDto postDto) {
    PostDto savedPost = postService.save(postDto);
            return ResponseEntity.ok(savedPost);
    }

    @GetMapping
    public List<PostDto> getPosts() {
        return postService.findAll();
    }
    @GetMapping("/view/{id}")
    public PostDto getPost(@PathVariable("id") Long id) {
        return postService.findById(id);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<PostDto> update(@PathVariable Long id, @RequestBody PostDto postDto) {
       PostDto savedPatch = postService.update(id, postDto);
        return ResponseEntity.ok(savedPatch);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        postService.delete(id);
        return ResponseEntity.noContent().build();
    }
}