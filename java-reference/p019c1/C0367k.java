package p019c1;

import android.view.View;
import p001a0.C0031h1;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p152u.C3330r;
import p158u5.AbstractC3368k;
import p160v.AbstractC3433r0;
import p160v.C3398a1;
import p160v.C3427o0;
import p160v.C3431q0;
import p161v0.AbstractC3459f;
import p161v0.AbstractC3470q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c1.k */
/* loaded from: classes.dex */
public final class C0367k extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f1236f;

    /* renamed from: g */
    public final /* synthetic */ int f1237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0367k(int i7, int i8) {
        super(1);
        this.f1236f = i8;
        this.f1237g = i7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC3279c interfaceC3279c;
        boolean z7;
        switch (this.f1236f) {
            case 0:
                return Boolean.valueOf(((C0377u) obj).m849O0(this.f1237g));
            case 1:
                C3427o0 c3427o0 = (C3427o0) obj;
                AbstractC3459f m5263d = AbstractC3470q.m5263d();
                if (m5263d != null) {
                    interfaceC3279c = m5263d.mo5207e();
                } else {
                    interfaceC3279c = null;
                }
                AbstractC3470q.m5269j(m5263d, AbstractC3470q.m5266g(m5263d), interfaceC3279c);
                for (int i7 = 0; i7 < 2; i7++) {
                    int i8 = this.f1237g + i7;
                    c3427o0.getClass();
                    long j6 = AbstractC3433r0.f16614a;
                    C3431q0 c3431q0 = c3427o0.f16602b;
                    C0031h1 c0031h1 = c3431q0.f16608c;
                    if (c0031h1 != null) {
                        c3427o0.f16601a.add(new C3398a1(c0031h1, i8, j6, c3431q0.f16607b));
                    }
                }
                return C1694m.f10482a;
            case 2:
                return Boolean.valueOf(((C0377u) obj).m849O0(this.f1237g));
            default:
                if (((View) obj).getId() == this.f1237g) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                return Boolean.valueOf(z7);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367k(C3330r c3330r, int i7) {
        super(1);
        this.f1236f = 1;
        this.f1237g = i7;
    }
}
