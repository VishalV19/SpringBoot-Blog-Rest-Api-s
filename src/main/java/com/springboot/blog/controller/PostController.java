package com.springboot.blog.controller;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    //Create blog post

  /*     This code is a Java method that is annotated with @PostMapping and is used to handle HTTP POST requests.
        The purpose of the method is to create a new post and return the created post as a response to the client.

        The method takes a single argument @RequestBody PostDto postDto which represents the body of the incoming
        HTTP request. The body of the request is expected to contain the details of the post that needs to be created.
        The PostDto object is a data transfer object that represents a post and its properties.

        The method returns a ResponseEntity<PostDto> object, which is a Spring framework class that represents an
        HTTP response. The body of the response is the created post represented as a PostDto object. The response also
        includes an HTTP status code, which in this case is HttpStatus.CREATED (HTTP status 201), indicating
        that a new resource has been successfully created.

    The method uses a postService object to create the post and retrieve the PostDto representation of the created post.
    The createPost method of the postService object is called with the postDto argument, which represents the post to be created.
 */
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

        
}
