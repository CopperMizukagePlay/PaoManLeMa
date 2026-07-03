package p152u;

import java.util.List;
import p140s2.AbstractC3092b;
import p140s2.C3091a;
import p160v.C3417j0;
import p177x0.InterfaceC3796d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u.j */
/* loaded from: classes.dex */
public final class C3322j {

    /* renamed from: a */
    public final C3321i f16291a;

    /* renamed from: b */
    public final C3417j0 f16292b;

    /* renamed from: c */
    public final long f16293c;

    /* renamed from: d */
    public final /* synthetic */ C3417j0 f16294d;

    /* renamed from: e */
    public final /* synthetic */ int f16295e;

    /* renamed from: f */
    public final /* synthetic */ int f16296f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC3796d f16297g;

    /* renamed from: h */
    public final /* synthetic */ int f16298h;

    /* renamed from: i */
    public final /* synthetic */ int f16299i;

    /* renamed from: j */
    public final /* synthetic */ long f16300j;

    /* renamed from: k */
    public final /* synthetic */ C3330r f16301k;

    public C3322j(long j6, C3321i c3321i, C3417j0 c3417j0, int i7, int i8, InterfaceC3796d interfaceC3796d, int i9, int i10, long j7, C3330r c3330r) {
        this.f16294d = c3417j0;
        this.f16295e = i7;
        this.f16296f = i8;
        this.f16297g = interfaceC3796d;
        this.f16298h = i9;
        this.f16299i = i10;
        this.f16300j = j7;
        this.f16301k = c3330r;
        this.f16291a = c3321i;
        this.f16292b = c3417j0;
        this.f16293c = AbstractC3092b.m4765b(C3091a.m4760h(j6), Integer.MAX_VALUE, 5);
    }

    /* renamed from: a */
    public final C3326n m5060a(int i7, long j6) {
        int i8;
        C3321i c3321i = this.f16291a;
        Object mo5057c = c3321i.mo5057c(i7);
        Object mo5058d = c3321i.mo5058d(i7);
        List m5178a = this.f16292b.m5178a(i7, j6);
        if (i7 == this.f16295e - 1) {
            i8 = 0;
        } else {
            i8 = this.f16296f;
        }
        return new C3326n(i7, m5178a, this.f16297g, this.f16294d.f16567f.getLayoutDirection(), this.f16298h, this.f16299i, i8, this.f16300j, mo5057c, mo5058d, this.f16301k.f16373n, j6);
    }
}
