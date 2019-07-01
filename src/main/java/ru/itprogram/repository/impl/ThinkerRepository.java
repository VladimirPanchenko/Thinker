package ru.itprogram.repository.impl;

import ru.itprogram.App;
import ru.itprogram.entity.Thinker;
import ru.itprogram.repository.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class ThinkerRepository implements Repository<Thinker> {
    private EntityManager entityManager = Persistence.createEntityManagerFactory(App.PERSISTENCE_UNIT).createEntityManager();

    @Override
    public List<Thinker> getAllEntity() {
        return entityManager.createQuery("SELECT thinker FROM Thinker thinker", Thinker.class).getResultList();
    }

    @Override
    public void saveEntity(Thinker thinker) {
        entityManager.getTransaction().begin();
        entityManager.merge(thinker);
        entityManager.getTransaction().commit();
    }

    @Override
    public void deleteEntity(Thinker thinker) {
        Thinker thinkerFind = entityManager.find(Thinker.class, thinker.getId());
        if (thinkerFind != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(thinkerFind);
            entityManager.getTransaction().commit();
        }
    }
}
