package com.vlasovs.archivator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FileAdapter extends RecyclerView.Adapter<FileAdapter.FileViewHolder> {

  //  public ImageView fileIcon;
    private ArrayList<FileItem> fileList;

    @NonNull
    @Override
    public FileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        FileViewHolder fVH = new FileViewHolder(v);
        return fVH;
    }

    public FileAdapter(ArrayList<FileItem> list){
        fileList = list;
    }

    @Override
    public void onBindViewHolder(@NonNull FileViewHolder holder, int position) {
        FileItem currentItem = fileList.get(position);

        holder.fileName.setText(currentItem.getName());
        holder.fileSize.setText(currentItem.getSize());
        holder.lastOpened.setText(currentItem.getDate());
    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }

    public static class FileViewHolder extends RecyclerView.ViewHolder{

        public TextView fileName;
        public TextView fileSize;
        public TextView lastOpened;

        public FileViewHolder(View itemView){
            super(itemView);
            fileName = itemView.findViewById(R.id.titleText);
            fileSize = itemView.findViewById(R.id.sizeText);
            lastOpened = itemView.findViewById(R.id.descText);
        }
    }
}
