package p110o2;

import android.text.TextPaint;
import java.util.ArrayList;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.InterfaceC0674q;
import p049g1.AbstractC1571e;
import p050g2.C1605p;
import p050g2.C1610s;
import p132r2.C3038l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o2.k */
/* loaded from: classes.dex */
public abstract class AbstractC2814k {

    /* renamed from: a */
    public static final C2815l f14860a = new C2815l(false);

    /* renamed from: a */
    public static final void m4442a(C1605p c1605p, InterfaceC0674q interfaceC0674q, AbstractC0670o abstractC0670o, float f7, C0665l0 c0665l0, C3038l c3038l, AbstractC1571e abstractC1571e) {
        ArrayList arrayList = c1605p.f10319h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1610s c1610s = (C1610s) arrayList.get(i7);
            c1610s.f10329a.m2553g(interfaceC0674q, abstractC0670o, f7, c0665l0, c3038l, abstractC1571e);
            interfaceC0674q.mo1336h(0.0f, c1610s.f10329a.m2548b());
        }
    }

    /* renamed from: b */
    public static final void m4443b(TextPaint textPaint, float f7) {
        if (!Float.isNaN(f7)) {
            if (f7 < 0.0f) {
                f7 = 0.0f;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f7 * 255));
        }
    }
}
