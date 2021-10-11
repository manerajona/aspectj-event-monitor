package com.manerajona.annotation;

import com.manerajona.domain.MyEntity;
import org.junit.jupiter.api.Test;

class MonitorTest {

    @Test
    public void logEventTest() {
        MyEntity t = new MyEntity("Example");
        t.sayHello();
        assert true;
    }
}
