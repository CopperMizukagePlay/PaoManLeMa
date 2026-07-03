package p079k1;

import p006a7.C0129l;
import p035e1.C0677s;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p140s2.C3096f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.e */
/* loaded from: classes.dex */
public final class C2266e {

    /* renamed from: k */
    public static int f13129k;

    /* renamed from: l */
    public static final C0129l f13130l = new C0129l(14);

    /* renamed from: a */
    public final String f13131a;

    /* renamed from: b */
    public final float f13132b;

    /* renamed from: c */
    public final float f13133c;

    /* renamed from: d */
    public final float f13134d;

    /* renamed from: e */
    public final float f13135e;

    /* renamed from: f */
    public final C2261b0 f13136f;

    /* renamed from: g */
    public final long f13137g;

    /* renamed from: h */
    public final int f13138h;

    /* renamed from: i */
    public final boolean f13139i;

    /* renamed from: j */
    public final int f13140j;

    public C2266e(String str, float f7, float f8, float f9, float f10, C2261b0 c2261b0, long j6, int i7, boolean z7) {
        int i8;
        synchronized (f13130l) {
            i8 = f13129k;
            f13129k = i8 + 1;
        }
        this.f13131a = str;
        this.f13132b = f7;
        this.f13133c = f8;
        this.f13134d = f9;
        this.f13135e = f10;
        this.f13136f = c2261b0;
        this.f13137g = j6;
        this.f13138h = i7;
        this.f13139i = z7;
        this.f13140j = i8;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2266e) {
                C2266e c2266e = (C2266e) obj;
                if (AbstractC3367j.m5096a(this.f13131a, c2266e.f13131a) && C3096f.m4776a(this.f13132b, c2266e.f13132b) && C3096f.m4776a(this.f13133c, c2266e.f13133c) && this.f13134d == c2266e.f13134d && this.f13135e == c2266e.f13135e && this.f13136f.equals(c2266e.f13136f) && C0677s.m1454c(this.f13137g, c2266e.f13137g) && this.f13138h == c2266e.f13138h && this.f13139i == c2266e.f13139i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f13136f.hashCode() + AbstractC2487d.m4038b(this.f13135e, AbstractC2487d.m4038b(this.f13134d, AbstractC2487d.m4038b(this.f13133c, AbstractC2487d.m4038b(this.f13132b, this.f13131a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i7 = C0677s.f2210h;
        return Boolean.hashCode(this.f13139i) + AbstractC2647h.m4255a(this.f13138h, AbstractC2487d.m4039c(hashCode, 31, this.f13137g), 31);
    }
}
