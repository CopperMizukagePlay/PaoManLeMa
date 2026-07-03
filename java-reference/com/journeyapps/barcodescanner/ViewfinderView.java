package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.paoman.lema.R;
import java.util.ArrayList;
import p022c4.C0406p;
import p023c5.AbstractC0415g;
import p023c5.C0414f;
import p023c5.C0432x;
import p052g4.AbstractC1681i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public class ViewfinderView extends View {

    /* renamed from: p */
    public static final int[] f1524p = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: e */
    public final Paint f1525e;

    /* renamed from: f */
    public int f1526f;

    /* renamed from: g */
    public final int f1527g;

    /* renamed from: h */
    public final int f1528h;

    /* renamed from: i */
    public boolean f1529i;

    /* renamed from: j */
    public int f1530j;

    /* renamed from: k */
    public ArrayList f1531k;

    /* renamed from: l */
    public ArrayList f1532l;

    /* renamed from: m */
    public AbstractC0415g f1533m;

    /* renamed from: n */
    public Rect f1534n;

    /* renamed from: o */
    public C0432x f1535o;

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1525e = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1681i.f10466b);
        this.f1526f = obtainStyledAttributes.getColor(4, resources.getColor(R.color.zxing_viewfinder_mask));
        obtainStyledAttributes.getColor(1, resources.getColor(R.color.zxing_result_view));
        this.f1527g = obtainStyledAttributes.getColor(2, resources.getColor(R.color.zxing_viewfinder_laser));
        this.f1528h = obtainStyledAttributes.getColor(0, resources.getColor(R.color.zxing_possible_result_points));
        this.f1529i = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        this.f1530j = 0;
        this.f1531k = new ArrayList(20);
        this.f1532l = new ArrayList(20);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0432x c0432x;
        AbstractC0415g abstractC0415g = this.f1533m;
        if (abstractC0415g != null) {
            Rect framingRect = abstractC0415g.getFramingRect();
            C0432x previewSize = this.f1533m.getPreviewSize();
            if (framingRect != null && previewSize != null) {
                this.f1534n = framingRect;
                this.f1535o = previewSize;
            }
        }
        Rect rect = this.f1534n;
        if (rect != null && (c0432x = this.f1535o) != null) {
            int width = getWidth();
            int height = getHeight();
            int i7 = this.f1526f;
            Paint paint = this.f1525e;
            paint.setColor(i7);
            float f7 = width;
            canvas.drawRect(0.0f, 0.0f, f7, rect.top, paint);
            canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, paint);
            canvas.drawRect(rect.right + 1, rect.top, f7, rect.bottom + 1, paint);
            canvas.drawRect(0.0f, rect.bottom + 1, f7, height, paint);
            if (this.f1529i) {
                paint.setColor(this.f1527g);
                paint.setAlpha(f1524p[this.f1530j]);
                this.f1530j = (this.f1530j + 1) % 8;
                int height2 = (rect.height() / 2) + rect.top;
                canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, paint);
            }
            float width2 = getWidth() / c0432x.f1470e;
            float height3 = getHeight() / c0432x.f1471f;
            boolean isEmpty = this.f1532l.isEmpty();
            int i8 = 0;
            int i9 = this.f1528h;
            if (!isEmpty) {
                paint.setAlpha(80);
                paint.setColor(i9);
                ArrayList arrayList = this.f1532l;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    C0406p c0406p = (C0406p) obj;
                    canvas.drawCircle((int) (c0406p.f1390a * width2), (int) (c0406p.f1391b * height3), 3.0f, paint);
                }
                this.f1532l.clear();
            }
            if (!this.f1531k.isEmpty()) {
                paint.setAlpha(160);
                paint.setColor(i9);
                ArrayList arrayList2 = this.f1531k;
                int size2 = arrayList2.size();
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    C0406p c0406p2 = (C0406p) obj2;
                    canvas.drawCircle((int) (c0406p2.f1390a * width2), (int) (c0406p2.f1391b * height3), 6.0f, paint);
                }
                ArrayList arrayList3 = this.f1531k;
                ArrayList arrayList4 = this.f1532l;
                this.f1531k = arrayList4;
                this.f1532l = arrayList3;
                arrayList4.clear();
            }
            postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
        }
    }

    public void setCameraPreview(AbstractC0415g abstractC0415g) {
        this.f1533m = abstractC0415g;
        abstractC0415g.f1413n.add(new C0414f(2, this));
    }

    public void setLaserVisibility(boolean z7) {
        this.f1529i = z7;
    }

    public void setMaskColor(int i7) {
        this.f1526f = i7;
    }
}
