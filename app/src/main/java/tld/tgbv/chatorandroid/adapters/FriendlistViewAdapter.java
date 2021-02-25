package tld.tgbv.chatorandroid.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tld.tgbv.chatorandroid.R;

public class FriendlistViewAdapter extends RecyclerView.Adapter<FriendlistViewAdapter.ViewHolder> {

    Context ctx;
    ArrayList<String> users;

    /*
    *   CONSTRUCTOOOR
    *
     */
    public FriendlistViewAdapter(Context ctx, ArrayList users)
    {
        this.ctx = ctx;
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // it does the job but I have no idea how on earth it works under hood.
        return new ViewHolder(
            LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.activity_friendlist_row, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // render the username to the recycled view
        holder.username.setText( users.get(position) );
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder  {

        // contains user's name
        TextView username;

        // contains the parent layout
        ConstraintLayout parentLayout;

        //
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // set the elements
            username = itemView.findViewById( R.id.friendlistRowUsername );
            parentLayout = itemView.findViewById( R.id.friendlistRowLayout );


        }

    }

}
