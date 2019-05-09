package com.example.company.magicalmusicplayer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;

public class PlaylistImageView extends android.support.v7.widget.AppCompatImageView {

    public PlaylistImageView(Context context) {
        super(context);
    }

    public PlaylistImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PlaylistImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Integer imageResid = (Integer)this.getTag();

        Bitmap mask = BitmapFactory.decodeResource(getContext().getResources(),R.drawable.main_playlist_mask);
        Bitmap original = BitmapFactory.decodeResource(getContext().getResources(), imageResid);
        Bitmap scaledOriginal = Bitmap.createScaledBitmap(original, mask.getWidth(), mask.getHeight(), false);
        Bitmap result = Bitmap.createBitmap(mask.getWidth(), mask.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas tempCanvas = new Canvas(result);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        tempCanvas.drawBitmap(scaledOriginal, 0, 0, null);
        tempCanvas.drawBitmap(mask, 0, 0, paint);
        paint.setXfermode(null);
        canvas.drawBitmap(result, 0, 0, new Paint());
    }
}
