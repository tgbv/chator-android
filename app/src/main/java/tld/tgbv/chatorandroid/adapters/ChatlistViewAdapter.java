package tld.tgbv.chatorandroid.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tld.tgbv.chatorandroid.R;

public class ChatlistViewAdapter extends RecyclerView.Adapter<> {

    private ArrayList lobbies;
    private Context ctx;

    public ChatlistViewAdapter(Context ctx, ArrayList lobbies)
    {
        this.ctx = ctx;
        this.lobbies = lobbies;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // it does the job but I have no idea how on earth it works under hood.
        return new ChatlistViewAdapter.ViewHolder(
                LayoutInflater
                        .from(parent.getContext())
                        .inflate(R.layout.activity_chatlist_row, parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // set elements
        }
    }
}
