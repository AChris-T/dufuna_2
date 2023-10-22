package com.dufuna.berlin.akinfenwa.address.service;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{

    /**
     * @param lekkiProperty
     * @return lekkiProperty
     */
    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {

        return lekkiProperty;
    }

    /**
     * @param id
     * @return null
     */
    @Override
    public LekkiProperty getProperty(int id) {

        return null;
    }

    /**
     * @return null
     */
    @Override
    public List<LekkiProperty> getProperties() {

        return null;
    }

    /**
     * @return null
     */
    @Override
    public LekkiProperty getProperty() {

        return null;
    }
}
