package com.homework.ch12;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaCaptionedImagesAdapter extends RecyclerView.Adapter<PizzaCaptionedImagesAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageID;

    public PizzaCaptionedImagesAdapter(String[] captions, int[] imageID) {
        this.captions = captions;
        this.imageID = imageID;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_captioned_image, viewGroup, false
                );
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        CardView cardView = holder.cv;

        ImageView iv = cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageID[i]);
        iv.setImageDrawable(drawable);
        iv.setContentDescription(captions[i]);

        TextView tv = cardView.findViewById(R.id.info_text);
        tv.setText(captions[i]);
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;

        public ViewHolder(CardView cardView) {
            super(cardView);
            cv = cardView;
        }
    }
}
