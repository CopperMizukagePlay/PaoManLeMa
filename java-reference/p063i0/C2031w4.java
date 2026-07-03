package p063i0;

import java.util.ArrayList;
import p001a0.C0076s2;
import p053g5.C1694m;
import p144t.InterfaceC3159u0;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3203g1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.w4 */
/* loaded from: classes.dex */
public final class C2031w4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ ArrayList f12025f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f12026g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f12027h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f12028i;

    /* renamed from: j */
    public final /* synthetic */ C0076s2 f12029j;

    /* renamed from: k */
    public final /* synthetic */ int f12030k;

    /* renamed from: l */
    public final /* synthetic */ int f12031l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3159u0 f12032m;

    /* renamed from: n */
    public final /* synthetic */ InterfaceC3203g1 f12033n;

    /* renamed from: o */
    public final /* synthetic */ int f12034o;

    /* renamed from: p */
    public final /* synthetic */ int f12035p;

    /* renamed from: q */
    public final /* synthetic */ Integer f12036q;

    /* renamed from: r */
    public final /* synthetic */ ArrayList f12037r;

    /* renamed from: s */
    public final /* synthetic */ Integer f12038s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2031w4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C0076s2 c0076s2, int i7, int i8, InterfaceC3159u0 interfaceC3159u0, InterfaceC3203g1 interfaceC3203g1, int i9, int i10, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f12025f = arrayList;
        this.f12026g = arrayList2;
        this.f12027h = arrayList3;
        this.f12028i = arrayList4;
        this.f12029j = c0076s2;
        this.f12030k = i7;
        this.f12031l = i8;
        this.f12032m = interfaceC3159u0;
        this.f12033n = interfaceC3203g1;
        this.f12034o = i9;
        this.f12035p = i10;
        this.f12036q = num;
        this.f12037r = arrayList5;
        this.f12038s = num2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        int i8;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        ArrayList arrayList = this.f12025f;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3237u0.m4949g(abstractC3237u0, (AbstractC3239v0) arrayList.get(i9), 0, 0);
        }
        ArrayList arrayList2 = this.f12026g;
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AbstractC3237u0.m4949g(abstractC3237u0, (AbstractC3239v0) arrayList2.get(i10), 0, 0);
        }
        ArrayList arrayList3 = this.f12027h;
        int size3 = arrayList3.size();
        int i11 = 0;
        while (true) {
            i7 = this.f12034o;
            if (i11 >= size3) {
                break;
            }
            AbstractC3239v0 abstractC3239v0 = (AbstractC3239v0) arrayList3.get(i11);
            int i12 = (this.f12030k - this.f12031l) / 2;
            InterfaceC3203g1 interfaceC3203g1 = this.f12033n;
            AbstractC3237u0.m4949g(abstractC3237u0, abstractC3239v0, this.f12032m.mo3481d(interfaceC3203g1, interfaceC3203g1.getLayoutDirection()) + i12, i7 - this.f12035p);
            i11++;
        }
        ArrayList arrayList4 = this.f12028i;
        int size4 = arrayList4.size();
        for (int i13 = 0; i13 < size4; i13++) {
            AbstractC3239v0 abstractC3239v02 = (AbstractC3239v0) arrayList4.get(i13);
            Integer num = this.f12036q;
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            AbstractC3237u0.m4949g(abstractC3237u0, abstractC3239v02, 0, i7 - i8);
        }
        C0076s2 c0076s2 = this.f12029j;
        if (c0076s2 != null) {
            ArrayList arrayList5 = this.f12037r;
            int size5 = arrayList5.size();
            for (int i14 = 0; i14 < size5; i14++) {
                AbstractC3239v0 abstractC3239v03 = (AbstractC3239v0) arrayList5.get(i14);
                int i15 = c0076s2.f374b;
                Integer num2 = this.f12038s;
                AbstractC3367j.m5097b(num2);
                AbstractC3237u0.m4949g(abstractC3237u0, abstractC3239v03, i15, i7 - num2.intValue());
            }
        }
        return C1694m.f10482a;
    }
}
