package com.application.orderneat.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.application.orderneat.R;
import com.application.orderneat.dataModel.CardViewModel;

import org.w3c.dom.Text;

public class CardViewListAdapter extends RecyclerView.Adapter<CardViewListAdapter.ViewHolder> {

    private CardViewModel[] list;

    public CardViewListAdapter(CardViewModel[] list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View card =layoutInflater.inflate(R.layout.card_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(card);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final CardViewModel card = list[position];
        holder.dishImage.setImageResource(card.getImgId());
        holder.dishName.setText(card.getDishName());
        holder.dishFrom.setText(card.getDishFrom());
        holder.dishPrice.setText(String.valueOf(card.getDishPrice()));
        holder.dishCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Card "+card.getDishName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public CardView dishCardView;
        public ImageView dishImage;
        public TextView dishName;
        public TextView dishFrom;
        public TextView dishPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.dishCardView = (CardView) itemView.findViewById(R.id.dishCardView);
            this.dishImage = (ImageView) itemView.findViewById(R.id.dishImage);
            this.dishName = (TextView) itemView.findViewById(R.id.dishName);
            this.dishFrom = (TextView) itemView.findViewById(R.id.dishFrom);
            this.dishPrice = (TextView) itemView.findViewById(R.id.dishPrice);
        }
    }
}
