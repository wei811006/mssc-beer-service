package wei.springframework.guru.mssc.beer.service.web.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wei.springframework.guru.mssc.beer.service.web.model.BeerDto;

import java.util.UUID;

/**
 * BeerController.
 * TODO
 * <p>
 * 2020/6/15
 *
 * @author wei
 * @version 1.0.0
 **/
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {

        // TODO impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {

        // TODO impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {

        // TODO impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
