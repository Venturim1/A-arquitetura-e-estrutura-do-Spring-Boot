package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity todo){
        return  todoRepository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        todoRepository.save(todo);
    }

    public TodoEntity findByID(Integer id) {
        return todoRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
