package p037e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p001a0.C0076s2;
import p077k.AbstractC2203m;
import p077k.C2221w;
import p100n.AbstractC2699z;
import p100n.C2651i0;
import p123q0.C2976k;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.e */
/* loaded from: classes.dex */
public final class C0691e {

    /* renamed from: a */
    public int f2244a;

    /* renamed from: b */
    public Object f2245b;

    public C0691e(C2976k c2976k, int i7) {
        this.f2245b = c2976k;
        this.f2244a = i7;
    }

    /* renamed from: a */
    public void m1476a(long j6) {
        if (!m1478c(j6)) {
            int i7 = this.f2244a;
            long[] jArr = (long[]) this.f2245b;
            if (i7 >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i7 + 1, jArr.length * 2));
                AbstractC3367j.m5099d(jArr, "copyOf(...)");
                this.f2245b = jArr;
            }
            jArr[i7] = j6;
            if (i7 >= this.f2244a) {
                this.f2244a = i7 + 1;
            }
        }
    }

    /* renamed from: b */
    public C2651i0 m1477b(Float f7, int i7) {
        C2651i0 c2651i0 = new C2651i0(f7, AbstractC2699z.f14500d);
        ((C2221w) this.f2245b).m3652g(i7, c2651i0);
        return c2651i0;
    }

    /* renamed from: c */
    public boolean m1478c(long j6) {
        int i7 = this.f2244a;
        for (int i8 = 0; i8 < i7; i8++) {
            if (((long[]) this.f2245b)[i8] == j6) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m1479d() {
        if (this.f2244a < ((ArrayList) this.f2245b).size()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m1480e(long j6) {
        int i7 = this.f2244a;
        int i8 = 0;
        while (i8 < i7) {
            if (j6 == ((long[]) this.f2245b)[i8]) {
                int i9 = this.f2244a - 1;
                while (i8 < i9) {
                    long[] jArr = (long[]) this.f2245b;
                    int i10 = i8 + 1;
                    jArr[i8] = jArr[i10];
                    i8 = i10;
                }
                this.f2244a--;
                return;
            }
            i8++;
        }
    }

    public C0691e(int i7, C0076s2 c0076s2) {
        this.f2244a = i7;
        this.f2245b = new C0076s2[]{c0076s2};
    }

    public C0691e(int i7, C0076s2... c0076s2Arr) {
        this.f2244a = i7;
        this.f2245b = c0076s2Arr;
    }

    public C0691e(int i7) {
        switch (i7) {
            case 2:
                this.f2244a = 300;
                C2221w c2221w = AbstractC2203m.f12711a;
                this.f2245b = new C2221w();
                return;
            default:
                this.f2244a = 1;
                this.f2245b = Collections.singletonList(null);
                return;
        }
    }

    public C0691e(int i7, ArrayList arrayList) {
        switch (i7) {
            case AbstractC3122c.f15761f /* 5 */:
                this.f2245b = arrayList;
                return;
            default:
                this.f2244a = 0;
                this.f2245b = arrayList;
                return;
        }
    }
}
