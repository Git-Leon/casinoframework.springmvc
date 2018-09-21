package rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow;

import org.springframework.stereotype.Service;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.repository.games.cardgames.highlow.HighLowGameRepository;
import rocks.zipcodewilmington.mvcschema.AbstractService;








/**
 * @author leon on 9/20/18.
 */
@Service
public class HighLowGameService extends AbstractService<HighLowGame> {
    public HighLowGameService(HighLowGameRepository repository) {
        super(repository);
    }
}