package com.example.dragon;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import androidx.annotation.NonNull;

public class GameView extends View {


    public GameView(Context context) {
        super(context);
    }

    /**
     * При первом событии изменения размера экрана запустится игра
     */
    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);

    }

    /**
     * Очередная отрисовка игры
     * Вызывается при запуске, а также после очередного invalidate
     */

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }


}
