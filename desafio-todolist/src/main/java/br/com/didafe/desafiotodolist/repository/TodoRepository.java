package br.com.didafe.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.didafe.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
