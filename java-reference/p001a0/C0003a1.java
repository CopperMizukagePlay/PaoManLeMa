package p001a0;

import java.util.ArrayList;
import java.util.List;
import p050g2.C1598l0;
import p053g5.C1694m;
import p060h5.AbstractC1806n;
import p063i0.AbstractC1930k;
import p087l2.C2439d0;
import p122q.EnumC2931o0;
import p140s2.EnumC3103m;
import p144t.AbstractC3136j;
import p144t.C3120b;
import p144t.C3143m0;
import p144t.C3147o0;
import p144t.C3158u;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p146t1.InterfaceC3242x;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.a1 */
/* loaded from: classes.dex */
public final class C0003a1 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f39f;

    /* renamed from: g */
    public final /* synthetic */ Object f40g;

    /* renamed from: h */
    public final /* synthetic */ Object f41h;

    /* renamed from: i */
    public final /* synthetic */ int f42i;

    /* renamed from: j */
    public final /* synthetic */ Object f43j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003a1(ArrayList arrayList, InterfaceC3223n0 interfaceC3223n0, int i7, ArrayList arrayList2) {
        super(1);
        this.f39f = 2;
        float f7 = AbstractC1930k.f11406a;
        this.f43j = arrayList;
        this.f40g = interfaceC3223n0;
        this.f42i = i7;
        this.f41h = arrayList2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        C1598l0 c1598l0;
        boolean z7;
        C1598l0 c1598l02;
        int i7;
        C3143m0 c3143m0;
        int m5826a;
        switch (this.f39f) {
            case 0:
                AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
                AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) this.f41h;
                InterfaceC3223n0 interfaceC3223n0 = (InterfaceC3223n0) this.f40g;
                C0007b1 c0007b1 = (C0007b1) this.f43j;
                int i8 = c0007b1.f58b;
                C0048l2 c0048l2 = c0007b1.f57a;
                C2439d0 c2439d0 = c0007b1.f59c;
                C0064p2 c0064p2 = (C0064p2) c0007b1.f60d.mo52a();
                if (c0064p2 != null) {
                    c1598l0 = c0064p2.f322a;
                } else {
                    c1598l0 = null;
                }
                C1598l0 c1598l03 = c1598l0;
                if (interfaceC3223n0.getLayoutDirection() == EnumC3103m.f15704f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c0048l2.m124a(EnumC2931o0.f15241f, AbstractC0027g1.m62h(interfaceC3223n0, i8, c2439d0, c1598l03, z7, abstractC3239v0.f16053e), this.f42i, abstractC3239v0.f16053e);
                AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, Math.round(-c0048l2.f246a.m3729g()), 0);
                return C1694m.f10482a;
            case 1:
                AbstractC3237u0 abstractC3237u02 = (AbstractC3237u0) obj;
                AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) this.f41h;
                InterfaceC3223n0 interfaceC3223n02 = (InterfaceC3223n0) this.f40g;
                C0080t2 c0080t2 = (C0080t2) this.f43j;
                int i9 = c0080t2.f388b;
                C0048l2 c0048l22 = c0080t2.f387a;
                C2439d0 c2439d02 = c0080t2.f389c;
                C0064p2 c0064p22 = (C0064p2) c0080t2.f390d.mo52a();
                if (c0064p22 != null) {
                    c1598l02 = c0064p22.f322a;
                } else {
                    c1598l02 = null;
                }
                c0048l22.m124a(EnumC2931o0.f15240e, AbstractC0027g1.m62h(interfaceC3223n02, i9, c2439d02, c1598l02, false, abstractC3239v02.f16053e), this.f42i, abstractC3239v02.f16054f);
                AbstractC3237u0.m4951j(abstractC3237u02, abstractC3239v02, 0, Math.round(-c0048l22.f246a.m3729g()));
                return C1694m.f10482a;
            case 2:
                AbstractC3237u0 abstractC3237u03 = (AbstractC3237u0) obj;
                ArrayList arrayList = (ArrayList) this.f43j;
                InterfaceC3223n0 interfaceC3223n03 = (InterfaceC3223n0) this.f40g;
                float f7 = AbstractC1930k.f11408c;
                ArrayList arrayList2 = (ArrayList) this.f41h;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    List list = (List) arrayList.get(i10);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    for (int i11 = 0; i11 < size2; i11++) {
                        int i12 = ((AbstractC3239v0) list.get(i11)).f16053e;
                        if (i11 < AbstractC1806n.m3066N(list)) {
                            i7 = interfaceC3223n03.mo4513Q(f7);
                        } else {
                            i7 = 0;
                        }
                        iArr[i11] = i12 + i7;
                    }
                    C3120b c3120b = AbstractC3136j.f15790b;
                    int[] iArr2 = new int[size2];
                    for (int i13 = 0; i13 < size2; i13++) {
                        iArr2[i13] = 0;
                    }
                    c3120b.mo4823c(interfaceC3223n03, this.f42i, iArr, interfaceC3223n03.getLayoutDirection(), iArr2);
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        AbstractC3237u0.m4949g(abstractC3237u03, (AbstractC3239v0) list.get(i14), iArr2[i14], ((Number) arrayList2.get(i10)).intValue());
                    }
                }
                return C1694m.f10482a;
            default:
                AbstractC3237u0 abstractC3237u04 = (AbstractC3237u0) obj;
                AbstractC3239v0[] abstractC3239v0Arr = (AbstractC3239v0[]) this.f40g;
                C3147o0 c3147o0 = (C3147o0) this.f43j;
                int[] iArr3 = (int[]) this.f41h;
                int length = abstractC3239v0Arr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length) {
                    AbstractC3239v0 abstractC3239v03 = abstractC3239v0Arr[i15];
                    int i17 = i16 + 1;
                    AbstractC3367j.m5097b(abstractC3239v03);
                    Object mo4921n = abstractC3239v03.mo4921n();
                    C3158u c3158u = null;
                    if (mo4921n instanceof C3143m0) {
                        c3143m0 = (C3143m0) mo4921n;
                    } else {
                        c3143m0 = null;
                    }
                    if (c3143m0 != null) {
                        c3158u = c3143m0.f15810c;
                    }
                    int i18 = this.f42i;
                    if (c3158u != null) {
                        m5826a = c3158u.m4862a(i18 - abstractC3239v03.f16054f, EnumC3103m.f15703e);
                    } else {
                        m5826a = c3147o0.f15822b.m5826a(0, i18 - abstractC3239v03.f16054f);
                    }
                    AbstractC3237u0.m4949g(abstractC3237u04, abstractC3239v03, iArr3[i16], m5826a);
                    i15++;
                    i16 = i17;
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0003a1(InterfaceC3223n0 interfaceC3223n0, InterfaceC3242x interfaceC3242x, AbstractC3239v0 abstractC3239v0, int i7, int i8) {
        super(1);
        this.f39f = i8;
        this.f40g = interfaceC3223n0;
        this.f43j = interfaceC3242x;
        this.f41h = abstractC3239v0;
        this.f42i = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003a1(AbstractC3239v0[] abstractC3239v0Arr, C3147o0 c3147o0, int i7, int[] iArr) {
        super(1);
        this.f39f = 3;
        this.f40g = abstractC3239v0Arr;
        this.f43j = c3147o0;
        this.f42i = i7;
        this.f41h = iArr;
    }
}
