package ma.geo.local.controllers;

import ma.geo.local.PFEApplication;
import ma.geo.local.models.JwtRequest;
import ma.geo.local.models.JwtResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    private final static Logger LOGGER= LoggerFactory.getLogger(PFEApplication.class);

    public JwtResponse authenticate(@RequestBody JwtRequest request){
        LOGGER.debug(" Jwt Request {} ",request);
        // Etape suivante

    }
}
