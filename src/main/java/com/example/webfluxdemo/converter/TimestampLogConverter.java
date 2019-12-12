package com.example.webfluxdemo.converter;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * @author liyuelin
 * @Desc TODO
 * @Date 2019/10/11
 */
public class TimestampLogConverter extends ClassicConverter {
    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        return String.valueOf(System.currentTimeMillis());
    }
}
