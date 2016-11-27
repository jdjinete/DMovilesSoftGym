package com.example.jjinetec.softgym;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DarkKlitos on 27/11/16.
 */

public class Tab2EstadoFisico extends Fragment {
	@Override
	public View onCreateView ( LayoutInflater inflater, ViewGroup container,
	                           Bundle savedInstanceState ) {
		View rootView = inflater.inflate( R.layout.tab2_estado_fisico, container, false );
		return rootView;
	}
}
