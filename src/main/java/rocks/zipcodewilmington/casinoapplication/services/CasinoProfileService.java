package rocks.zipcodewilmington.casinoapplication.services;

import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.repository.CasinoProfileRepository;
import rocks.zipcodewilmington.mvcschema.AbstractService;

/**
 * @author leon on 9/8/18.
 */
@Service
public class CasinoProfileService extends AbstractService<CasinoProfile> {
    public CasinoProfileService(CasinoProfileRepository repository) {
        super(repository);
    }
}
