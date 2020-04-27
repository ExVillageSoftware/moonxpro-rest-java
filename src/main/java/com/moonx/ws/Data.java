package com.moonx.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@AllArgsConstructor
public class Data {
    Type type;
    StreamKey streamKey;
    Long sequence;
    Object content;

    <T> T content() {
        return (T) content;
    }
}
