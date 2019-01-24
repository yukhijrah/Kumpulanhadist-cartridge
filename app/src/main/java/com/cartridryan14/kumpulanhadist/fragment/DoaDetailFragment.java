package com.cartridryan14.kumpulanhadist.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cartridryan14.kumpulanhadist.DetailActivity;
import com.cartridryan14.kumpulanhadist.R;

public class DoaDetailFragment extends Fragment {

    private TextView txtNamaDoa;
    private Button btnReadMore;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_doa_detail, container, false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtNamaDoa = (TextView) view.findViewById(R.id.txt_nama_doa);
        btnReadMore = (Button) view.findViewById(R.id.btn_doa);

        txtNamaDoa.setText(getArguments().getString("nama_doa"));

        onClickReadMore();
    }

    private void onClickReadMore() {
        btnReadMore.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String doaTitle = getArguments().getString("nama_doa");
                String doaSubtitle = getArguments().getString("arti_doa");
                String doaSurah = getArguments().getString("surah_doa");

                Intent detailIntent = new Intent(getContext(), DetailActivity.class);
                detailIntent.putExtra("nama_doa", doaTitle);
                detailIntent.putExtra("arti_doa", doaSubtitle);
                detailIntent.putExtra("surah_doa", doaSurah);
                startActivity(detailIntent);

            }
        });
    }

}
