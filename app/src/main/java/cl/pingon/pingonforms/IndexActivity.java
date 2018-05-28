package cl.pingon.pingonforms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);


        TextView facebook = findViewById(R.id.facebookTv);
        TextView linkedin = findViewById(R.id.linkedinTv);
        TextView webpage = findViewById(R.id.webpageTv);
        TextView equipment = findViewById(R.id.equipmentTv);
        TextView contact = findViewById(R.id.contactTv);
        TextView apply = findViewById(R.id.applyTv);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                facebookIntent.setData(Uri.parse("https://www.facebook.com/PingonChile/"));
                startActivity(facebookIntent);
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW);
                linkedinIntent.setData(Uri.parse("https://www.linkedin.com/company/servicios-pingon-chile/"));
                startActivity(linkedinIntent);
            }
        });

        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webpageIntent = new Intent(Intent.ACTION_VIEW);
                webpageIntent.setData(Uri.parse("http://www.pingon.cl"));
                startActivity(webpageIntent);
            }
        });

        equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent equipmentIntent = new Intent(IndexActivity.this, TabbedActivity.class);
                startActivity(equipmentIntent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(Intent.ACTION_DIAL);
                contactIntent.setData(Uri.parse("tel:" + "+56226222828"));
                startActivity(contactIntent);
            }
        });

    }
}
