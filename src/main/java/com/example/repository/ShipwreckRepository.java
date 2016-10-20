package com.example.repository;

import com.example.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by kevinwu on 2016-10-20.
 */
public interface ShipwreckRepository extends JpaRepository <Shipwreck, Long> {

}
