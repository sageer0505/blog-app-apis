package com.app.blog.services;

import java.util.List;

import com.app.blog.payloads.PostDto;
import com.app.blog.payloads.PostResponse;

public interface PostService {

	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	PostDto updatePost(PostDto postDto, Integer postId);

	void deletePost(Integer postId);

	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

	PostDto getPostById(Integer postId);

	// get all posts by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get All posts by user
	List<PostDto> getPostsByUser(Integer userId);

	// Search post
	List<PostDto> searchPost(String keyword);
}
