package com.ces.init;

import com.ces.model.ERole;
import com.ces.model.Identity;
import com.ces.repository.IdentityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class H2DataInitializer implements ApplicationRunner {

    private IdentityRepository identityRepository;

    @Autowired
    public H2DataInitializer(IdentityRepository identityRepository) {
        this.identityRepository = identityRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Identity identity = new Identity();
        identity.setRole(ERole.ADMIN.name());
        identity.setToken("abcd1234");
        System.out.println("BONU - Initializing Data");
        identityRepository.save(identity);

    }
}
