package rocks.zipcodewilmington.mvcschema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Identifiable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.MappedSuperclass;
import java.net.URI;
import java.util.function.Supplier;

/**
 * @author leon on 9/20/18.
 */
@RestController
@MappedSuperclass
public abstract class AbstractController<EntityType> {
    protected final AbstractService<EntityType> service;

    @Autowired
    public AbstractController(AbstractService<EntityType> service) {
        this.service = service;
    }

    @PostMapping
    abstract public ResponseEntity<EntityType> create(EntityType entityType);

    public ResponseEntity<EntityType> create(@RequestBody EntityType entity, Supplier<Long> identifier) {
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(identifier.get())
                .toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uri);

        service.create(entity);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<EntityType> update(@RequestBody EntityType entity) {
        entity = service.update(entity);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<EntityType> find(@PathVariable Long id) {
        EntityType entity = service.find(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<EntityType> delete(@PathVariable Long id) {
        EntityType entity = service.delete(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Iterable<EntityType>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }
}
