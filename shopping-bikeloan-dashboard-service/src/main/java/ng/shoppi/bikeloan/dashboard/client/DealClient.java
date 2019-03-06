package ng.shoppi.bikeloan.dashboard.client;

import ng.shoppi.bikeloan.dashboard.config.ClientOnlyRestTemplate;
import ng.shoppi.bikeloan.dashboard.domain.Deal;
import ng.shoppi.bikeloan.dashboard.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author babafemi
 */
@Service
public class DealClient implements DealService {

    @Autowired
    private ClientOnlyRestTemplate restTemplate;

    private String baseUrl = "https://kubekwe-onemallbff-dev.shoppi.ng/api/v1";

    @Override
    public Deal[] findAll() {
        return restTemplate.getForObject(baseUrl + "/deals", Deal[].class);
    }

    @Override
    public Deal findById(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
