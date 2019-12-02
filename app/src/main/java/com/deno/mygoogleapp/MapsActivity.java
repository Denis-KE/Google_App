package com.deno.mygoogleapp;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng nairobi = new LatLng(-1.3031934, -1.3031934);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Marker in Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(nairobi,7f));

        LatLng mombasa = new LatLng(-4.0351767, 39.5261763);
        mMap.addMarker(new MarkerOptions().position(mombasa).title("Marker in Mombasa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mombasa,7f));

        LatLng kampala = new LatLng(0.3130284,32.4590386 );
        mMap.addMarker(new MarkerOptions().position(kampala).title("Marker in Kampala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kampala,7f));

        LatLng arusha
                = new LatLng(-3.4405568, 36.5966056);
        mMap.addMarker(new MarkerOptions().position(arusha).title("Marker in Arusha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(arusha,7f));

    }
}
