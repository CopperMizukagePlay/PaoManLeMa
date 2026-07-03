package p039e5;

import java.util.LinkedHashSet;
import java.util.Set;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.C1815w;
import p085l0.C2345c1;
import p085l0.C2349d1;
import p150t5.InterfaceC3277a;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.lh */
/* loaded from: classes.dex */
public final class C1058lh implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f5575e;

    /* renamed from: f */
    public final /* synthetic */ Object f5576f;

    /* renamed from: g */
    public final /* synthetic */ Object f5577g;

    /* renamed from: h */
    public final /* synthetic */ Object f5578h;

    public /* synthetic */ C1058lh(Object obj, Object obj2, Object obj3, int i7) {
        this.f5575e = i7;
        this.f5576f = obj;
        this.f5577g = obj2;
        this.f5578h = obj3;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        LinkedHashSet m2966F;
        int i7 = this.f5575e;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f5577g;
        Object obj2 = this.f5576f;
        Object obj3 = this.f5578h;
        switch (i7) {
            case 0:
                float f7 = AbstractC1092mk.f5952h;
                ((C2349d1) obj2).m3742h(0);
                ((C2349d1) obj).m3742h(-1);
                ((C2345c1) obj3).m3730h(0.0f);
                return c1694m;
            default:
                C3472s c3472s = (C3472s) obj3;
                String str = ((C0910go) obj2).f4322a;
                String str2 = ((C1467yn) obj).f9464a;
                float f8 = AbstractC1092mk.f5952h;
                Set set = (Set) c3472s.get(str);
                if (set == null) {
                    set = C1815w.f10862e;
                }
                if (set.contains(str2)) {
                    m2966F = AbstractC1793a0.m2964D(set, str2);
                } else {
                    m2966F = AbstractC1793a0.m2966F(set, str2);
                }
                c3472s.put(str, m2966F);
                return c1694m;
        }
    }
}
