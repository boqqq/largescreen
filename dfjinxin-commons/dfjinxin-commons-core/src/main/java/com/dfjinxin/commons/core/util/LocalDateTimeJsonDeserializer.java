package com.dfjinxin.commons.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Strings;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

public class LocalDateTimeJsonDeserializer extends JsonDeserializer<LocalDateTime> {

    /**
     * 反序列化LocalDateTime
     *
     * @param p
     * @param ctxt
     * @return
     * @throws IOException
     */
    @Override
    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        return !Objects.isNull(p) && !Strings.isNullOrEmpty(p.getText()) ?
                LocalDateTime.parse(p.getText(), DatePatternUtils.DATE_TIME_FORMATTER) : null;
    }
}
