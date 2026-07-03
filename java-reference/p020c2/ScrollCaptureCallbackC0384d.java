package p020c2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import java.util.function.Consumer;
import p001a0.AbstractC0094y0;
import p001a0.C0005b;
import p001a0.C0019e1;
import p001a0.C0062p0;
import p012b3.AbstractC0275c;
import p018c0.C0334d;
import p018c0.C0345o;
import p028d2.C0482o;
import p032d6.AbstractC0525d0;
import p032d6.C0550l1;
import p032d6.C0565q1;
import p035e1.AbstractC0659i0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p140s2.C3101k;
import p158u5.AbstractC3367j;
import p170w1.C3728t;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c2.d */
/* loaded from: classes.dex */
public final class ScrollCaptureCallbackC0384d implements ScrollCaptureCallback {

    /* renamed from: a */
    public final C0482o f1298a;

    /* renamed from: b */
    public final C3101k f1299b;

    /* renamed from: c */
    public final C0019e1 f1300c;

    /* renamed from: d */
    public final C3728t f1301d;

    /* renamed from: e */
    public final C2090c f1302e;

    /* renamed from: f */
    public final C0387g f1303f;

    public ScrollCaptureCallbackC0384d(C0482o c0482o, C3101k c3101k, C2090c c2090c, C0019e1 c0019e1, C3728t c3728t) {
        this.f1298a = c0482o;
        this.f1299b = c3101k;
        this.f1300c = c0019e1;
        this.f1301d = c3728t;
        this.f1302e = new C2090c(c2090c.f12349e.mo855z(C0385e.f1304e));
        this.f1303f = new C0387g(c3101k.m4788b(), new C0383c(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r9 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m850a(ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d, ScrollCaptureSession scrollCaptureSession, C3101k c3101k, AbstractC2583c abstractC2583c) {
        C0381a c0381a;
        int i7;
        EnumC2465a enumC2465a;
        int i8;
        int i9;
        int i10;
        C0382b c0382b;
        InterfaceC2318h interfaceC2318h;
        ScrollCaptureSession scrollCaptureSession2;
        int i11;
        C3101k c3101k2;
        int i12;
        int m3530q;
        int m3530q2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (abstractC2583c instanceof C0381a) {
            c0381a = (C0381a) abstractC2583c;
            int i13 = c0381a.f1289n;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0381a.f1289n = i13 - Integer.MIN_VALUE;
                Object obj = c0381a.f1287l;
                i7 = c0381a.f1289n;
                enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            i11 = c0381a.f1286k;
                            i12 = c0381a.f1285j;
                            c3101k2 = c0381a.f1284i;
                            scrollCaptureSession2 = AbstractC0275c.m593i(c0381a.f1283h);
                            AbstractC1793a0.m2972L(obj);
                            C0387g c0387g = scrollCaptureCallbackC0384d.f1303f;
                            m3530q = AbstractC2168e.m3530q(i12 - AbstractC3784a.m5794D(c0387g.f1309b), 0, c0387g.f1308a);
                            C0387g c0387g2 = scrollCaptureCallbackC0384d.f1303f;
                            m3530q2 = AbstractC2168e.m3530q(i11 - AbstractC3784a.m5794D(c0387g2.f1309b), 0, c0387g2.f1308a);
                            int i14 = c3101k2.f15698a;
                            int i15 = c3101k2.f15700c;
                            if (m3530q == m3530q2) {
                                surface = scrollCaptureSession2.getSurface();
                                Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                                try {
                                    lockHardwareCanvas.save();
                                    lockHardwareCanvas.translate(-i14, -m3530q);
                                    C3101k c3101k3 = scrollCaptureCallbackC0384d.f1299b;
                                    lockHardwareCanvas.translate(-c3101k3.f15698a, -c3101k3.f15699b);
                                    scrollCaptureCallbackC0384d.f1301d.getRootView().draw(lockHardwareCanvas);
                                    surface3 = scrollCaptureSession2.getSurface();
                                    surface3.unlockCanvasAndPost(lockHardwareCanvas);
                                    int m5794D = AbstractC3784a.m5794D(scrollCaptureCallbackC0384d.f1303f.f1309b);
                                    return new C3101k(i14, m3530q + m5794D, i15, m3530q2 + m5794D);
                                } catch (Throwable th) {
                                    surface2 = scrollCaptureSession2.getSurface();
                                    surface2.unlockCanvasAndPost(lockHardwareCanvas);
                                    throw th;
                                }
                            }
                            return C3101k.f15697e;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i16 = c0381a.f1286k;
                    int i17 = c0381a.f1285j;
                    C3101k c3101k4 = c0381a.f1284i;
                    ScrollCaptureSession m593i = AbstractC0275c.m593i(c0381a.f1283h);
                    AbstractC1793a0.m2972L(obj);
                    i8 = i17;
                    c3101k = c3101k4;
                    i9 = i16;
                    scrollCaptureSession = m593i;
                } else {
                    AbstractC1793a0.m2972L(obj);
                    i8 = c3101k.f15699b;
                    i9 = c3101k.f15701d;
                    C0387g c0387g3 = scrollCaptureCallbackC0384d.f1303f;
                    c0381a.f1283h = scrollCaptureSession;
                    c0381a.f1284i = c3101k;
                    c0381a.f1285j = i8;
                    c0381a.f1286k = i9;
                    c0381a.f1289n = 1;
                    int i18 = c0387g3.f1308a;
                    if (i8 <= i9) {
                        int i19 = i9 - i8;
                        if (i19 <= i18) {
                            float f7 = i8;
                            float f8 = c0387g3.f1309b;
                            Object obj2 = C1694m.f10482a;
                            if (f7 < f8 || i9 > i18 + f8) {
                                if (f7 < f8) {
                                    i10 = i8;
                                } else {
                                    i10 = i9 - i18;
                                }
                                Object m857b = c0387g3.m857b(i10 - f8, c0381a);
                                if (m857b != enumC2465a) {
                                    m857b = obj2;
                                }
                                if (m857b == enumC2465a) {
                                    obj2 = m857b;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(AbstractC0094y0.m182i(i19, i18, "Expected range (", ") to be ≤ viewportSize=").toString());
                        }
                    } else {
                        throw new IllegalArgumentException(AbstractC0094y0.m182i(i8, i9, "Expected min=", " ≤ max=").toString());
                    }
                }
                c0382b = C0382b.f1290g;
                c0381a.f1283h = scrollCaptureSession;
                c0381a.f1284i = c3101k;
                c0381a.f1285j = i8;
                c0381a.f1286k = i9;
                c0381a.f1289n = 2;
                interfaceC2318h = c0381a.f13999f;
                AbstractC3367j.m5097b(interfaceC2318h);
                if (AbstractC2418w.m3976s(interfaceC2318h).mo3790m(c0382b, c0381a) != enumC2465a) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    i11 = i9;
                    c3101k2 = c3101k;
                    i12 = i8;
                    C0387g c0387g4 = scrollCaptureCallbackC0384d.f1303f;
                    m3530q = AbstractC2168e.m3530q(i12 - AbstractC3784a.m5794D(c0387g4.f1309b), 0, c0387g4.f1308a);
                    C0387g c0387g22 = scrollCaptureCallbackC0384d.f1303f;
                    m3530q2 = AbstractC2168e.m3530q(i11 - AbstractC3784a.m5794D(c0387g22.f1309b), 0, c0387g22.f1308a);
                    int i142 = c3101k2.f15698a;
                    int i152 = c3101k2.f15700c;
                    if (m3530q == m3530q2) {
                    }
                }
                return enumC2465a;
            }
        }
        c0381a = new C0381a(scrollCaptureCallbackC0384d, abstractC2583c);
        Object obj3 = c0381a.f1287l;
        i7 = c0381a.f1289n;
        enumC2465a = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        c0382b = C0382b.f1290g;
        c0381a.f1283h = scrollCaptureSession;
        c0381a.f1284i = c3101k;
        c0381a.f1285j = i8;
        c0381a.f1286k = i9;
        c0381a.f1289n = 2;
        interfaceC2318h = c0381a.f13999f;
        AbstractC3367j.m5097b(interfaceC2318h);
        if (AbstractC2418w.m3976s(interfaceC2318h).mo3790m(c0382b, c0381a) != enumC2465a) {
        }
        return enumC2465a;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC0525d0.m1141s(this.f1302e, C0550l1.f1899f, new C0062p0(this, runnable, (InterfaceC2313c) null, 5), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        C0565q1 m1141s = AbstractC0525d0.m1141s(this.f1302e, null, new C0334d(this, scrollCaptureSession, rect, consumer, (InterfaceC2313c) null, 1), 3);
        m1141s.mo1119y(new C0005b(7, cancellationSignal));
        cancellationSignal.setOnCancelListener(new C0345o(1, m1141s));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC0659i0.m1424x(this.f1299b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f1303f.f1309b = 0.0f;
        ((C2361g1) this.f1300c.f109e).setValue(Boolean.TRUE);
        runnable.run();
    }
}
