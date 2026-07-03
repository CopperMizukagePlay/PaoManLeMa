package p125q2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import p049g1.AbstractC1571e;
import p049g1.C1573g;
import p049g1.C1574h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q2.a */
/* loaded from: classes.dex */
public final class C2984a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: e */
    public final AbstractC1571e f15416e;

    public C2984a(AbstractC1571e abstractC1571e) {
        this.f15416e = abstractC1571e;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C1573g c1573g = C1573g.f10187a;
            AbstractC1571e abstractC1571e = this.f15416e;
            if (AbstractC3367j.m5096a(abstractC1571e, c1573g)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC1571e instanceof C1574h) {
                textPaint.setStyle(Paint.Style.STROKE);
                C1574h c1574h = (C1574h) abstractC1571e;
                textPaint.setStrokeWidth(c1574h.f10188a);
                textPaint.setStrokeMiter(c1574h.f10189b);
                int i7 = c1574h.f10191d;
                if (i7 == 0) {
                    join = Paint.Join.MITER;
                } else if (i7 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i7 == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.MITER;
                }
                textPaint.setStrokeJoin(join);
                int i8 = c1574h.f10190c;
                if (i8 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i8 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i8 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect(null);
                return;
            }
            throw new RuntimeException();
        }
    }
}
