package com.manerajona.annotation;

import com.manerajona.domain.MyEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToStringJsonTest {

    @Test
    public void toStringJsonTest() {
        MyEntity t = new MyEntity("Example");
        Assertions.assertEquals("{\"name\":\"Example\"}", t.toString());
    }
}
