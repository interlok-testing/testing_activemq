package com.adaptris.activemq.test;

import com.adaptris.testing.SingleAdapterFunctionalTest;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class DefaultFunctionalTest extends SingleAdapterFunctionalTest {

    @Before
    public void setup() throws Exception {
        this.adapterStartMaxWaitTime = 60*1000;
        super.setup();
    }

    @Test
    public void testExecute() throws Exception {
        assert(true);
    }

}