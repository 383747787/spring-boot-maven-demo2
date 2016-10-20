package com.example.controller;

import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by kevinwu on 2016-10-19.
 */

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {

    @Autowired
    ShipwreckRepository shipwreckRepository;

    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return shipwreckRepository.findAll();
    }

    @RequestMapping(value="shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return shipwreckRepository.saveAndFlush(shipwreck);
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@RequestBody Long id) {
        return shipwreckRepository.findOne(id);
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck put(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {

        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        BeanUtils.copyProperties(shipwreck, existingShipwreck);

        return shipwreckRepository.saveAndFlush(existingShipwreck);
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
        Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
        shipwreckRepository.delete(existingShipwreck);

        return existingShipwreck;
    }

}
