package com.dufuna.berlin.akinfenwa.address;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleLekkiPropertyRepositoryImplTest {

    @Test
    public void testGetLekkiProperty(){
        SimpleLekkiPropertyRepositoryImpl repository = new SimpleLekkiPropertyRepositoryImpl();
        String property = repository.getLekkiProperty("somePropertyId");
        assertNotNull(property);


    }

}