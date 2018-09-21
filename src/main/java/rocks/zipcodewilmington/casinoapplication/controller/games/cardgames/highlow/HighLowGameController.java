package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowGame;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowGameService;
import rocks.zipcodewilmington.mvcschema.AbstractController;

/**
 * @author leon on 9/20/18.
 */
@Controller
@RequestMapping(value = "/casino/highlow/game")
public class HighLowGameController extends AbstractController<HighLowGame> {
    public HighLowGameController(HighLowGameService service) {
        super(service);
    }

    @Override
    public ResponseEntity<HighLowGame> create(HighLowGame highLowGame) {
        return super.create(highLowGame, highLowGame::getId);
    }
}