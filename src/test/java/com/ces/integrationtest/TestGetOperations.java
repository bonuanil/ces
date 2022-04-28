package com.ces.integrationtest;

import com.ces.application.E2eJunitRunner;
import org.jsmart.zerocode.core.domain.JsonTestCase;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.junit.Test;
import org.junit.runner.RunWith;

@TargetEnv("application_host.properties")
@RunWith(E2eJunitRunner.class)
public class TestGetOperations {
    @Test
    @JsonTestCase("integration_tests/get/get_all_identities.json")
    public void test_getAllIdentities() throws Exception {
    }

}
