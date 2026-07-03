package p039e5;

import java.io.IOException;
import java.util.List;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p106n6.AbstractC2721b;
import p150t5.InterfaceC3277a;
import p151t6.C3301o;
import p151t6.C3305s;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ph */
/* loaded from: classes.dex */
public final class C1182ph implements InterfaceC3277a {

    /* renamed from: e */
    public final /* synthetic */ int f6885e = 0;

    /* renamed from: f */
    public final Object f6886f;

    /* renamed from: g */
    public final /* synthetic */ Object f6887g;

    public C1182ph(C1189po c1189po, InterfaceC2425y0 interfaceC2425y0) {
        this.f6886f = c1189po;
        this.f6887g = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int i7 = this.f6885e;
        C1694m c1694m = C1694m.f10482a;
        Object obj = this.f6886f;
        Object obj2 = this.f6887g;
        switch (i7) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj2;
                List m5817z = AbstractC3784a.m5817z(Integer.valueOf(((C1189po) obj).f6926a));
                float f7 = AbstractC1092mk.f5952h;
                if (!m5817z.isEmpty()) {
                    interfaceC2425y0.setValue(m5817z);
                }
                return c1694m;
            default:
                C3301o c3301o = (C3301o) obj2;
                C3305s c3305s = (C3305s) obj;
                try {
                    if (!c3305s.m5015b(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    do {
                    } while (c3305s.m5015b(false, this));
                    c3301o.m5006b(1, 9, null);
                } catch (IOException e7) {
                    c3301o.m5006b(2, 2, e7);
                } catch (Throwable th) {
                    c3301o.m5006b(3, 3, null);
                    AbstractC2721b.m4358d(c3305s);
                    throw th;
                }
                AbstractC2721b.m4358d(c3305s);
                return c1694m;
        }
    }

    public C1182ph(C3301o c3301o, C3305s c3305s) {
        this.f6887g = c3301o;
        this.f6886f = c3305s;
    }
}
