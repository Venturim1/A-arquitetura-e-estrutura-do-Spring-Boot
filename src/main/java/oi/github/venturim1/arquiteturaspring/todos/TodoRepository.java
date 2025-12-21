package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

    boolean existsByDescricao(String descricao);
}
