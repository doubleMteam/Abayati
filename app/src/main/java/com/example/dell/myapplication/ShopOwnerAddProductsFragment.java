package com.example.dell.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopOwnerAddProductsFragment extends Fragment {


    public ShopOwnerAddProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View view=inflater.inflate(R.layout.fragment_shop_owner_add_products, container, false);
    return view;

    }

}
