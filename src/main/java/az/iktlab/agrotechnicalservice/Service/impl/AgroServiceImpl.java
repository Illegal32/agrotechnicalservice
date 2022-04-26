package az.iktlab.agrotechnicalservice.Service.impl;

import az.iktlab.agrotechnicalservice.Service.AgroService;
import az.iktlab.agrotechnicalservice.client.AgroServiceClient;
import az.iktlab.agrotechnicalservice.model.CodeBeautify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgroServiceImpl implements AgroService {

    @Autowired
    private AgroServiceClient client;

    @Override
    public CodeBeautify getAgroServices() {
        return client.getAgroServices();
    }
}
