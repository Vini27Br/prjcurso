package br.com.vinicius.prjcurso.MODEL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "aluno")


public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String namealuno;

    @ManyToOne
    @JoinColumn(name="cursoid")
    private Curso curso;


    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamealuno() {
        return namealuno;
    }

    public void setNamealuno(String namealuno) {
        this.namealuno = namealuno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}