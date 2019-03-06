package ng.shoppi.bikeloan.dashboard.service;

import ng.shoppi.bikeloan.dashboard.domain.Deal;

/**
 *
 * @author babafemi
 */
public interface DealService {
    
    public Deal[] findAll();
    
    public Deal findById(long id);
}
