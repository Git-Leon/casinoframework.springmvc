package rocks.zipcodewilmington.casinoapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import rocks.zipcodewilmington.casinoapplication.model.CasinoProfile;
import rocks.zipcodewilmington.casinoapplication.services.CasinoProfileService;
import rocks.zipcodewilmington.mvcschema.AbstractController;

/**
 * @author leon on 9/8/18.
 */
@Controller
@RequestMapping(value = "/casino/profile")
public class CasinoProfileController extends AbstractController<CasinoProfile> {
    private CasinoProfileController(CasinoProfileService service) {
        super(service);
    }

    @Override
    public ResponseEntity<CasinoProfile> create(CasinoProfile casinoProfile) {
        return super.create(casinoProfile, casinoProfile::getId);
    }
}
