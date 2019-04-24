package com.keniobyte.carrier.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.keniobyte.carrier.R;
import com.keniobyte.carrier.presenters.PricelistPresenter;

public class PricelistFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private PricelistPresenter mPresenter;

    public PricelistFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pricelist, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.pricelist_recyclerview);

        mPresenter = new PricelistPresenter(this);
        mPresenter.initialize();
    }

    public RecyclerView getRecyclerView() {
        return mRecyclerView;
    }

    public Context getContextFromFragment() {
        return getContext();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

}
