package p039e5;

import java.util.Iterator;
import java.util.List;
import p027d1.C0464b;
import p053g5.C1694m;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p152u.C3326n;
import p152u.C3330r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.jh */
/* loaded from: classes.dex */
public final class C0996jh implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ C3330r f5066e;

    /* renamed from: f */
    public final /* synthetic */ C1189po f5067f;

    /* renamed from: g */
    public final /* synthetic */ C2345c1 f5068g;

    /* renamed from: h */
    public final /* synthetic */ C2349d1 f5069h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC2425y0 f5070i;

    /* renamed from: j */
    public final /* synthetic */ C2349d1 f5071j;

    /* renamed from: k */
    public final /* synthetic */ C2345c1 f5072k;

    public C0996jh(C3330r c3330r, C1189po c1189po, C2345c1 c2345c1, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d12, C2345c1 c2345c12) {
        this.f5066e = c3330r;
        this.f5067f = c1189po;
        this.f5068g = c2345c1;
        this.f5069h = c2349d1;
        this.f5070i = interfaceC2425y0;
        this.f5071j = c2349d12;
        this.f5072k = c2345c12;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Iterable] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        Object obj2;
        float f7;
        long j6 = ((C0464b) obj).f1623a;
        ?? r52 = this.f5066e.m5067g().f16321j;
        int i7 = this.f5067f.f6926a;
        Iterator it = r52.iterator();
        while (true) {
            if (it.hasNext()) {
                obj2 = it.next();
                if (((C3326n) obj2).f16337i.equals(Integer.valueOf(i7))) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C3326n c3326n = (C3326n) obj2;
        if (c3326n != null) {
            f7 = c3326n.f16341m;
        } else {
            f7 = 0.0f;
        }
        float f8 = AbstractC1092mk.f5952h;
        this.f5068g.m3730h(f7);
        this.f5069h.m3742h(i7);
        Iterator it2 = ((List) this.f5070i.getValue()).iterator();
        int i8 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (((C1189po) it2.next()).f6926a == i7) {
                    break;
                }
                i8++;
            } else {
                i8 = -1;
                break;
            }
        }
        this.f5071j.m3742h(i8);
        this.f5072k.m3730h(0.0f);
        return C1694m.f10482a;
    }
}
