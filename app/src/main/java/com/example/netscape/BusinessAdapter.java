package com.example.netscape;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BusinessAdapter extends RecyclerView.Adapter<BusinessAdapter.MyViewHolder> {
    Context context;
    ArrayList<Business> businessArrayList;

    public BusinessAdapter(Context context, ArrayList<Business> businessArrayList) {
        this.context = context;
        this.businessArrayList = businessArrayList;
    }

    @NonNull
    @Override
    public BusinessAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.business_invite_card, parent, false);
        return new BusinessAdapter.MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BusinessAdapter.MyViewHolder holder, int position) {
        Business business=  businessArrayList.get(position);
        String name=business.getRpName();
        String initials = "" + name.charAt(0);

        for (int i =0; i < name.length();i++){
            if (name.charAt(i)== ' '){
                initials+= name.charAt(i+1);
//                Log.d("Initials",initials);

                break;
            }
        }
        holder.businessInit.setText(initials);
        holder.rpNameText.setText(business.getRpName());
        holder.locationText.setText(business.getLocation()+ " | "+ business.getRange());
        holder.businessTitleText.setText(business.getBusinessTitle()+ " | "+ business.getExperience()+ " years of experience");
        holder.businessStatText.setText("Hi community! I am available at your service!");

    }

    @Override
    public int getItemCount() {
        return businessArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView businessInit;
        TextView rpNameText;
        TextView locationText;
        TextView businessTitleText;
        TextView businessStatText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rpNameText=itemView.findViewById(R.id.businessNameView);
            locationText=itemView.findViewById(R.id.businessRangeView);
            businessTitleText=itemView.findViewById(R.id.businessView);
            businessStatText=itemView.findViewById(R.id.businessStat);
            businessInit=itemView.findViewById(R.id.businessInitials);

        }
    }
}
