package com.eldritchsoft.progressbutton;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.databinding.BindingAdapter;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class ProgressButton extends RelativeLayout {

    private ProgressBar progressBar;
    private Button button;

    private String text;

    public ProgressButton(Context context) {
        super(context);
        init(context, null);
    }

    public ProgressButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ProgressButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ProgressButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    // METHODS

    private void init(Context context, AttributeSet attrs) {

        LayoutInflater.from(context).inflate(R.layout.progress_button, this, true);
        button = findViewById(R.id.progress_button_button);
        progressBar = findViewById(R.id.progress_button_progress_bar);

        // Forward button clicks to parent view
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { ProgressButton.this.performClick(); }
        });

        if(attrs != null) {

            TypedArray a = context.getTheme().obtainStyledAttributes(
                    attrs,
                    R.styleable.ProgressButton,
                    0, 0
            );

            try {

                text = a.getString(R.styleable.ProgressButton_text);
                button.setTextColor(a.getColor(R.styleable.ProgressButton_textColor, 0));
                if(a.getBoolean(R.styleable.ProgressButton_progress, false)) {
                    progressBar.setVisibility(VISIBLE);
                    button.setText(null);
                } else {
                    progressBar.setVisibility(GONE);
                    button.setText(text);
                }

            } finally {
                a.recycle();
            }
        }
    }

    public void startProgress() {
        button.setText(null);
        progressBar.setVisibility(VISIBLE);
    }

    public void stopProgress() {
        button.setText(text);
        progressBar.setVisibility(GONE);
    }

    public boolean isInProgress() {
        return progressBar.getVisibility() == View.VISIBLE;
    }

    @BindingAdapter("android:textColor")
    public void setTextColor(ProgressButton pb, int c) {
        pb.button.setTextColor(c);
    }

    @BindingAdapter("android:textColor")
    public void setTextColor(ProgressButton pb, ColorStateList c) {
        pb.button.setTextColor(c);
    }

    @BindingAdapter("android:text")
    public void setText(ProgressButton pb, String text) {
        this.text = text;
        pb.button.setText(text);
    }
}
