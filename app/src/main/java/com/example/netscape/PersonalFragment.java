package com.example.netscape;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class PersonalFragment extends Fragment {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView profileCards;
    ArrayList<User> users;
    UserAdapter userAdapter;
    View view;
    Animation rotateOpen;
    Animation rotateClose;
    Animation fromBottom;
    Animation toBottom;
    FloatingActionButton Float;
    FloatingActionButton NotesButton;
    FloatingActionButton HeartButton;
    FloatingActionButton JobsButton;
    FloatingActionButton GroupsButton;
    FloatingActionButton BusinessButton;
    FloatingActionButton ShoppingButton;
    FloatingActionButton MatrimonyButton;
    boolean clicked=false;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_personal, container, false);
        profileCards=view.findViewById(R.id.profileRecycler);
        Float=view.findViewById(R.id.floatingButton);
        NotesButton=view.findViewById(R.id.notesButton);
        HeartButton=view.findViewById(R.id.floatingButton3);
        JobsButton=view.findViewById(R.id.jobsButton);
        GroupsButton=view.findViewById(R.id.groupsButton);
        BusinessButton=view.findViewById(R.id.businessButton);
        ShoppingButton=view.findViewById(R.id.shoppingButton);
        MatrimonyButton=view.findViewById(R.id.matrimonyButton);


        profileCards.setHasFixedSize(true);
        layoutManager= new LinearLayoutManager(getContext());
        profileCards.setLayoutManager(layoutManager);

        users= new ArrayList<>();

        users.add(0,new User("Arti Mule","Nanded","Computer Science Engineer", "Within 9.6 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));
        users.add(new User("Ritesh Shinde","Solapur","Student", "Within 9.8 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));
        users.add(new User("Radhika Mugatkar","Nanded","QA Intern", "Within 19.4 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));
        users.add(new User("Sandip Mokale","Hyderabad","Student Employee", "Within 24.7 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));
        users.add(new User("Janhvi Wadje","Pune","Student", "Within 5.1 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”\nMBA(Marketing and Business analysts" ));
        users.add(new User("Sandip Mokale","Hyderabad","Student Employee", "Within 24.7 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));
        users.add(new User("Shruti Joshi","Nanded-Waghala","Student", "Within 5.9 KM",
                "Coffee | Business | Friendship", "Hi community! I am open to new \nconnections ”\uD83D\uDE0A”" ));

        userAdapter= new UserAdapter(getContext(),users);
        profileCards.setAdapter(userAdapter);


        rotateOpen = AnimationUtils.loadAnimation(getContext(), R.anim.rotate_open_anim);
        rotateClose = AnimationUtils.loadAnimation(getContext(), R.anim.rotate_close_anim);
        fromBottom = AnimationUtils.loadAnimation(getContext(), R.anim.from_bottom_anim);
        toBottom = AnimationUtils.loadAnimation(getContext(), R.anim.to_bottom_anim);

        Float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddButtonClicked();
            }
        });

        return view;
    }

    private void onAddButtonClicked() {
        setVisibility(clicked);
        setAnimation(clicked);
        if (!clicked){
            clicked=true;
        }else{
            clicked=false;
        }
    }

    private void setVisibility(boolean clicked) {
        if(!clicked){
            NotesButton.setVisibility(View.VISIBLE);
            HeartButton.setVisibility(View.VISIBLE);
            JobsButton.setVisibility(View.VISIBLE);
            GroupsButton.setVisibility(View.VISIBLE);
            BusinessButton.setVisibility(View.VISIBLE);
            ShoppingButton.setVisibility(View.VISIBLE);
            MatrimonyButton.setVisibility(View.VISIBLE);

        }else {
            NotesButton.setVisibility(View.INVISIBLE);
            HeartButton.setVisibility(View.INVISIBLE);
            JobsButton.setVisibility(View.INVISIBLE);
            GroupsButton.setVisibility(View.INVISIBLE);
            BusinessButton.setVisibility(View.INVISIBLE);
            ShoppingButton.setVisibility(View.INVISIBLE);
            MatrimonyButton.setVisibility(View.INVISIBLE);
        }
    }

    private void setAnimation(boolean clicked) {
            if(!clicked){
                NotesButton.startAnimation(fromBottom);
                HeartButton.startAnimation(fromBottom);
                JobsButton.startAnimation(fromBottom);
                GroupsButton.startAnimation(fromBottom);
                BusinessButton.startAnimation(fromBottom);
                ShoppingButton.startAnimation(fromBottom);
                MatrimonyButton.startAnimation(fromBottom);
                Float.startAnimation(rotateOpen);
            }else {
                NotesButton.startAnimation(toBottom);
                HeartButton.startAnimation(toBottom);
                JobsButton.startAnimation(toBottom);
                GroupsButton.startAnimation(toBottom);
                BusinessButton.startAnimation(toBottom);
                ShoppingButton.startAnimation(toBottom);
                MatrimonyButton.startAnimation(toBottom);
                Float.startAnimation(rotateClose);
            }
    }


}