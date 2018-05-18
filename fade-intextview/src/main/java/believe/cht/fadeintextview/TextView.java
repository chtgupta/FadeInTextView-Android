package believe.cht.fadeintextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * Created by Chahat on 17-May-18.
 */

public class TextView extends AppCompatTextView {

    private long start, letterDuration;
    private boolean isAnimating = false;
    private Interpolator mInterpolator;
    private CharSequence charSequence;
    private SpannableString spannableString;

    public TextView(Context context) {
        super(context);
        init();
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs);
    }

    private void init() {
        mInterpolator = new DecelerateInterpolator();
        letterDuration = 250; // default letterDuration

    }

    private void init(Context context, AttributeSet attrs) {

        mInterpolator = new DecelerateInterpolator();

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextView);
        try {
            // getting letterDuration from XML attribute
            letterDuration = typedArray.getInteger(R.styleable.TextView_letterDuration, 120);
        } finally {
            typedArray.recycle();
        }
    }

    public void setLetterDuration(long letterDuration) {
        this.letterDuration = letterDuration;
    }

    @Override
    public void setText(CharSequence text, BufferType type) {

        charSequence = text;
        spannableString = new SpannableString(text);

        Letter[] letters = spannableString.getSpans(0, spannableString.length(), Letter.class);
        for (Letter letter : letters) {
            spannableString.removeSpan(letter);
        }

        final int length = spannableString.length();
        for (int i = 0; i < length; i++) {
            spannableString.setSpan(new Letter(), i, i + 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        }

        super.setText(spannableString, BufferType.SPANNABLE);

        isAnimating = true;
        start = AnimationUtils.currentAnimationTimeMillis();
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override
    @ViewDebug.CapturedViewProperty
    public CharSequence getText() {
        return charSequence;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (isAnimating) {
            long mDelta = AnimationUtils.currentAnimationTimeMillis() - start;
            Letter[] letters = spannableString.getSpans(0, spannableString.length(), Letter.class);

            final int length = letters.length;

            for (int i = 0; i < length; i++) {
                Letter letter = letters[i];
                float delta = (float) Math.max(Math.min((mDelta - (i * letterDuration)), letterDuration), 0);
                letter.setAlpha(mInterpolator.getInterpolation(delta / (float) letterDuration));
            }

            if (mDelta < letterDuration * length) {
                ViewCompat.postInvalidateOnAnimation(this);
            } else {
                isAnimating = false;
            }

        }
    }

    // to get the current Animation state
    public boolean isAnimating() {
        return isAnimating;
    }

}