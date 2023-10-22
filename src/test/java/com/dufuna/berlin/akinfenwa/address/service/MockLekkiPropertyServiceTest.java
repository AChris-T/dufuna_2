package com.dufuna.berlin.akinfenwa.address.service;


import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;
import org.junit.Test;

public class MockLekkiPropertyServiceTest {
    @Test
    public void testSaveProperty(){
        LekkiProperty property = new LekkiProperty();
        MockLekkiPropertyService service = new MockLekkiPropertyService();
        service.saveProperty(property);
    }

    @Test
    public void testGetProperty(){
      MockLekkiPropertyService service = new MockLekkiPropertyService();
        service.getProperty();
    }


}