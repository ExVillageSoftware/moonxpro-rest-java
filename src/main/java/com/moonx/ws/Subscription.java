package com.moonx.ws;

import com.alibaba.fastjson.JSONObject;

import java.util.Objects;

public class Subscription {
    StreamKey streamKey;
    long throttleMillis;
    JSONObject context = new JSONObject();

    public Subscription streamKey(StreamKey streamKey) {
        this.streamKey = streamKey;
        put(Field.Key.value(), streamKey.getKey());
        return this;
    }

    public Subscription throttleMillis(long throttleMillis) {
        this.throttleMillis = throttleMillis;
        put("throttleMillis", throttleMillis);
        return this;
    }

    public Subscription put(String key, Object value) {
         context.put(key, value);
        return this;
    }

    String subscribeJson() {
        return new JSONObject()
                .fluentPut(Field.Type.value(), "sub")
                .fluentPut(Field.Data.value(), context)
                .toJSONString();
    }

    String unsubscribeJson() {
        return new JSONObject()
                .fluentPut(Field.Type.value(), "unsub")
                .fluentPut(Field.Data.value(), new JSONObject()
                        .put(Field.Key.value(), streamKey.getKey())
                )
                .toJSONString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return streamKey.equals(that.streamKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamKey);
    }

}