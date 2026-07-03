package p039e5;

import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1811s;
import p068i5.C2077a;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3277a;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.u9 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1329u9 implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f7899e;

    /* renamed from: f */
    public final /* synthetic */ List f7900f;

    /* renamed from: g */
    public final /* synthetic */ Object f7901g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2425y0 f7902h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f7903i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC2425y0 f7904j;

    /* renamed from: k */
    public final /* synthetic */ C2349d1 f7905k;

    /* renamed from: l */
    public final /* synthetic */ Object f7906l;

    /* renamed from: m */
    public final /* synthetic */ Object f7907m;

    /* renamed from: n */
    public final /* synthetic */ Object f7908n;

    /* renamed from: o */
    public final /* synthetic */ Context f7909o;

    /* renamed from: p */
    public final /* synthetic */ InterfaceC2425y0 f7910p;

    /* renamed from: q */
    public final /* synthetic */ Object f7911q;

    public /* synthetic */ C1329u9(List list, InterfaceC0516a0 interfaceC0516a0, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, C2349d1 c2349d1, C3472s c3472s, C3472s c3472s2, C3472s c3472s3, Context context, InterfaceC2425y0 interfaceC2425y04, C3472s c3472s4, int i7) {
        this.f7899e = i7;
        this.f7900f = list;
        this.f7901g = interfaceC0516a0;
        this.f7902h = interfaceC2425y0;
        this.f7903i = interfaceC2425y02;
        this.f7904j = interfaceC2425y03;
        this.f7905k = c2349d1;
        this.f7906l = c3472s;
        this.f7907m = c3472s2;
        this.f7908n = c3472s3;
        this.f7909o = context;
        this.f7910p = interfaceC2425y04;
        this.f7911q = c3472s4;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f7899e;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f7911q;
        Object obj2 = this.f7908n;
        Object obj3 = this.f7907m;
        Object obj4 = this.f7906l;
        Object obj5 = this.f7901g;
        switch (i7) {
            case 0:
                AbstractC1249rm.m2217F(this.f7900f, (InterfaceC0516a0) obj5, this.f7902h, this.f7903i, this.f7904j, this.f7905k, (C3472s) obj4, (C3472s) obj3, (C3472s) obj2, this.f7909o, this.f7910p, (C3472s) obj, false);
                return c1694m;
            case 1:
                AbstractC1249rm.m2217F(this.f7900f, (InterfaceC0516a0) obj5, this.f7902h, this.f7903i, this.f7904j, this.f7905k, (C3472s) obj4, (C3472s) obj3, (C3472s) obj2, this.f7909o, this.f7910p, (C3472s) obj, true);
                return c1694m;
            default:
                C3469p c3469p = (C3469p) this.f7900f;
                C3469p c3469p2 = (C3469p) obj5;
                C3469p c3469p3 = (C3469p) obj4;
                C3469p c3469p4 = (C3469p) obj3;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj;
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = c3469p.listIterator();
                while (true) {
                    C2077a c2077a = (C2077a) listIterator;
                    if (c2077a.hasNext()) {
                        Object next = c2077a.next();
                        if (c3469p4.contains(Integer.valueOf(((C1189po) next).f6926a))) {
                            arrayList.add(next);
                        }
                    } else {
                        if (arrayList.size() >= 2) {
                            float f7 = AbstractC1092mk.f5952h;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i8 = 0;
                            while (i8 < size) {
                                Object obj6 = arrayList.get(i8);
                                i8++;
                                AbstractC1811s.m3076X(((C1189po) obj6).f6928c, arrayList2);
                            }
                            List m3042f0 = AbstractC1805m.m3042f0(arrayList2);
                            ArrayList arrayList3 = new ArrayList();
                            int size2 = arrayList.size();
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj7 = arrayList.get(i9);
                                i9++;
                                AbstractC1811s.m3076X(((C1189po) obj7).f6929d, arrayList3);
                            }
                            List m3042f02 = AbstractC1805m.m3042f0(arrayList3);
                            if (m3042f0.isEmpty() && m3042f02.isEmpty()) {
                                Toast.makeText(this.f7909o, "所选配置没有可合并的地址", 0).show();
                            } else {
                                this.f7905k.m3742h(0);
                                AbstractC1092mk.m1660E0(this.f7902h, true);
                                AbstractC1092mk.m1670G0(this.f7903i, false);
                                ArrayList arrayList4 = new ArrayList(AbstractC1807o.m3073U(c3469p));
                                ListIterator listIterator2 = c3469p.listIterator();
                                while (true) {
                                    C2077a c2077a2 = (C2077a) listIterator2;
                                    if (c2077a2.hasNext()) {
                                        arrayList4.add(((C1189po) c2077a2.next()).f6927b);
                                    } else {
                                        this.f7904j.setValue(AbstractC1092mk.m1728R3("合并配置", arrayList4));
                                        this.f7910p.setValue("");
                                        interfaceC2425y0.setValue("");
                                        AbstractC1092mk.m1658D3(c3469p2, m3042f0);
                                        AbstractC1092mk.m1658D3(c3469p3, m3042f02);
                                        AbstractC1092mk.m1725R0(interfaceC2425y02, true);
                                    }
                                }
                            }
                        }
                        return c1694m;
                    }
                }
                break;
        }
    }

    public /* synthetic */ C1329u9(C3469p c3469p, Context context, C3469p c3469p2, C3469p c3469p3, C3469p c3469p4, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f7899e = 2;
        this.f7900f = c3469p;
        this.f7909o = context;
        this.f7901g = c3469p2;
        this.f7906l = c3469p3;
        this.f7907m = c3469p4;
        this.f7905k = c2349d1;
        this.f7902h = interfaceC2425y0;
        this.f7903i = interfaceC2425y02;
        this.f7904j = interfaceC2425y03;
        this.f7910p = interfaceC2425y04;
        this.f7908n = interfaceC2425y05;
        this.f7911q = interfaceC2425y06;
    }
}
