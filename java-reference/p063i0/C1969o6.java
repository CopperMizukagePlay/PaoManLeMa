package p063i0;

import java.util.ArrayList;
import java.util.List;
import p032d6.AbstractC0525d0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p073j2.AbstractC2168e;
import p107o.C2769p1;
import p140s2.AbstractC3092b;
import p140s2.AbstractC3099i;
import p140s2.C3091a;
import p140s2.C3096f;
import p145t0.C3173d;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3203g1;
import p146t1.InterfaceC3214k0;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.o6 */
/* loaded from: classes.dex */
public final class C1969o6 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f11620f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f11621g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC3203g1 f11622h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3281e f11623i;

    /* renamed from: j */
    public final /* synthetic */ C1857b5 f11624j;

    /* renamed from: k */
    public final /* synthetic */ int f11625k;

    /* renamed from: l */
    public final /* synthetic */ ArrayList f11626l;

    /* renamed from: m */
    public final /* synthetic */ long f11627m;

    /* renamed from: n */
    public final /* synthetic */ int f11628n;

    /* renamed from: o */
    public final /* synthetic */ int f11629o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC3282f f11630p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1969o6(int i7, ArrayList arrayList, InterfaceC3203g1 interfaceC3203g1, InterfaceC3281e interfaceC3281e, C1857b5 c1857b5, int i8, ArrayList arrayList2, long j6, int i9, int i10, InterfaceC3282f interfaceC3282f) {
        super(1);
        this.f11620f = i7;
        this.f11621g = arrayList;
        this.f11622h = interfaceC3203g1;
        this.f11623i = interfaceC3281e;
        this.f11624j = c1857b5;
        this.f11625k = i8;
        this.f11626l = arrayList2;
        this.f11627m = j6;
        this.f11628n = i9;
        this.f11629o = i10;
        this.f11630p = interfaceC3282f;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC3203g1 interfaceC3203g1;
        int i7;
        boolean z7;
        boolean z8;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f11621g;
        int size = arrayList2.size();
        int i8 = this.f11620f;
        int i9 = i8;
        int i10 = 0;
        while (true) {
            interfaceC3203g1 = this.f11622h;
            if (i10 >= size) {
                break;
            }
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) arrayList2.get(i10);
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, i9, 0);
            arrayList.add(new C1921i6(interfaceC3203g1.mo4522t0(i9), interfaceC3203g1.mo4522t0(abstractC3239v0.f16053e), ((C3096f) this.f11626l.get(i10)).f15693e));
            i9 += abstractC3239v0.f16053e;
            i10++;
        }
        List mo4888g0 = interfaceC3203g1.mo4888g0(EnumC2025v6.f11986f, this.f11623i);
        int size2 = mo4888g0.size();
        int i11 = 0;
        while (true) {
            i7 = this.f11629o;
            if (i11 >= size2) {
                break;
            }
            InterfaceC3214k0 interfaceC3214k0 = (InterfaceC3214k0) mo4888g0.get(i11);
            long j6 = this.f11627m;
            int i12 = this.f11628n;
            AbstractC3239v0 mo4918e = interfaceC3214k0.mo4918e(C3091a.m4753a(j6, i12, i12, 0, 0, 8));
            AbstractC3237u0.m4951j(abstractC3237u0, mo4918e, 0, i7 - mo4918e.f16054f);
            i11++;
        }
        List mo4888g02 = interfaceC3203g1.mo4888g0(EnumC2025v6.f11987g, new C3173d(1734082948, new C1961n6(this.f11630p, arrayList, 0), true));
        int size3 = mo4888g02.size();
        for (int i13 = 0; i13 < size3; i13++) {
            InterfaceC3214k0 interfaceC3214k02 = (InterfaceC3214k0) mo4888g02.get(i13);
            int i14 = this.f11628n;
            if (i14 >= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i7 >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!(z7 & z8)) {
                AbstractC3099i.m4781a("width and height must be >= 0");
            }
            AbstractC3237u0.m4951j(abstractC3237u0, interfaceC3214k02.mo4918e(AbstractC3092b.m4771h(i14, i14, i7, i7)), 0, 0);
        }
        C1857b5 c1857b5 = this.f11624j;
        C2769p1 c2769p1 = c1857b5.f10971a;
        Integer num = c1857b5.f10973c;
        int i15 = this.f11625k;
        if (num == null || num.intValue() != i15) {
            c1857b5.f10973c = Integer.valueOf(i15);
            C1921i6 c1921i6 = (C1921i6) AbstractC1805m.m3048l0(i15, arrayList);
            if (c1921i6 != null) {
                C1921i6 c1921i62 = (C1921i6) AbstractC1805m.m3052p0(arrayList);
                int mo4513Q = interfaceC3203g1.mo4513Q(c1921i62.f11349a + c1921i62.f11350b) + i8;
                int m3741g = mo4513Q - c2769p1.f14748d.m3741g();
                int mo4513Q2 = interfaceC3203g1.mo4513Q(c1921i6.f11349a) - ((m3741g / 2) - (interfaceC3203g1.mo4513Q(c1921i6.f11350b) / 2));
                int i16 = mo4513Q - m3741g;
                if (i16 < 0) {
                    i16 = 0;
                }
                int m3530q = AbstractC2168e.m3530q(mo4513Q2, 0, i16);
                if (c2769p1.f14745a.m3741g() != m3530q) {
                    AbstractC0525d0.m1141s(c1857b5.f10972b, null, new C1848a5(c1857b5, m3530q, null, 0), 3);
                }
            }
        }
        return C1694m.f10482a;
    }
}
