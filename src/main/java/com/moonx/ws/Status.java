package com.moonx.ws;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Getter
@Accessors(fluent = true)
public enum Status {
    Success(0),
    Error(1),


    SubscriptionFailed(1001),
    UnSubscriptionFailed(1002),


    AuthFailed(2001),
    AuthMissing(2002);

    private int id;
}
