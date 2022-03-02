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

public class PastaCaptionedImagesAdapter extends RecyclerView.Adapter<PastaCaptionedImagesAdapter.ViewHolder> {
    private String[] names;
    private int[] images;

    public PastaCaptionedImagesAdapter(String[] names, int[] images) {
        this.names = names;
        this.images = images;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        CardView cv = (CardView) LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.card_captioned_image, viewGroup, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        CardView cardView = viewHolder.cardview;

        ImageView imageView = cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(),images[i]);
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(names[i]);

        TextView textView = cardView.findViewById(R.id.info_text);
        textView.setText(names[i]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardview;

        public ViewHolder(CardView v) {
            super(v);
            cardview = v;
        }
    }
}
