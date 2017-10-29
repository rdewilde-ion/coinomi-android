package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;
import com.coinomi.core.coins.families.PeerFamily;

public class IoncoinMain extends PeerFamily {
    private IoncoinMain() {
        id = "ion.main";

        addressHeader = 103;
        p2shHeader = 88;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 30;

        name = "ION";
        symbol = "ION";
        uriScheme = "ion";
        bip44Index = 51;
        unitExponent = 6;
        feeValue = value(1000); // 0.001 ION
        minNonDust = value(1);
        softDustLimit = value(10000); // 0.01 ION
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static IoncoinMain instance = new IoncoinMain();
    public static synchronized IoncoinMain get() {
        return instance;
    }
}
