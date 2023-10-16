package com.dufuna.berlin.akinfenwa.address.service;

import com.dufuna.berlin.akinfenwa.address.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

/**
 * Mock implementation of LekkiPropertyService.
 */
public class LekkiPropertyServiceClss implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepository propertyRepository;

    /**
     * @param propertyRepository
     */
    public LekkiPropertyServiceClss(SimpleLekkiPropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    /**
     * @param lekkiProperty
     * @return
     */
    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
        LekkiProperty property = new LekkiProperty();
        LekkiProperty save = propertyRepository.save(property);
        return save;

    }

    /**
     * @param id
     * @return findById
     */
    @Override
    public LekkiProperty getProperty(int id) {
        return propertyRepository.findById(id);
    }

    /**
     * @return findAll
     */
    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }

    /**
     * @return  null
     */
    @Override
    public LekkiProperty getProperty() {
        return null;
    }
}
