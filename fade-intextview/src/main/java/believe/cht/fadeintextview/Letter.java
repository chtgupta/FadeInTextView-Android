package believe.cht.fadeintextview;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/**
 * Created by Chahat on 18-May-18.
 */

class Letter extends CharacterStyle implements UpdateAppearance {

    private float alpha = 0.0f;

    @Override
    public void updateDrawState(TextPaint tp) {
        int color = ((int) (0xFF * alpha) << 24) | (tp.getColor() & 0x00FFFFFF);
        tp.setColor(color);
    }

    public void setAlpha(float alpha) {
        this.alpha = Math.max(Math.min(alpha, 1.0f), 0.0f);
    }

}