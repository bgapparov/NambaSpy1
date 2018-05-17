package com.namba.nambaspy1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class PlacePhotosAdapter extends RecyclerView.Adapter<PlacePhotosAdapter.PlacePhotoViewHolder>{


    public class PlacePhotoViewHolder extends RecyclerView.ViewHolder{
        private final ImageView placeImageView;
        public PlacePhotoViewHolder(View itemView) {
            super(itemView);
            placeImageView = itemView.findViewById(R.id.places_photo_image_view);
        }
    }

    private LayoutInflater inflater;
    private List<Integer> photos;

    PlacePhotosAdapter(Context context){
        inflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public PlacePhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.place_photo_recyclerview_item, parent, false);
        return new PlacePhotoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacePhotoViewHolder holder, int position) {

        if (photos != null) {
            holder.placeImageView.setImageResource(photos.get(position));
        } else {
        }
    }

    @Override
    public int getItemCount() {
        if (photos != null)
            return photos.size();
        else return 0;
    }

    public void setPhotos(List<Integer> photos) {
        this.photos = photos;
        notifyDataSetChanged();
    }
}
