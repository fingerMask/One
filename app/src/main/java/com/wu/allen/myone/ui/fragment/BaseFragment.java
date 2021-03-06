package com.wu.allen.myone.ui.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.wu.allen.myone.MyApp;
import com.wu.allen.myone.R;
import com.wu.allen.myone.injector.components.AppComponent;

/**
 * Created by allen on 2016/7/14.
 */

public abstract class BaseFragment extends Fragment implements RecyclerArrayAdapter
    .OnLoadMoreListener,SwipeRefreshLayout.OnRefreshListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_base_layout, container, false);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFragmentComponent(MyApp.get(getActivity()).getAppComponent());
    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }

    protected abstract  void setupFragmentComponent(AppComponent appComponent);
}
