package p039e5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p117p1.C2868s;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p152u.C3326n;
import p152u.C3330r;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.nh */
/* loaded from: classes.dex */
public final class C1120nh implements InterfaceC3281e {

    /* renamed from: e */
    public final /* synthetic */ C3330r f6252e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC3282f f6253f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC0516a0 f6254g;

    /* renamed from: h */
    public final /* synthetic */ C2349d1 f6255h;

    /* renamed from: i */
    public final /* synthetic */ C2345c1 f6256i;

    /* renamed from: j */
    public final /* synthetic */ C2345c1 f6257j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC2425y0 f6258k;

    /* renamed from: l */
    public final /* synthetic */ C2349d1 f6259l;

    /* renamed from: m */
    public final /* synthetic */ float f6260m;

    public C1120nh(C3330r c3330r, InterfaceC3282f interfaceC3282f, InterfaceC0516a0 interfaceC0516a0, C2349d1 c2349d1, C2345c1 c2345c1, C2345c1 c2345c12, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d12, float f7) {
        this.f6252e = c3330r;
        this.f6253f = interfaceC3282f;
        this.f6254g = interfaceC0516a0;
        this.f6255h = c2349d1;
        this.f6256i = c2345c1;
        this.f6257j = c2345c12;
        this.f6258k = interfaceC2425y0;
        this.f6259l = c2349d12;
        this.f6260m = f7;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.lang.Iterable] */
    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        Object obj3;
        int i7;
        float f7;
        Object obj4;
        Object obj5;
        int i8;
        C2868s c2868s = (C2868s) obj;
        long j6 = ((C0464b) obj2).f1623a;
        AbstractC3367j.m5100e(c2868s, "change");
        c2868s.m4550a();
        float f8 = AbstractC1092mk.f5952h;
        C2349d1 c2349d1 = this.f6255h;
        int m3741g = c2349d1.m3741g();
        if (m3741g != 0) {
            C2345c1 c2345c1 = this.f6256i;
            c2345c1.m3730h(Float.intBitsToFloat((int) (j6 & 4294967295L)) + c2345c1.m3729g());
            C3330r c3330r = this.f6252e;
            Iterator it = c3330r.m5067g().f16321j.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (((C3326n) obj3).f16337i.equals(Integer.valueOf(m3741g))) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            C3326n c3326n = (C3326n) obj3;
            if (c3326n != null) {
                C2345c1 c2345c12 = this.f6257j;
                float m3729g = c2345c1.m3729g() + c2345c12.m3729g();
                float f9 = 2.0f;
                float f10 = (c3326n.f16342n / 2.0f) + m3729g;
                List list = (List) this.f6258k.getValue();
                Iterator it2 = list.iterator();
                int i9 = 0;
                while (true) {
                    i7 = -1;
                    if (it2.hasNext()) {
                        f7 = f9;
                        if (((C1189po) it2.next()).f6926a == c2349d1.m3741g()) {
                            break;
                        }
                        i9++;
                        f9 = f7;
                    } else {
                        f7 = f9;
                        i9 = -1;
                        break;
                    }
                }
                if (i9 >= 0 && i9 < list.size()) {
                    ?? r8 = c3330r.m5067g().f16321j;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : r8) {
                        if (!((C3326n) obj6).f16337i.equals(Integer.valueOf(c2349d1.m3741g()))) {
                            arrayList.add(obj6);
                        }
                    }
                    List m3061y0 = AbstractC1805m.m3061y0(arrayList, new C0918h0(5));
                    Iterator it3 = m3061y0.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj5 = it3.next();
                            C3326n c3326n2 = (C3326n) obj5;
                            if (f10 < (c3326n2.f16342n / f7) + c3326n2.f16341m) {
                                break;
                            }
                        } else {
                            obj5 = null;
                            break;
                        }
                    }
                    C3326n c3326n3 = (C3326n) obj5;
                    if (c3326n3 != null) {
                        i8 = c3326n3.f16329a;
                    } else {
                        C3326n c3326n4 = (C3326n) AbstractC1805m.m3053q0(m3061y0);
                        if (c3326n4 != null) {
                            i8 = c3326n4.f16329a + 1;
                        } else {
                            i8 = i9;
                        }
                    }
                    if (i8 > i9) {
                        i8--;
                    }
                    int size = list.size() - 1;
                    if (size < 0) {
                        size = 0;
                    }
                    i7 = AbstractC2168e.m3530q(i8, 0, size);
                }
                int i10 = i7;
                if (i10 >= 0) {
                    C2349d1 c2349d12 = this.f6259l;
                    if (i10 != c2349d12.m3741g()) {
                        this.f6253f.mo24c(Integer.valueOf(m3741g), Integer.valueOf(i10), Boolean.FALSE);
                        c2349d12.m3742h(i10);
                        Iterator it4 = c3330r.m5067g().f16321j.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj4 = it4.next();
                                if (((C3326n) obj4).f16337i.equals(Integer.valueOf(m3741g))) {
                                    break;
                                }
                            } else {
                                obj4 = null;
                                break;
                            }
                        }
                        if (((C3326n) obj4) != null) {
                            c2345c12.m3730h(r2.f16341m);
                            c2345c1.m3730h(m3729g - c2345c12.m3729g());
                        }
                    }
                }
                AbstractC0525d0.m1141s(this.f6254g, null, new C1089mh(this.f6252e, c3326n, m3729g, this.f6260m, null), 3);
            }
        }
        return C1694m.f10482a;
    }
}
