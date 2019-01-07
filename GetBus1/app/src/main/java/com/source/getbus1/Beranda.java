package com.source.getbus1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Beranda extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.beranda, container, false);
        ImageButton b1=(ImageButton) v.findViewById(R.id.imageButton1);
        ImageButton b2=(ImageButton) v.findViewById(R.id.imageButton2);
        ImageButton b3=(ImageButton) v.findViewById(R.id.imageButton3);
        ImageButton b4=(ImageButton) v.findViewById(R.id.imageButton4);
        ImageButton b5=(ImageButton) v.findViewById(R.id.imageButton5);
        ImageButton b6=(ImageButton) v.findViewById(R.id.imageButton6);
        ImageButton b7=(ImageButton) v.findViewById(R.id.imageButton7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ipb.ac.id"));
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ipb.ac.id"));
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://ipb.ac.id"));
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ipb.ac.id/news/index/2018/12/fkh-ipb-jalin-kerjasama-dengan-seoul-national-university-college-of-veterinary-medicine/9bf5378de7df87205ff1ecb63c3c1b9d"));
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ipb.ac.id/news/index/2018/12/ipb-siap-jembatani-perbedaan-data-beras-nasional/1e08c8c3de6903cb491db179c4900510"));
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ipb.ac.id/news/index/2018/12/belajar-cupping-kopi-ala-dosen-faperta-ipb/970407790345d545807f4e1735937f1e"));
                startActivity(intent);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://ipb.ac.id/news/index/2018/12/ipb-opens-mantras-command-post-at-the-banten-tsunami-disaster-site/547c8712f884ad2208c127dfeb8b830a"));
                startActivity(intent);
            }
        });

        return v;
    }
}