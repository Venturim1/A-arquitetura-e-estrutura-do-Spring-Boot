package oi.github.venturim1.arquiteturaspring.todos;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    private TodoValidador validador;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository, TodoValidador validador, MailSender mailSender) {
        this.todoRepository = todoRepository;
        this.validador = validador;
        this.mailSender = mailSender;
    }

    public TodoEntity save(TodoEntity todo) {
        validador.validar(todo);
        return  todoRepository.save(todo);
    }

    public void updateStatus(TodoEntity todo) {
        System.out.println("Passei por aqui");
        todoRepository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
        mailSender.enviar("TODO Com descrição " + todo.getDescricao() + "Foi atualizado para " + status);
    }

    public TodoEntity findByID(Integer id) {
        return todoRepository.findById(Long.valueOf(id)).orElse(null);
    }
}
