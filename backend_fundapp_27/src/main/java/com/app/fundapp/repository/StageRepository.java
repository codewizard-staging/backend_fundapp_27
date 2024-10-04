package com.app.fundapp.repository;

import com.app.fundapp.model.Stage;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StageRepository extends SimpleJpaRepository<Stage, String> {
    private final EntityManager em;
    public StageRepository(EntityManager em) {
        super(Stage.class, em);
        this.em = em;
    }
    @Override
    public List<Stage> findAll() {
        return em.createNativeQuery("Select * from \"fundapp_360\".\"Stage\"", Stage.class).getResultList();
    }
}