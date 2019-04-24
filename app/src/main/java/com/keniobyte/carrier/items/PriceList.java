package com.keniobyte.carrier.items;

import java.util.ArrayList;
import java.util.List;

/**
 * PriceList implementation is really raw. If you want to use it, you should probably change it.
 * This is just to show an example in PricelistFragment.
 */

public class PriceList {

    private static PriceList sPriceList;
    private List<PriceItem> mPriceItems;

    public static PriceList get() {
        if(sPriceList == null) {
            sPriceList = new PriceList();
        }
        return sPriceList;
    }

    private PriceList() {
        mPriceItems = new ArrayList<>();
        List<String> mPricelistList = createDescriptions();
        List<String> mPricelistPrices = createPrices();
        for(int i=0; i<15;i++) {
            PriceItem priceItem = new PriceItem();
            priceItem.setDescription(mPricelistList.get(i));
            priceItem.setPrice(mPricelistPrices.get(i));
            if(i<=6) {
                priceItem.setGenre("DISTANCE");
            } else {
                priceItem.setGenre("Additional services");
            }
            mPriceItems.add(priceItem);
        }
    }

    public List<PriceItem> getPrices() {
        return mPriceItems;
    }

    public PriceItem getPriceItemByGenre(String genre) {
        for(PriceItem item : mPriceItems) {
            if(item.getGenre().equals(genre)) {
                return item;
            }
        }
        return null;
    }

    //RAW METHODS FOR STRINGS IMPLEMENTATION. Don't use them outside debugging process.
    private List<String> createDescriptions() {
        List<String> mPricelistList = new ArrayList<>();
        mPricelistList.add("Center");
        mPricelistList.add("Up to 5km");
        mPricelistList.add("From 5 to 10km");
        mPricelistList.add("From 10 to 15km");
        mPricelistList.add("From 15km to administrative borders ");
        mPricelistList.add("From 20km to administrative borders");
        mPricelistList.add("From 30km to administrative borders");
        mPricelistList.add("Express - delivery up to 1 hour");
        mPricelistList.add("Superexpress - delivery less than 1 hour");
        mPricelistList.add("Overtime services (18:00-8:00) and on Saturdays and Sundays");
        mPricelistList.add("Road Express");
        mPricelistList.add("SMS notification of delivery");
        mPricelistList.add("Posting on PKS/PKP");
        mPricelistList.add("Expectation of a courier over 10 minutes");
        mPricelistList.add("Package above 5kg");
        return mPricelistList;
    }
    private List<String> createPrices() {
        List<String> mPricelistPrices = new ArrayList<>();
        mPricelistPrices.add("Ksh 300");
        mPricelistPrices.add("Ksh 500");
        mPricelistPrices.add("Ksh 1000");
        mPricelistPrices.add("Ksh 1300");
        mPricelistPrices.add("Ksh 1500");
        mPricelistPrices.add("Ksh 1800");
        mPricelistPrices.add("Ksh 3000");
        mPricelistPrices.add("+50% to the standard price");
        mPricelistPrices.add("+130% to the standard price");
        mPricelistPrices.add("+100% to the service ordered");
        mPricelistPrices.add("Ksh. 400 + Ksh. 1250 per kilometer (return trip)");
        mPricelistPrices.add("Ksh. 50");
        mPricelistPrices.add("ordered service + PKS/PKP");
        mPricelistPrices.add("Ksh. 150 for every 10 minutes ");
        mPricelistPrices.add("+0,70/kg");
        return mPricelistPrices;
    }

}
