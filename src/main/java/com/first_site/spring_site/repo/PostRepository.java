package com.first_site.spring_site.repo;

import com.first_site.spring_site.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {

}
