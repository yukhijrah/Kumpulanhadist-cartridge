package com.cartridryan14.kumpulanhadist.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.cartridryan14.kumpulanhadist.R;


public class DoaHolder extends RecyclerView.ViewHolder {
    public TextView doaTitle, doaSubtitle, doaSurah;

    public DoaHolder(View itemView) {
        super(itemView);

        doaTitle = (TextView) itemView.findViewById(R.id.doa_title);
        doaSubtitle = (TextView) itemView.findViewById(R.id.doa_subtitle);
        doaSurah = (TextView) itemView.findViewById(R.id.doa_Surah);
    }
}

