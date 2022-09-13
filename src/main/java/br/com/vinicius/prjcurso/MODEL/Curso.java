package br.com.vinicius.prjcurso.MODEL;

import java.util.Objects;

public class Curso {
    private Integer id;
    private String  namecurso;

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

