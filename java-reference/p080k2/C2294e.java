package p080k2;

import android.graphics.Typeface;
import androidx.lifecycle.C0212s0;
import p001a0.C0019e1;
import p001a0.C0068q2;
import p006a7.C0129l;
import p015b6.C0310q;
import p032d6.AbstractC0525d0;
import p032d6.C0526d1;
import p040e6.C1507c;
import p068i5.AbstractC2080d;
import p073j2.AbstractC2168e;
import p077k.C2213r;
import p082k5.C2319i;
import p110o2.AbstractC2812i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.e */
/* loaded from: classes.dex */
public final class C2294e implements InterfaceC2293d {

    /* renamed from: a */
    public final C0129l f13222a;

    /* renamed from: b */
    public final C2290a f13223b;

    /* renamed from: c */
    public final C0068q2 f13224c;

    /* renamed from: d */
    public final C2297h f13225d;

    /* renamed from: e */
    public final C0019e1 f13226e;

    /* JADX WARN: Type inference failed for: r1v0, types: [k2.h, java.lang.Object] */
    public C2294e(C0129l c0129l, C2290a c2290a) {
        C0068q2 c0068q2 = AbstractC2295f.f13227a;
        C0068q2 c0068q22 = AbstractC2295f.f13227a;
        ?? obj = new Object();
        C2296g c2296g = C2297h.f13228a;
        C1507c c1507c = AbstractC2812i.f14858a;
        c2296g.getClass();
        AbstractC0525d0.m1123a(AbstractC2080d.m3374B(c2296g, c1507c).mo855z(C2319i.f13273e).mo855z(new C0526d1(null)));
        C0019e1 c0019e1 = new C0019e1(21, false);
        this.f13222a = c0129l;
        this.f13223b = c2290a;
        this.f13224c = c0068q2;
        this.f13225d = obj;
        this.f13226e = c0019e1;
        new C0310q(14, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e A[Catch: Exception -> 0x00a6, TRY_ENTER, TryCatch #2 {Exception -> 0x00a6, blocks: (B:25:0x0040, B:27:0x0053, B:30:0x0058, B:32:0x005c, B:33:0x0075, B:49:0x009e, B:50:0x00a5, B:53:0x0065, B:54:0x0067, B:55:0x006a, B:56:0x0070), top: B:24:0x0040 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2307r m3677a(C2306q c2306q) {
        Typeface m275c;
        C2307r c2307r;
        Object remove;
        C0068q2 c0068q2 = this.f13224c;
        synchronized (((C0129l) c0068q2.f344f)) {
            try {
                C2307r c2307r2 = (C2307r) ((C2213r) c0068q2.f345g).m3623a(c2306q);
                if (c2307r2 != null) {
                    if (c2307r2.f13251f) {
                        return c2307r2;
                    }
                    C2213r c2213r = (C2213r) c0068q2.f345g;
                    synchronized (c2213r.f12729c) {
                        C0212s0 c0212s0 = c2213r.f12728b;
                        c0212s0.getClass();
                        remove = c0212s0.f876a.remove(c2306q);
                        if (remove != null) {
                            c2213r.f12730d--;
                        }
                    }
                }
                try {
                    this.f13225d.getClass();
                    AbstractC2305p abstractC2305p = c2306q.f13245a;
                    C0129l c0129l = (C0129l) this.f13226e.f109e;
                    int i7 = c2306q.f13247c;
                    C2300k c2300k = c2306q.f13246b;
                    if (abstractC2305p != null && !(abstractC2305p instanceof C2291b)) {
                        if (abstractC2305p instanceof C2302m) {
                            m275c = c0129l.m281e((C2302m) abstractC2305p, c2300k, i7);
                            c2307r = new C2307r(m275c);
                            if (c2307r != null) {
                                synchronized (((C0129l) c0068q2.f344f)) {
                                    if (((C2213r) c0068q2.f345g).m3623a(c2306q) == null && c2307r.f13251f) {
                                        ((C2213r) c0068q2.f345g).m3624b(c2306q, c2307r);
                                    }
                                }
                                return c2307r;
                            }
                            throw new IllegalStateException("Could not load font");
                        }
                        c2307r = null;
                        if (c2307r != null) {
                        }
                    }
                    switch (c0129l.f527a) {
                        case 18:
                            m275c = C0129l.m275c(null, c2300k, i7);
                            break;
                        default:
                            m275c = C0129l.m276d(null, c2300k, i7);
                            break;
                    }
                    c2307r = new C2307r(m275c);
                    if (c2307r != null) {
                    }
                } catch (Exception e7) {
                    throw new IllegalStateException("Could not load font", e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final C2307r m3678b(AbstractC2305p abstractC2305p, C2300k c2300k, int i7, int i8) {
        C2300k c2300k2;
        C2290a c2290a = this.f13223b;
        c2290a.getClass();
        int i9 = c2290a.f13221a;
        if (i9 != 0 && i9 != Integer.MAX_VALUE) {
            c2300k2 = new C2300k(AbstractC2168e.m3530q(c2300k.f13237e + i9, 1, 1000));
        } else {
            c2300k2 = c2300k;
        }
        this.f13222a.getClass();
        return m3677a(new C2306q(abstractC2305p, c2300k2, i7, i8, null));
    }
}
