package androidx.compose.p007ui.layout;

import p077k.C2221w;
import p146t1.AbstractC3191c1;
import p146t1.C3212j1;
import p146t1.C3218l1;
import p146t1.C3224o;
import p146t1.InterfaceC3215k1;
import p146t1.RunnableC3226p;
import p162v1.C3517l0;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.compose.ui.layout.b */
/* loaded from: classes.dex */
public abstract class AbstractC0173b {

    /* renamed from: a */
    public static final C2221w f781a;

    /* renamed from: b */
    public static final InterfaceC3215k1[] f782b;

    /* renamed from: c */
    public static final C2221w f783c;

    static {
        C2221w c2221w = new C2221w(8);
        InterfaceC3215k1.f15995a.getClass();
        C3218l1 c3218l1 = C3212j1.f15990g;
        c2221w.m3652g(1, c3218l1);
        C3218l1 c3218l12 = C3212j1.f15989f;
        c2221w.m3652g(2, c3218l12);
        C3218l1 c3218l13 = C3212j1.f15985b;
        c2221w.m3652g(4, c3218l13);
        C3218l1 c3218l14 = C3212j1.f15987d;
        c2221w.m3652g(8, c3218l14);
        C3218l1 c3218l15 = C3212j1.f15991h;
        c2221w.m3652g(16, c3218l15);
        C3218l1 c3218l16 = C3212j1.f15988e;
        c2221w.m3652g(32, c3218l16);
        C3218l1 c3218l17 = C3212j1.f15992i;
        c2221w.m3652g(64, c3218l17);
        f781a = c2221w;
        f782b = new InterfaceC3215k1[]{c3218l1, c3218l12, c3218l13, c3218l17, c3218l15, c3218l16, c3218l14, C3212j1.f15993j, C3212j1.f15986c};
        C2221w c2221w2 = new C2221w(7);
        c2221w2.m3652g(1, c3218l1);
        c2221w2.m3652g(2, c3218l12);
        c2221w2.m3652g(4, c3218l13);
        c2221w2.m3652g(16, c3218l15);
        c2221w2.m3652g(64, c3218l17);
        c2221w2.m3652g(32, c3218l16);
        c2221w2.m3652g(8, c3218l14);
        f783c = c2221w2;
    }

    /* renamed from: a */
    public static final void m396a(C3517l0 c3517l0, C3224o c3224o, long j6, int i7, int i8) {
        if (!AbstractC3191c1.m4896g(j6, -1L)) {
            c3517l0.m5475a(c3224o.m4943b(), (int) ((j6 >>> 48) & 65535));
            c3517l0.m5475a(c3224o.m4945d(), (int) ((j6 >>> 32) & 65535));
            c3517l0.m5475a(c3224o.m4944c(), i7 - ((int) ((j6 >>> 16) & 65535)));
            c3517l0.m5475a(c3224o.m4942a(), i8 - ((int) (j6 & 65535)));
        }
    }

    /* renamed from: b */
    public static final InterfaceC3810r m397b(RunnableC3226p runnableC3226p) {
        return new RulerProviderModifierElement(runnableC3226p);
    }
}
