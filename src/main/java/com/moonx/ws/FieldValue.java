package com.moonx.ws;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FieldValue {
    /**
     * Snapshot Data
     */
    Snapshot("s"),
    DeltaUpdate("u"),
    ActivateAlert("activate-alert");

    private String value;

    public String value(){
        return value;
    }
}
