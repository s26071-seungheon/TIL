package com.example.demo;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public void save(PostDto postDto) {
        PostEntity postEntity = new PostEntity();
        postEntity.setTitle(postDto.getTitle());
        postEntity.setContent(postDto.getContent());

        postRepository.save(postEntity);
    }
    public List<PostDto> findAll() {
        return postRepository.findAll()
                .stream()
                .map(PostDto::fromEntity)
                .toList();
    }
    public void delete(Long id) {
        postRepository.deleteById(id);
    }

    @Transactional
    public void update(Long id, PostDto postDto) {
        PostEntity postEntity = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다."));

        postEntity.setTitle(postDto.getTitle());
        postEntity.setContent(postDto.getContent());
    }
}