package com.keniobyte.carrier.presenters;


import com.keniobyte.carrier.fragments.PricelistFragment;
import com.keniobyte.carrier.interactors.PricelistInteractor;

public class PricelistPresenter {

    private PricelistInteractor mModel;
    private PricelistFragment mView;

    public PricelistPresenter(PricelistFragment pricelistFragment) {
        this.mModel = new PricelistInteractor(this);
        this.mView = pricelistFragment;
    }

    /**
     * Called from PricelistFragment
     * Sets adapter for @param.
     * @param
     */
    public void initialize() {
        mModel.setContext(mView.getContextFromFragment());
        mModel.onPrepareRecyclerView(mView.getRecyclerView());
    }

    public void detachView() {
        mView = null;
    }

}
