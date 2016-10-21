package com.example;

import com.example.controller.ShipwreckController;
import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//import static org.hamcrest.Matchers.*;

/**
 * Created by kevinwu on 2016-10-20.
 */
public class AppTest1 {


    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testApp() {

        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);

        Shipwreck wreck = sc.get(1L);

        verify(shipwreckRepository).findOne(1L);
        //assertEquals(1L, wreck.getId().longValue());

        assertThat(wreck.getId(), is(1l));
    }
}
