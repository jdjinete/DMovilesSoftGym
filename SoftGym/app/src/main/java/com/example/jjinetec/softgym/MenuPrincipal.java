package com.example.jjinetec.softgym;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a
	 * {@link FragmentPagerAdapter} derivative, which will keep every
	 * loaded fragment in memory. If this becomes too memory intensive, it
	 * may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	private SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	private ViewPager mViewPager;

	@Override
	protected void onCreate ( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_menu_principal );

		Toolbar toolbar = ( Toolbar ) findViewById( R.id.toolbar );
		setSupportActionBar( toolbar );
		getSupportActionBar( ).setDisplayHomeAsUpEnabled( true );
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter( getSupportFragmentManager( ) );

		// Set up the ViewPager with the sections adapter.
		mViewPager = ( ViewPager ) findViewById( R.id.container );
		mViewPager.setAdapter( mSectionsPagerAdapter );

		TabLayout tabLayout = ( TabLayout ) findViewById( R.id.tabs );
		tabLayout.setupWithViewPager( mViewPager );


	}


	@Override
	public boolean onCreateOptionsMenu ( Menu menu ) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater( ).inflate( R.menu.menu_menu_principal, menu );
		return true;
	}

	@Override
	public boolean onOptionsItemSelected ( MenuItem item ) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId( );

		//noinspection SimplifiableIfStatement
		if ( id == R.id.action_settings ) {
			return true;
		}

		return super.onOptionsItemSelected( item );
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter ( FragmentManager fm ) {
			super( fm );
		}

		@Override
		public Fragment getItem ( int position ) {
			switch ( position ){
				case 0 :
					Tab1Perfil tab1 = new Tab1Perfil();
					return tab1;
				case 1:
					Tab2EstadoFisico tab2 = new Tab2EstadoFisico();
					return  tab2;
				case 2:
					Tab3Rutina tab3 = new Tab3Rutina();
					return tab3;
				default:
					return null;
			}
		}

		@Override
		public int getCount ( ) {
			// Show 3 total pages.
			return 3;
		}

		@Override
		public CharSequence getPageTitle ( int position ) {
			switch ( position ) {
				case 0:
					return "Perfil";
				case 1:
					return "Estado Fisico";
				case 2:
					return "Rutina";
			}
			return null;
		}
	}
}
