package com.example.root.spaceappproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.root.spaceappproject.Model.Hotel;

import java.util.ArrayList;

/**
 * Created by root on 4/29/17.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private ArrayList<Hotel> mHotels;
    private Context mContext;

    public HotelAdapter(Context context,ArrayList<Hotel> hotels){
        mContext=context;
        mHotels=hotels;
    }

    private Context getmContext(){
        return mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.hotel_single_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Hotel hotel=mHotels.get(position);
        holder.nameTextView.setText(hotel.getName());
//        holder.locationTextView.setText(hotel.getLocation());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,FoodDetails.class);
                intent.putExtra("hello",mHotels.get(position));

                mContext.startActivity(intent);
                //Log.e(TAG, "onClick: "+mHotels.get(position).getFood() );
            }
        });


    }

    @Override
    public int getItemCount() {
        return mHotels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView nameTextView;
        public TextView locationTextView;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView=(TextView)itemView.findViewById(R.id.name);
//            locationTextView=(TextView)itemView.findViewById(R.id.location);
            linearLayout=(LinearLayout)itemView.findViewById(R.id.linearlayout);
        }
    }
}
