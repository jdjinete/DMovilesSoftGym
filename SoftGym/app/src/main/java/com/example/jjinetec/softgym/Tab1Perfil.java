package com.example.jjinetec.softgym;

/**
 * Created by DarkKlitos on 27/11/16.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Tab1Perfil extends Fragment {
	DatabaseReference rootRef = FirebaseDatabase.getInstance( ).getReference( );
	DatabaseReference conditionRef = rootRef.child( "/USUARIOS/0" );

	TextView txtViewUserName;
	TextView txtViewUserId;
	TextView txtViewUserGenre;
	TextView txtViewUserPhone;
	TextView txtViewUserBorn;
	TextView txtViewUserEmail;
	TextView txtViewUserAddress;
	TextView txtViewUserWeight;
	TextView txtViewUserHeight;
	TextView txtViewUserStart;
	TextView txtViewUserBlood;
	TextView txtViewUserConditions;


	@Override
	public View onCreateView ( LayoutInflater inflater, ViewGroup container,
	                           Bundle savedInstanceState ) {
		View rootView = inflater.inflate( R.layout.tab1_perfil, container, false );
		ButterKnife.bind( this, rootView );

		txtViewUserName= ( TextView ) rootView.findViewById( R.id.txtViewUserName );
		txtViewUserId = ( TextView ) rootView.findViewById( R.id.txtViewUserId );
		txtViewUserGenre = ( TextView ) rootView.findViewById( R.id.txtViewUserGenre );
		txtViewUserPhone = ( TextView ) rootView.findViewById( R.id.txtViewUserPhone );
		txtViewUserBorn = ( TextView ) rootView.findViewById( R.id.txtViewUserBorn );
		txtViewUserEmail = ( TextView ) rootView.findViewById( R.id.txtViewUserEmail );
		txtViewUserAddress = ( TextView ) rootView.findViewById( R.id.txtViewUserAddress );
		txtViewUserWeight = ( TextView ) rootView.findViewById( R.id.txtViewUserWeight);
		txtViewUserHeight  = ( TextView ) rootView.findViewById( R.id.txtViewUserHeight );
		txtViewUserStart  = ( TextView ) rootView.findViewById( R.id.txtViewUserStart );
		txtViewUserBlood  = ( TextView ) rootView.findViewById( R.id.txtViewUserBlood );
		txtViewUserConditions  = ( TextView ) rootView.findViewById( R.id.txtViewUserConditions );
		return rootView;
	}


	@Override
	public void onStart ( ) {
		super.onStart( );
		conditionRef.addValueEventListener( new ValueEventListener( ) {
			@Override
			public void onDataChange ( DataSnapshot dataSnapshot ) {
				Usuario user = dataSnapshot.getValue( Usuario.class );

				txtViewUserName.setText( "Nombre: " + user.getNombre());
				txtViewUserId.setText( "Cédula No.: " + user.getIdentificacion() );
				txtViewUserGenre.setText( "Género: " + user.getGenero() );
				txtViewUserPhone.setText("Teléfono: " +  user.getTelefono().toString() );
				txtViewUserBorn.setText( "Fecha de Nacimiento: " + user.getFechaNacimiento() );
				txtViewUserEmail.setText( "Email: " + user.getCorreo() );
				txtViewUserAddress.setText( "Dirección: " + user.getDireccion() );
				txtViewUserWeight.setText("Peso: " + user.getPeso() );
				txtViewUserHeight.setText( "Estatura: " +  user.getEstatura() );
				txtViewUserStart.setText( "Fecha de Ingreso: " +  user.getFechaIngreso() );
				txtViewUserBlood.setText( "RH: " +  user.getTipoSangre() );
				txtViewUserConditions.setText( "Estado Médico: " +  user.getCondicionMedica() );
			}

			@Override
			public void onCancelled ( DatabaseError databaseError ) {

			}
		} );

//		botonSunny.setOnClickListener( new View.OnClickListener(){
//
//			@Override
//			public void onClick ( View view ) {
//				conditionRef.setValue( "Sunny" );
//			}
//		} );
//
//		botonFoggy.setOnClickListener( new View.OnClickListener(){
//
//			@Override
//			public void onClick ( View view ) {
//				conditionRef.setValue( "Foggy" );
//			}
//		} );


	}


}
