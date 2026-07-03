package p087l2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.RunnableC0219y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001a0.C0005b;
import p001a0.C0006b0;
import p001a0.C0031h1;
import p001a0.C0037j;
import p001a0.C0053n;
import p027d1.C0465c;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p066i3.AbstractC2067b;
import p101n0.C2705e;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;
import p170w1.C3728t;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.z */
/* loaded from: classes.dex */
public final class C2462z implements InterfaceC2454r {

    /* renamed from: a */
    public final View f13733a;

    /* renamed from: b */
    public final C0031h1 f13734b;

    /* renamed from: c */
    public final ExecutorC2433a0 f13735c;

    /* renamed from: d */
    public boolean f13736d;

    /* renamed from: e */
    public AbstractC3368k f13737e;

    /* renamed from: f */
    public InterfaceC3279c f13738f;

    /* renamed from: g */
    public C2459w f13739g;

    /* renamed from: h */
    public C2447k f13740h;

    /* renamed from: i */
    public final ArrayList f13741i;

    /* renamed from: j */
    public final Object f13742j;

    /* renamed from: k */
    public Rect f13743k;

    /* renamed from: l */
    public final C2436c f13744l;

    /* renamed from: m */
    public final C2705e f13745m;

    /* renamed from: n */
    public RunnableC0219y f13746n;

