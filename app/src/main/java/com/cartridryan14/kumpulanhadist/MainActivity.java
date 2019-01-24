package com.cartridryan14.kumpulanhadist;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cartridryan14.kumpulanhadist.adapter.DoaAdapter;
import com.cartridryan14.kumpulanhadist.adapter.DoaListener;
import com.cartridryan14.kumpulanhadist.fragment.DoaDetailFragment;
import com.cartridryan14.kumpulanhadist.model.DoaModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements DoaListener {


    public List<DoaModel> doa = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casting recyclerview
        recyclerView = (RecyclerView)findViewById(R.id.recycle);

        LinearLayoutManager linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        doaCollections();

        DoaAdapter adapter = new DoaAdapter(doa);
        adapter.setListener(this);
        recyclerView.setAdapter(adapter);

    }

    private void replaceFrameDetail(DoaModel doa){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        DoaDetailFragment doafragment = new DoaDetailFragment();

        Bundle kirimDoaBundle = new Bundle();
        kirimDoaBundle.putString("nama_doa", doa.getNama());
        kirimDoaBundle.putString("arti_doa", doa.getArti());
        kirimDoaBundle.putString("surah_doa", doa.getSurah());

        //dilempar ke doa fragment
        doafragment.setArguments(kirimDoaBundle);


        ft.replace(R.id.frm_detail, doafragment);
        ft.commit();


    }

    private void doaCollections(){

        doa.add(new DoaModel("Agama", "Agama itu mudah", "الَدِّيْنُ يُسرٌ "));
        doa.add(new DoaModel("Shalat", "Kunci surga adalah shalat", "مِفْتَاحُ الْجَنَّةِ الصَّلاَةُ "));
        doa.add(new DoaModel("Kecurangan", "Siapa yang curang bukan golongan kami", "مَنْ غَشَّنا فَلَيْسَ مِنَّا "));
        doa.add(new DoaModel("Salam", "Ucapan salam sebelum bicara", "الَسَّلامُ قَبْلَ الكَلاَمِ "));
        doa.add(new DoaModel("Jujur", "Hendaknya kalian berlaku jujur", "علَيْكُمْ باِلصِّدْقِ "));

        doa.add(new DoaModel("Amalan", "Setiap amalam sesuai dengan niatnya", "نمَا الأعْمَالُ باِلنِّيَةِإِ "));
        doa.add(new DoaModel("Kebersihan", "Kebersihan sebagian dari iman", "الطُّهُورُ شَطْرُ الإِيمَانِ "));
        doa.add(new DoaModel("Merampas", "Siapa merampas milik orang bukan golongan kami", "مَنِ انْتَهَبَ نُهْبَةً فَلَيْسَ مِنَّا"));
        doa.add(new DoaModel("Surga", "SSurga berada dibawah telapak kaki ibu", "الْجَنَّةُ تَحْتَ أقْدامِ الأُمَّهَاتِ"));
        doa.add(new DoaModel("Pemarah", "Jauhi sifat pemarah", "اِجْتَنِبُواالْغَضَبَ"));



    }

    @Override
    public void onDoaClick(DoaModel doaModel) {
        replaceFrameDetail(doaModel);

    }
}
