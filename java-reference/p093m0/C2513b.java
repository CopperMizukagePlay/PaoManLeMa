package p093m0;

import java.util.ArrayList;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2399q;
import p085l0.C2388n0;
import p085l0.C2395p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.b */
/* loaded from: classes.dex */
public final class C2513b {

    /* renamed from: a */
    public final C2395p f13861a;

    /* renamed from: b */
    public C2511a f13862b;

    /* renamed from: c */
    public boolean f13863c;

    /* renamed from: f */
    public int f13866f;

    /* renamed from: g */
    public int f13867g;

    /* renamed from: l */
    public int f13872l;

    /* renamed from: d */
    public final C2388n0 f13864d = new C2388n0();

    /* renamed from: e */
    public boolean f13865e = true;

    /* renamed from: h */
    public final ArrayList f13868h = new ArrayList();

    /* renamed from: i */
    public int f13869i = -1;

    /* renamed from: j */
    public int f13870j = -1;

    /* renamed from: k */
    public int f13871k = -1;

    public C2513b(C2395p c2395p, C2511a c2511a) {
        this.f13861a = c2395p;
        this.f13862b = c2511a;
    }

    /* renamed from: a */
    public final void m4068a() {
        m4070c();
        ArrayList arrayList = this.f13868h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.f13867g++;
        }
    }

    /* renamed from: b */
    public final void m4069b() {
        int i7 = this.f13867g;
        if (i7 > 0) {
            C2530j0 c2530j0 = this.f13862b.f13859a;
            c2530j0.m4077T(C2524g0.f13884d);
            c2530j0.f13891c[c2530j0.f13892d - c2530j0.f13889a[c2530j0.f13890b - 1].f1360b] = i7;
            this.f13867g = 0;
        }
        ArrayList arrayList = this.f13868h;
        if (!arrayList.isEmpty()) {
            C2511a c2511a = this.f13862b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i8 = 0; i8 < size; i8++) {
                objArr[i8] = arrayList.get(i8);
            }
            c2511a.getClass();
            if (size != 0) {
                C2530j0 c2530j02 = c2511a.f13859a;
                c2530j02.m4077T(C2531k.f13895d);
                AbstractC2072e.m3344v(c2530j02, 0, objArr);
            }
            arrayList.clear();
        }
    }

    /* renamed from: c */
    public final void m4070c() {
        int i7 = this.f13872l;
        if (i7 > 0) {
            int i8 = this.f13869i;
            if (i8 >= 0) {
                m4069b();
                C2530j0 c2530j0 = this.f13862b.f13859a;
                c2530j0.m4077T(C2545y.f13913d);
                int i9 = c2530j0.f13892d - c2530j0.f13889a[c2530j0.f13890b - 1].f1360b;
                int[] iArr = c2530j0.f13891c;
                iArr[i9] = i8;
                iArr[i9 + 1] = i7;
                this.f13869i = -1;
            } else {
                int i10 = this.f13871k;
                int i11 = this.f13870j;
                m4069b();
                C2530j0 c2530j02 = this.f13862b.f13859a;
                c2530j02.m4077T(C2542v.f13910d);
                int i12 = c2530j02.f13892d - c2530j02.f13889a[c2530j02.f13890b - 1].f1360b;
                int[] iArr2 = c2530j02.f13891c;
                iArr2[i12 + 1] = i10;
                iArr2[i12] = i11;
                iArr2[i12 + 2] = i7;
                this.f13870j = -1;
                this.f13871k = -1;
            }
            this.f13872l = 0;
        }
    }

    /* renamed from: d */
    public final void m4071d(boolean z7) {
        int i7;
        C2395p c2395p = this.f13861a;
        if (z7) {
            i7 = c2395p.f13473G.f13645i;
        } else {
            i7 = c2395p.f13473G.f13643g;
        }
        int i8 = i7 - this.f13866f;
        if (i8 < 0) {
            AbstractC2399q.m3900c("Tried to seek backward");
        }
        if (i8 > 0) {
            C2530j0 c2530j0 = this.f13862b.f13859a;
            c2530j0.m4077T(C2517d.f13877d);
            c2530j0.f13891c[c2530j0.f13892d - c2530j0.f13889a[c2530j0.f13890b - 1].f1360b] = i8;
            this.f13866f = i7;
        }
    }

    /* renamed from: e */
    public final void m4072e(int i7, int i8) {
        boolean z7;
        if (i8 > 0) {
            if (i7 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!z7) {
                AbstractC2399q.m3900c("Invalid remove index " + i7);
            }
            if (this.f13869i == i7) {
                this.f13872l += i8;
                return;
            }
            m4070c();
            this.f13869i = i7;
            this.f13872l = i8;
        }
    }
}
