package ru.itprogram.service.impl;

import ru.itprogram.entity.Thinker;
import ru.itprogram.repository.Repository;
import ru.itprogram.repository.impl.ThinkerRepository;
import ru.itprogram.service.Service;

import java.util.List;

public class ThinkerService implements Service<Thinker> {
    private Repository repository;

    public ThinkerService(ThinkerRepository thinkerRepository) {
        this.repository = thinkerRepository;
    }

    @Override
    public List<Thinker> getThinkers() {
        return repository.getAllEntity();
    }

    @Override
    public void addThinker(Thinker thinker) {
        repository.saveEntity(thinker);
    }

    @Override
    public void deleteThinker(Thinker thinker) {
        repository.deleteEntity(thinker);
    }
}
