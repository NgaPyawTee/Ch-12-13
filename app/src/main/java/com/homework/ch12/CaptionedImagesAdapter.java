package com.homework.ch12;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageID;
    private Listener interface_listener;

    interface Listener{
        void onClick(int position);
    }

    public void setInterface_listener(Listener listener) {
        this.interface_listener = listener;
    }

    public CaptionedImagesAdapter(String[] captions, int[] imageID) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        CardView cardView = holder.cv;

        ImageView iv = cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageID[i]);
        iv.setImageDrawable(drawable);
        iv.setContentDescription(captions[i]);

        TextView tv = cardView.findViewById(R.id.info_text);
        tv.setText(captions[i]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(interface_listener != null){
                   interface_listener.onClick(i);
               }
            }
        });
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
