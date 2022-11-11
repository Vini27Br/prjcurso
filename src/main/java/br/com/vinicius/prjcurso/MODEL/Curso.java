package br.com.vinicius.prjcurso.MODEL;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "curso")


public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String  namecurso;

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Integer getId() {
        return id;
    }



    public String getNamecurso() {
        return namecurso;
    }


    public void setNamecurso(String namecurso) {
        this.namecurso = namecurso;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}

