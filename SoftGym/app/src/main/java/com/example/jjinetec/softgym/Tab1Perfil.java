package com.example.jjinetec.softgym;

/**
 * Created by DarkKlitos on 27/11/16.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1Perfil extends Fragment{
	@Override
	public View onCreateView ( LayoutInflater inflater, ViewGroup container,
	                           Bundle savedInstanceState ) {
		View rootView = inflater.inflate( R.layout.tab1_perfil, container, false );
		return rootView;
	}
}
