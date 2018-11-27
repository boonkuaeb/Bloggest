package com.bk.bloggest.repository;


import com.bk.bloggest.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

public interface UserRepository extends ElasticsearchCrudRepository<User, String> {
    User findByUsername(String username);
}
