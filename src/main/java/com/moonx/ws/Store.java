package com.moonx.ws;

public class Store implements StreamListener {

    @Override
    public void delta(Data data) {
        System.out.println(data.<Object>content());
        switch (data.streamKey().getFlavour()) {
            case OrderStack:
                break;
            case Trade:
                break;
            case Kline:
                break;
            case Stat:
                break;
            case Announce:
                break;
            case Index:
                break;
            case UserOrder:
                break;
            case UserTrade:
                break;
            case FutureInfo:
                break;
            case UserAsset:
                break;
        }
    }

    @Override
    public void snapshot(Data data) {
        System.out.println(data.<Object>content());
        switch (data.streamKey().getFlavour()) {
            case OrderStack:
                break;
            case Trade:
                break;
            case Kline:
                break;
            case Stat:
                break;
            case Announce:
                break;
            case Index:
                break;
            case UserOrder:
                break;
            case UserTrade:
                break;
            case FutureInfo:
                break;
            case UserAsset:
                break;
        }
    }

    @Override
    public void disconnected() {

    }
}
