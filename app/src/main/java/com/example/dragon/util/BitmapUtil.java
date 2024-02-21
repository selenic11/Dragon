package com.example.dragon.util;


import android.graphics.Bitmap;
import android.graphics.Rect;

/**
 * Вспомогательные классы для работы с изображениями
 */
public class BitmapUtil {
    /**
     * Разрезать картинку на прямоугольники
     * @param bitmap исходная картинка
     * @param xCount количество вертикальных полосок
     * @param yCount количество горизонтальных полосок
     * @return двумерный массив разрезанных картинок размера xCount x yCount
     */

    public static Bitmap[][] splitBitmap(Bitmap bitmap, int xCount, int yCount) {
        Bitmap[][] bitmaps = new Bitmap[xCount][yCount];
        int width, height;
        width = bitmap.getWidth() / xCount;
        height = bitmap.getHeight() / yCount;

        for (int x = 0; x < xCount; ++x) {
            for (int y = 0; y < yCount; ++y) {
                bitmaps[x][y] = Bitmap.createBitmap(bitmap, x * width, y * height, width, height);
            }

        }
        return bitmaps;
    }

    /**
     * Определяет истинный размер картинки, без лишних прозрачных пикселей по границам. <br>
     * Позволяет избавиться от ненужного прозрачного ободка в текстурах, когда дело касается
     * реально занимаемых размеров на экране персонажем
     * @param bitmap картинка
     * @return прямоугольник с относительными координатами
     */
    public static Rect nonTransparentBorder(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();

        return new Rect();
    }

}
