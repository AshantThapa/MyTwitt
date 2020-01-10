package com.ashant.mytwitter.ui.send;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.ashant.mytwitter.Login_activity;
import com.ashant.mytwitter.R;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate( R.layout.fragment_send, container, false );
        Intent intent = new Intent( getContext(), Login_activity.class );
        startActivity( intent );
        return root;
    }
}