package com.example.netscape;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    Context context;
    ArrayList<User> users;

    public UserAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.friendinvitecard, parent, false);
        return new UserAdapter.MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull UserAdapter.MyViewHolder holder, int position) {
        User user = users.get(position);
        String name=user.getName();
        String initials = "" + name.charAt(0);

        for (int i =0; i < name.length();i++){
            if (name.charAt(i)== ' '){
                initials+= name.charAt(i+1);
                break;
            }
        }

        holder.initialsCard.bringToFront();
        holder.nameText.setText(user.getName());
        holder.jobTitleText.setText(user.getLocation()+" | "+user.getJobTitle());
        holder.rangeText.setText(user.getRange());
        holder.purposeText.setText(user.getPurpose());
        holder.statusText.setText(user.getStatus());
        holder.initialsText.setText(initials);

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameText;
        TextView jobTitleText;
        TextView rangeText;
        TextView purposeText;
        TextView statusText;
        TextView initialsText;
        MaterialCardView initialsCard;
        MaterialCardView mainCard;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameText=itemView.findViewById(R.id.nameView);
            jobTitleText=itemView.findViewById(R.id.jobView);
            rangeText=itemView.findViewById(R.id.distanceView);
            purposeText=itemView.findViewById(R.id.purposeView);
            statusText=itemView.findViewById(R.id.statusView);
            initialsText=itemView.findViewById(R.id.initialsView);
            initialsCard=itemView.findViewById(R.id.initialsCardView);
            mainCard=itemView.findViewById(R.id.profileCard);
        }
    }
}
