package com.example.shosho.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shosho on 2/9/2018.
 */

public class AdapterNews extends RecyclerView.Adapter<AdapterNews.NewsViewHolder> {
    private List<News> news_list;
    private OnItemClickListener mListener;


    public AdapterNews(List<News> newsList, OnItemClickListener listener) {
        news_list = newsList;
        mListener = listener;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View newsView = LayoutInflater.from(context).inflate(R.layout.list_news, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(newsView);
        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        News news = news_list.get(position);
        holder.mTitle.setText(news.getMy_Title());
        holder.mType.setText(news.getMy_Type());
        holder.mDate.setText(news.getMy_Date());
        holder.mSection.setText(news.getMy_Section());
        holder.firstname.setText(news.getFirstname());
        holder.bind(news_list.get(position), mListener);
    }

    @Override
    public int getItemCount() {
        return news_list.size();
    }

    public void clear() {
        news_list.clear();
        notifyDataSetChanged();
    }

    public void addAll(List<News> newsList) {
        news_list.addAll(newsList);
        notifyDataSetChanged();
    }

    public interface OnItemClickListener {
        void onItemClick(News news);
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle = (TextView) itemView.findViewById(R.id.news_title);

        TextView mType = (TextView) itemView.findViewById(R.id.news_type);

        TextView mDate = (TextView) itemView.findViewById(R.id.news_date);

        TextView mSection = (TextView) itemView.findViewById(R.id.news_section);

        TextView firstname = (TextView) itemView.findViewById(R.id.first_name);


        public NewsViewHolder(View v) {
            super(v);
        }

        public void bind(final News news, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(news);
                }
            });
        }
    }
}

