package art.elisaportfoliobackend.web;

import art.elisaportfoliobackend.web.api.Painting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaintingRestController {
    private List<Painting> paintings;
    public PaintingRestController (){
    paintings = new ArrayList<>();
    paintings.add(new Painting(id=1,name="schwanzusnickus",groesse="90*90",material="Öl auf Leinwand",description="ein schönes Bild",picture=));

    }


    @GetMapping(path = '/api/v1/painting')
    public List<Painting> fetchpaintings(){


    }
}
