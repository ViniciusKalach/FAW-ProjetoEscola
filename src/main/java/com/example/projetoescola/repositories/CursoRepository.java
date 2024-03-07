package com.example.projetoescola.repositories;
import com.example.projetoescola.models.Curso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class CursoRepository {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public Curso inserir(Curso curso){
        entityManager.merge(curso);
        return curso;
    }

    @Transactional
    public Curso editar(Curso curso){
        entityManager.merge(curso);
        return curso;
    }

    @Transactional
    public void excluir(Curso curso){
        entityManager.remove(curso);
    }

    @Transactional
    public void excluir(int id){
        excluir(entityManager.find(Curso.class, id));
    }

    public List<Curso> obterPorNome(String nome){
        String jpql = "select c from Curso c where c.nome like :nome";
        TypedQuery<Curso> query = entityManager.createQuery(jpql, Curso.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Curso> obterTodos(){
        return entityManager.createQuery("from Curso", Curso.class).getResultList();
    }
}