    public C2462z(View view, C3728t c3728t) {
        C0031h1 c0031h1 = new C0031h1(view);
        ExecutorC2433a0 executorC2433a0 = new ExecutorC2433a0(Choreographer.getInstance());
        this.f13733a = view;
        this.f13734b = c0031h1;
        this.f13735c = executorC2433a0;
        this.f13737e = C2434b.f13658i;
        this.f13738f = C2434b.f13659j;
        this.f13739g = new C2459w("", C1602n0.f10302b, 4);
        this.f13740h = C2447k.f13698g;
        this.f13741i = new ArrayList();
        this.f13742j = AbstractC2710c.m4326I(new C0053n(15, this));
        this.f13744l = new C2436c(c3728t, c0031h1);
        this.f13745m = new C2705e(new EnumC2461y[16]);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: a */
    public final void mo682a(C2459w c2459w, InterfaceC2453q interfaceC2453q, C1598l0 c1598l0, C0005b c0005b, C0465c c0465c, C0465c c0465c2) {
        C2436c c2436c = this.f13744l;
        synchronized (c2436c.f13667c) {
            try {
                c2436c.f13674j = c2459w;
                c2436c.f13676l = interfaceC2453q;
                c2436c.f13675k = c1598l0;
                c2436c.f13677m = c0005b;
                c2436c.f13678n = c0465c;
                c2436c.f13679o = c0465c2;
                if (!c2436c.f13669e) {
                    if (c2436c.f13668d) {
                    }
                }
                c2436c.m4010a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, g5.d] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, g5.d] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, g5.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, g5.d] */
    @Override // p087l2.InterfaceC2454r
    /* renamed from: b */
    public final void mo683b(C2459w c2459w, C2459w c2459w2) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        if (C1602n0.m2585a(this.f13739g.f13724b, c2459w2.f13724b) && AbstractC3367j.m5096a(this.f13739g.f13725c, c2459w2.f13725c)) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.f13739g = c2459w2;
        int size = this.f13741i.size();
        for (int i10 = 0; i10 < size; i10++) {
            InputConnectionC2455s inputConnectionC2455s = (InputConnectionC2455s) ((WeakReference) this.f13741i.get(i10)).get();
            if (inputConnectionC2455s != null) {
                inputConnectionC2455s.f13712d = c2459w2;
            }
        }
        C2436c c2436c = this.f13744l;
        synchronized (c2436c.f13667c) {
            c2436c.f13674j = null;
            c2436c.f13676l = null;
            c2436c.f13675k = null;
            c2436c.f13677m = C2434b.f13656g;
            c2436c.f13678n = null;
            c2436c.f13679o = null;
        }
        int i11 = -1;
        if (AbstractC3367j.m5096a(c2459w, c2459w2)) {
            if (z7) {
                C0031h1 c0031h1 = this.f13734b;
                int m2589e = C1602n0.m2589e(c2459w2.f13724b);
                int m2588d = C1602n0.m2588d(c2459w2.f13724b);
                C1602n0 c1602n0 = this.f13739g.f13725c;
                if (c1602n0 != null) {
                    i9 = C1602n0.m2589e(c1602n0.f10304a);
                } else {
                    i9 = -1;
                }
                C1602n0 c1602n02 = this.f13739g.f13725c;
                if (c1602n02 != null) {
                    i11 = C1602n0.m2588d(c1602n02.f10304a);
                }
                ((InputMethodManager) c0031h1.f153g.getValue()).updateSelection((View) c0031h1.f152f, m2589e, m2588d, i9, i11);
                return;
            }
            return;
        }
        if (c2459w != null && (!AbstractC3367j.m5096a(c2459w.f13723a.f10239f, c2459w2.f13723a.f10239f) || (C1602n0.m2585a(c2459w.f13724b, c2459w2.f13724b) && !AbstractC3367j.m5096a(c2459w.f13725c, c2459w2.f13725c)))) {
            C0031h1 c0031h12 = this.f13734b;
            ((InputMethodManager) c0031h12.f153g.getValue()).restartInput((View) c0031h12.f152f);
            return;
        }
        int size2 = this.f13741i.size();
        for (int i12 = 0; i12 < size2; i12++) {
            InputConnectionC2455s inputConnectionC2455s2 = (InputConnectionC2455s) ((WeakReference) this.f13741i.get(i12)).get();
            if (inputConnectionC2455s2 != null) {
                C2459w c2459w3 = this.f13739g;
                C0031h1 c0031h13 = this.f13734b;
                if (inputConnectionC2455s2.f13716h) {
                    inputConnectionC2455s2.f13712d = c2459w3;
                    if (inputConnectionC2455s2.f13714f) {
                        ((InputMethodManager) c0031h13.f153g.getValue()).updateExtractedText((View) c0031h13.f152f, inputConnectionC2455s2.f13713e, AbstractC2067b.m3274B(c2459w3));
                    }
                    C1602n0 c1602n03 = c2459w3.f13725c;
                    long j6 = c2459w3.f13724b;
                    if (c1602n03 != null) {
                        i7 = C1602n0.m2589e(c1602n03.f10304a);
                    } else {
                        i7 = -1;
                    }
                    C1602n0 c1602n04 = c2459w3.f13725c;
                    if (c1602n04 != null) {
                        i8 = C1602n0.m2588d(c1602n04.f10304a);
                    } else {
                        i8 = -1;
                    }
                    ((InputMethodManager) c0031h13.f153g.getValue()).updateSelection((View) c0031h13.f152f, C1602n0.m2589e(j6), C1602n0.m2588d(j6), i7, i8);
                }
            }
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: c */
    public final void mo684c(C0465c c0465c) {
        Rect rect;
        this.f13743k = new Rect(AbstractC3784a.m5794D(c0465c.f1625a), AbstractC3784a.m5794D(c0465c.f1626b), AbstractC3784a.m5794D(c0465c.f1627c), AbstractC3784a.m5794D(c0465c.f1628d));
        if (this.f13741i.isEmpty() && (rect = this.f13743k) != null) {
            this.f13733a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: d */
    public final void mo685d() {
        m4027i(EnumC2461y.f13728e);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: e */
    public final void mo686e() {
        m4027i(EnumC2461y.f13730g);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: f */
    public final void mo687f() {
        m4027i(EnumC2461y.f13731h);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: g */
    public final void mo688g() {
        this.f13736d = false;
        this.f13737e = C2434b.f13660k;
        this.f13738f = C2434b.f13661l;
        this.f13743k = null;
        m4027i(EnumC2461y.f13729f);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: h */
    public final void mo689h(C2459w c2459w, C2447k c2447k, C0037j c0037j, C0006b0 c0006b0) {
        this.f13736d = true;
        this.f13739g = c2459w;
        this.f13740h = c2447k;
        this.f13737e = c0037j;
        this.f13738f = c0006b0;
        m4027i(EnumC2461y.f13728e);
    }

    /* renamed from: i */
    public final void m4027i(EnumC2461y enumC2461y) {
        this.f13745m.m4300b(enumC2461y);
        if (this.f13746n == null) {
            RunnableC0219y runnableC0219y = new RunnableC0219y(11, this);
            this.f13735c.execute(runnableC0219y);
            this.f13746n = runnableC0219y;
        }
    }
}
