package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow;

import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow.HighLowPlayerRepository;
import rocks.zipcodewilmington.mvcschema.AbstractService;

/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowPlayerService extends AbstractService<HighLowPlayer> {
    public HighLowPlayerService(HighLowPlayerRepository repository) {
        super(repository);
    }
}