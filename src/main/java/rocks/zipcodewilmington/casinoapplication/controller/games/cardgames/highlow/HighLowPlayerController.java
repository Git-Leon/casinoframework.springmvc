package rocks.zipcodewilmington.casinoapplication.controller.games.cardgames.highlow;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import rocks.zipcodewilmington.casinoapplication.model.games.cardgames.highlow.HighLowPlayer;
import rocks.zipcodewilmington.casinoapplication.services.games.cardgames.highlow.HighLowPlayerService;
import rocks.zipcodewilmington.mvcschema.AbstractController;

/**
 * @author leon on 9/20/18.
 */
@Controller
@RequestMapping(value = "/casino/highlow/player")
public class HighLowPlayerController extends AbstractController<HighLowPlayer> {
    public HighLowPlayerController(HighLowPlayerService service) {
        super(service);
    }

    @Override
    public ResponseEntity<HighLowPlayer> create(HighLowPlayer player) {
        return super.create(player, player::getId);
    }
}
