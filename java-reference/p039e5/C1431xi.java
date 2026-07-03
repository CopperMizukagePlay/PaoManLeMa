package p039e5;

import android.content.Context;
import java.util.List;
import p053g5.C1694m;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1811s;
import p085l0.C2349d1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.xi */
/* loaded from: classes.dex */
public final /* synthetic */ class C1431xi implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f8754e = 0;

    /* renamed from: f */
    public final /* synthetic */ C3469p f8755f;

    /* renamed from: g */
    public final /* synthetic */ C3469p f8756g;

    /* renamed from: h */
    public final /* synthetic */ C2349d1 f8757h;

    /* renamed from: i */
    public final /* synthetic */ C3469p f8758i;

    /* renamed from: j */
    public final /* synthetic */ C3469p f8759j;

    /* renamed from: k */
    public final /* synthetic */ C3472s f8760k;

    /* renamed from: l */
    public final /* synthetic */ C3472s f8761l;

    /* renamed from: m */
    public final /* synthetic */ Context f8762m;

    /* renamed from: n */
    public final /* synthetic */ C2349d1 f8763n;

    public /* synthetic */ C1431xi(C2349d1 c2349d1, C3469p c3469p, C3469p c3469p2, C3469p c3469p3, C3469p c3469p4, C3472s c3472s, C3472s c3472s2, Context context, C2349d1 c2349d12) {
        this.f8757h = c2349d1;
        this.f8755f = c3469p;
        this.f8756g = c3469p2;
        this.f8758i = c3469p3;
        this.f8759j = c3469p4;
        this.f8760k = c3472s;
        this.f8761l = c3472s2;
        this.f8762m = context;
        this.f8763n = c2349d12;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        switch (this.f8754e) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                C2349d1 c2349d1 = this.f8757h;
                AbstractC1092mk.m1715P0(c2349d1, intValue);
                AbstractC1092mk.m1750X0(this.f8755f, this.f8756g, this.f8758i, this.f8759j, this.f8760k, this.f8761l, this.f8762m, c2349d1, this.f8763n, intValue);
                break;
            default:
                List list = (List) obj;
                AbstractC3367j.m5100e(list, "ids");
                C1103n0 c1103n0 = new C1103n0(3, list);
                C3469p c3469p = this.f8755f;
                AbstractC1811s.m3080b0(c3469p, c1103n0);
                C1103n0 c1103n02 = new C1103n0(4, list);
                C3469p c3469p2 = this.f8756g;
                AbstractC1811s.m3080b0(c3469p2, c1103n02);
                C1189po c1189po = (C1189po) AbstractC1805m.m3047k0(c3469p);
                if (c1189po != null) {
                    i7 = c1189po.f6926a;
                } else {
                    i7 = 0;
                }
                C2349d1 c2349d12 = this.f8757h;
                AbstractC1092mk.m1715P0(c2349d12, i7);
                AbstractC1092mk.m1750X0(c3469p, c3469p2, this.f8758i, this.f8759j, this.f8760k, this.f8761l, this.f8762m, c2349d12, this.f8763n, c2349d12.m3741g());
                break;
        }
        return C1694m.f10482a;
    }

    public /* synthetic */ C1431xi(C3469p c3469p, C3469p c3469p2, C2349d1 c2349d1, C3469p c3469p3, C3469p c3469p4, C3472s c3472s, C3472s c3472s2, Context context, C2349d1 c2349d12) {
        this.f8755f = c3469p;
        this.f8756g = c3469p2;
        this.f8757h = c2349d1;
        this.f8758i = c3469p3;
        this.f8759j = c3469p4;
        this.f8760k = c3472s;
        this.f8761l = c3472s2;
        this.f8762m = context;
        this.f8763n = c2349d12;
    }
}
