package p152u;

import java.util.List;
import java.util.Map;
import p032d6.InterfaceC0516a0;
import p060h5.AbstractC1805m;
import p065i2.AbstractC2064e;
import p122q.EnumC2931o0;
import p140s2.InterfaceC3093c;
import p146t1.InterfaceC3220m0;
import p150t5.InterfaceC3279c;
import p160v.C3397a0;
import p160v.C3444x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.m */
/* loaded from: classes.dex */
public final class C3325m implements InterfaceC3220m0 {

    /* renamed from: a */
    public final C3326n f16312a;

    /* renamed from: b */
    public int f16313b;

    /* renamed from: c */
    public boolean f16314c;

    /* renamed from: d */
    public float f16315d;

    /* renamed from: e */
    public final float f16316e;

    /* renamed from: f */
    public final boolean f16317f;

    /* renamed from: g */
    public final InterfaceC0516a0 f16318g;

    /* renamed from: h */
    public final InterfaceC3093c f16319h;

    /* renamed from: i */
    public final long f16320i;

    /* renamed from: j */
    public final Object f16321j;

    /* renamed from: k */
    public final int f16322k;

    /* renamed from: l */
    public final int f16323l;

    /* renamed from: m */
    public final int f16324m;

    /* renamed from: n */
    public final EnumC2931o0 f16325n;

    /* renamed from: o */
    public final int f16326o;

    /* renamed from: p */
    public final int f16327p;

    /* renamed from: q */
    public final /* synthetic */ InterfaceC3220m0 f16328q;

    public C3325m(C3326n c3326n, int i7, boolean z7, float f7, InterfaceC3220m0 interfaceC3220m0, float f8, boolean z8, InterfaceC0516a0 interfaceC0516a0, InterfaceC3093c interfaceC3093c, long j6, List list, int i8, int i9, int i10, EnumC2931o0 enumC2931o0, int i11, int i12) {
        this.f16312a = c3326n;
        this.f16313b = i7;
        this.f16314c = z7;
        this.f16315d = f7;
        this.f16316e = f8;
        this.f16317f = z8;
        this.f16318g = interfaceC0516a0;
        this.f16319h = interfaceC3093c;
        this.f16320i = j6;
        this.f16321j = list;
        this.f16322k = i8;
        this.f16323l = i9;
        this.f16324m = i10;
        this.f16325n = enumC2931o0;
        this.f16326o = i11;
        this.f16327p = i12;
        this.f16328q = interfaceC3220m0;
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: a */
    public final Map mo4882a() {
        return this.f16328q.mo4882a();
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: b */
    public final void mo4883b() {
        this.f16328q.mo4883b();
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: c */
    public final int mo4884c() {
        return this.f16328q.mo4884c();
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: d */
    public final InterfaceC3279c mo4885d() {
        return this.f16328q.mo4885d();
    }

    @Override // p146t1.InterfaceC3220m0
    /* renamed from: e */
    public final int mo4886e() {
        return this.f16328q.mo4886e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* renamed from: f */
    public final boolean m5061f(int i7, boolean z7) {
        C3326n c3326n;
        C3444x c3444x;
        if (!this.f16317f) {
            ?? r02 = this.f16321j;
            if (!r02.isEmpty() && (c3326n = this.f16312a) != null) {
                int i8 = c3326n.f16343o;
                int i9 = this.f16313b - i7;
                if (i9 >= 0 && i9 < i8) {
                    C3326n c3326n2 = (C3326n) AbstractC1805m.m3045i0(r02);
                    C3326n c3326n3 = (C3326n) AbstractC1805m.m3052p0(r02);
                    if (!c3326n2.f16345q && !c3326n3.f16345q) {
                        int i10 = this.f16323l;
                        int i11 = this.f16322k;
                        if (i7 >= 0 ? Math.min(i11 - c3326n2.f16341m, i10 - c3326n3.f16341m) > i7 : Math.min((c3326n2.f16341m + c3326n2.f16343o) - i11, (c3326n3.f16341m + c3326n3.f16343o) - i10) > (-i7)) {
                            this.f16313b -= i7;
                            int size = r02.size();
                            for (int i12 = 0; i12 < size; i12++) {
                                C3326n c3326n4 = (C3326n) r02.get(i12);
                                int[] iArr = c3326n4.f16349u;
                                if (!c3326n4.f16345q) {
                                    c3326n4.f16341m += i7;
                                    int length = iArr.length;
                                    for (int i13 = 0; i13 < length; i13++) {
                                        if (i13 % 2 == 1) {
                                            iArr[i13] = iArr[i13] + i7;
                                        }
                                    }
                                    if (z7) {
                                        int size2 = c3326n4.f16330b.size();
                                        for (int i14 = 0; i14 < size2; i14++) {
                                            C3397a0 c3397a0 = (C3397a0) c3326n4.f16339k.f676a.m3592g(c3326n4.f16337i);
                                            if (c3397a0 != null) {
                                                c3444x = c3397a0.f16497a[i14];
                                            } else {
                                                c3444x = null;
                                            }
                                            if (c3444x != null) {
                                                long j6 = c3444x.f16649l;
                                                c3444x.f16649l = AbstractC2064e.m3234d((int) (j6 >> 32), ((int) (j6 & 4294967295L)) + i7);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f16315d = i7;
                            if (!this.f16314c && i7 > 0) {
                                this.f16314c = true;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
