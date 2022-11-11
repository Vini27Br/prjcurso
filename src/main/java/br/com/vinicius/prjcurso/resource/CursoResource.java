package br.com.vinicius.prjcurso.resource;

import br.com.vinicius.prjcurso.MODEL.Curso;
import br.com.vinicius.prjcurso.repository.CursoRepository;
import javafx.scene.effect.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoResource {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/todos")
    public List<Curso> listarTodosCursos(){
        return cursoRepository.findAll(Sort.by("nomecurso"));
    }
}
