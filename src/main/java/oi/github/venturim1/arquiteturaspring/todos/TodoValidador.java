package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class TodoValidador {

    TodoRepository todoRepository;

    public TodoValidador(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void validar(TodoEntity todoEntity){
        if(existeTodo(todoEntity.getDescricao())){
            throw new IllegalArgumentException("Já existe TODO com essa descrição");
        }
    }

    public boolean existeTodo(String descricao){
        return todoRepository.existsByDescricao(descricao);
    }
}
