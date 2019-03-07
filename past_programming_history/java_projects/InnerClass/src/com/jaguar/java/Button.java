package com.jaguar.java;

public class Button {
    private String title;
    private OnclickListener onclickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClicListener(OnclickListener onclickListener) {
        this.onclickListener = onclickListener;
    }

    public void onClick() {
        this.onclickListener.onClick(this.title);
    }

    public interface OnclickListener {
        public void onClick(String title);
    }

}
