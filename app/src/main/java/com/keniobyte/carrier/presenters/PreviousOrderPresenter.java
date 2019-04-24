package com.keniobyte.carrier.presenters;


import com.keniobyte.carrier.fragments.PreviousOrdersFragment;
import com.keniobyte.carrier.interactors.PreviousOrderInteractor;

public class PreviousOrderPresenter {

    private PreviousOrdersFragment mView;
    private PreviousOrderInteractor mInteractor;

    public PreviousOrderPresenter(PreviousOrdersFragment fragment) {
        this.mView = fragment;
        this.mInteractor = new PreviousOrderInteractor(this);
    }

    public void initialize() {
        mInteractor.fetchPreviousOrdersData();
    }

    public void sendContext() {
        mInteractor.setInteractorContext(mView.getFragmentContext());
    }

    public void onAdapterReady() {
        mView.setListViewWithAdapter(mInteractor.sendOrdersAdapter());
    }

    public void detachView() {
        mView = null;
    }

}
