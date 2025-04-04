package com.example.drivesmart;

import static android.content.Intent.getIntent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class PDFBooks extends AppCompatActivity {

    LinearLayout pdfContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        pdfContainer = findViewById(R.id.pdfContainer);
        ImageView back = findViewById(R.id.imageRule1);
        back.setOnClickListener(view -> finish());

        int test_position = getIntent().getIntExtra("key_position", 0);
        String pdfFileName = (test_position == 0) ? "first.pdf" : "second.pdf";

        try {
            renderAllPages(pdfFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void renderAllPages(String assetFileName) throws IOException {
        File file = new File(getCacheDir(), assetFileName);
        if (!file.exists()) {
            InputStream asset = getAssets().open(assetFileName);
            FileOutputStream output = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int size;
            while ((size = asset.read(buffer)) != -1) {
                output.write(buffer, 0, size);
            }
            asset.close();
            output.close();
        }

        ParcelFileDescriptor fileDescriptor = ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY);
        PdfRenderer renderer = new PdfRenderer(fileDescriptor);

        for (int i = 0; i < renderer.getPageCount(); i++) {
            PdfRenderer.Page page = renderer.openPage(i);
            Bitmap bitmap = Bitmap.createBitmap(page.getWidth(), page.getHeight(), Bitmap.Config.ARGB_8888);
            page.render(bitmap, null, null, PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
            page.close();

            ImageView pageImage = new ImageView(this);
            pageImage.setImageBitmap(bitmap);
            pageImage.setAdjustViewBounds(true);
            pdfContainer.addView(pageImage);
        }

        renderer.close();
        fileDescriptor.close();
    }
}
