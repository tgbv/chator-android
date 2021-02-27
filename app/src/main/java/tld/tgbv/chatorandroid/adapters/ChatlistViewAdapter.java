package tld.tgbv.chatorandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tld.tgbv.chatorandroid.R;
import tld.tgbv.chatorandroid.models.Lobbies;

public class ChatlistViewAdapter extends RecyclerView.Adapter<ChatlistViewAdapter.ViewHolder> {

    private Lobbies lobbies;
    private Context ctx;

    public ChatlistViewAdapter(Context ctx, Lobbies lobbies)
    {
        this.ctx = ctx;
        this.lobbies = lobbies;
    }

    /**
     * Called when RecyclerView needs a new {@link ViewHolder} of the given type to represent
     */
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // it does the job but I have no idea how on earth it works under hood.
        return new ChatlistViewAdapter.ViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.activity_chatlist_row, parent, false)
        );
    }

    /**
     * Called by RecyclerView to display the data at the specified position. This method should
     * update the contents of the {@link ViewHolder#itemView} to reflect the item at the given
     * position.
     */
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //holder.friendlistRowUsername.setText( this.lobbies.get(position) );
    }

    /**
     * Returns the total number of items in the data set held by the adapter.
     *
     * @return The total number of items in this adapter.
     */
    @Override
    public int getItemCount() {
        return this.lobbies.getLength();
    }

    /*
    *   VIEW HOLDER
    */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView friendlistRowUsername;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // set elements
            friendlistRowUsername = itemView.findViewById(R.id.friendlistRowUsername);
        }
    }
}
