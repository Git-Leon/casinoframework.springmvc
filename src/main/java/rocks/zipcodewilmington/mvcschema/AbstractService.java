package rocks.zipcodewilmington.mvcschema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import javax.persistence.MappedSuperclass;

/**
 * @author leon on 9/20/18.
 */
@MappedSuperclass
@Service
public class AbstractService<EntityType> {
    private CrudRepository<EntityType, Long> repository;

    @Autowired
    public AbstractService(CrudRepository<EntityType, Long> repository) {
        this.repository = repository;
    }


    public EntityType create(EntityType entity) {
        return repository.save(entity);
    }

    public EntityType update(EntityType entity) {
        return repository.save(entity);
    }

    public EntityType find(Long id) {
        return repository.findOne(id);
    }

    public EntityType delete(Long id) {
        EntityType entity = repository.findOne(id);
        repository.delete(entity);
        return entity;
    }

    public Iterable<EntityType> getAll() {
        return repository.findAll();
    }
}
