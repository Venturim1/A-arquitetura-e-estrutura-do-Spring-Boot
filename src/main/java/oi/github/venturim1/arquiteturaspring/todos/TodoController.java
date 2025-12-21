package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todoEntity){
        try {
            return this.todoService.save(todoEntity);
        } catch (IllegalArgumentException e) {
            var mensagemErro = e.getMessage();
            throw new ResponseStatusException(HttpStatus.CONFLICT, mensagemErro);
        }

    }

    @PutMapping("{id}")
    public void updateStatuos(@PathVariable("id") Integer id, @RequestBody TodoEntity todo){
        todo.setId(id);
        todoService.save(todo);
    }

    @GetMapping("{id}")
    public  TodoEntity findByid(@PathVariable Integer id) {
        return todoService.findByID(id);
    }
}
