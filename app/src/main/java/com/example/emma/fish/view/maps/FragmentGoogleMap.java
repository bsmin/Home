package com.example.emma.fish.view.maps;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.example.emma.fish.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class FragmentGoogleMap extends FragmentActivity implements OnMapReadyCallback, OnMarkerClickListener {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_google_map);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this); //Called on the main thread.
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //Marker icon
        BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.ic_action_company_location);
        LatLng pohang = new LatLng(36.019018, 129.343481);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(pohang).title("경상북도 포항시");
        markerOptions.snippet("낚시 하기 좋은 날입니다 포항으로~");
        markerOptions.icon(icon);
        //Marker create
        mMap.addMarker(markerOptions);
        //camera moving
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pohang,18));

        /*if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }*/
        /*mMap.setMyLocationEnabled(true);*/
        /*mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);*/
        //MarkerClick Event
        mMap.setOnMarkerClickListener(this);
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        Toast.makeText(this,"test clicked",Toast.LENGTH_SHORT).show();
        return true;
    }
}
