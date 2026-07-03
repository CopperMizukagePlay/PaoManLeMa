package p085l0;

import java.util.ArrayList;
import p053g5.C1691j;
import p077k.C2221w;
import p102n1.AbstractC2710c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.l1 */
/* loaded from: classes.dex */
public final class C2381l1 {

    /* renamed from: a */
    public final ArrayList f13438a;

    /* renamed from: b */
    public final int f13439b;

    /* renamed from: c */
    public int f13440c;

    /* renamed from: d */
    public final ArrayList f13441d;

    /* renamed from: e */
    public final C2221w f13442e;

    /* renamed from: f */
    public final C1691j f13443f;

    public C2381l1(int i7, ArrayList arrayList) {
        this.f13438a = arrayList;
        this.f13439b = i7;
        if (i7 < 0) {
            AbstractC2389n1.m3828a("Invalid start index");
        }
        this.f13441d = new ArrayList();
        C2221w c2221w = new C2221w();
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C2404r0 c2404r0 = (C2404r0) this.f13438a.get(i9);
            int i10 = c2404r0.f13537c;
            int i11 = c2404r0.f13538d;
            c2221w.m3652g(i10, new C2376k0(i9, i8, i11));
            i8 += i11;
        }
        this.f13442e = c2221w;
        this.f13443f = AbstractC2710c.m4327J(new C2377k1(this));
    }

    /* renamed from: a */
    public final boolean m3799a(int i7, int i8) {
        int i9;
        C2221w c2221w = this.f13442e;
        C2376k0 c2376k0 = (C2376k0) c2221w.m3612b(i7);
        if (c2376k0 == null) {
            return false;
        }
        int i10 = c2376k0.f13423b;
        int i11 = i8 - c2376k0.f13424c;
        c2376k0.f13424c = i8;
        if (i11 != 0) {
            Object[] objArr = c2221w.f12707c;
            long[] jArr = c2221w.f12705a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j6 = jArr[i12];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((255 & j6) < 128) {
                                C2376k0 c2376k02 = (C2376k0) objArr[(i12 << 3) + i14];
                                if (c2376k02.f13423b >= i10 && !c2376k02.equals(c2376k0) && (i9 = c2376k02.f13423b + i11) >= 0) {
                                    c2376k02.f13423b = i9;
                                }
                            }
                            j6 >>= 8;
                        }
                        if (i13 != 8) {
                            return true;
                        }
                    }
                    if (i12 != length) {
                        i12++;
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
