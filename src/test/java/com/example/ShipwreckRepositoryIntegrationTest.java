package com.example;

import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by kevinwu on 2016-10-20.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SpringBootMavenDemo2Application.class)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Test
    public void testFindAll() {
        List<Shipwreck> wrecks = shipwreckRepository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }

}
