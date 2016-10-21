package com.example;

import com.example.controller.ShipwreckController;
import com.example.model.Shipwreck;
import com.example.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
        assertEquals(1L, wreck.getId().longValue());
    }
}
