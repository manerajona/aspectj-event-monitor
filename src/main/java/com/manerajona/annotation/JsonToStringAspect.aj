package com.manerajona.annotation;

import com.manerajona.domain.MyEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public aspect JsonToStringAspect {

    declare parents: (@com.manerajona.annotation.JsonToString *) extends Object;

    public String MyEntity.toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
