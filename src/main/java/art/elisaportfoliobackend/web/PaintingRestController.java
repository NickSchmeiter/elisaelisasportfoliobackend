package art.elisaportfoliobackend.web;

import art.elisaportfoliobackend.web.api.Painting;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PaintingRestController {
    private List<Painting> paintings;
    public PaintingRestController (){
    paintings = new ArrayList<>();
    paintings.add(new Painting(1,"nickus","90*90","Öl auf Leinwand","ein schönes Bild", null));
    paintings.add(new Painting(2,"nickus","90*90","Öl auf Leinwand","ein schönes Bild", null));
    }
    @GetMapping(path = "/api/v1/painting")
    public ResponseEntity<List<Painting>> fetchpaintings(){
        return ResponseEntity.ok(paintings);
    }
}
