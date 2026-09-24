package com.project.workshopmongo.services;

import com.project.workshopmongo.domain.Post;
import com.project.workshopmongo.domain.User;
import com.project.workshopmongo.dto.UserDTO;
import com.project.workshopmongo.repository.PostRepository;
import com.project.workshopmongo.repository.UserRepository;
import com.project.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    //injecao de dependencia automatica do spring
    @Autowired

    private PostRepository repo;



    public Post findById(String id){
        Post user = repo.findById(id).orElse(null);
        if(user == null){
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

}
