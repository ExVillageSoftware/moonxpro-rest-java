package com.moonx.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
@Accessors(fluent = true)
public enum Type {
    Snapshot("s"),
    DeltaUpdate("u"),
    ActivateAlert("activate-alert"),
    Activate("activate"),
    Response("response");

    private static Map<String, Type> MAP = Arrays.stream(values())
            .collect(Collectors.toMap(Type::value, Function.identity()));


    private String value;

    public static Type parse(String value) {
        return Optional.ofNullable(MAP.get(value)).orElseThrow(() -> new IllegalStateException("Invalid Type :: " + value));
    }
}
