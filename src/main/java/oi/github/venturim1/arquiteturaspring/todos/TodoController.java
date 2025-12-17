package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public TodoEntity save(@RequestBody TodoEntity todoEntity){
        return this.todoService.save(todoEntity);
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
