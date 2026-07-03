package p071j0;

import p053g5.C1687f;
import p085l0.C2361g1;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.m */
/* loaded from: classes.dex */
public final class C2138m extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f12457f;

    /* renamed from: g */
    public final /* synthetic */ C2150s f12458g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2138m(C2150s c2150s, int i7) {
        super(0);
        this.f12457f = i7;
        this.f12458g = c2150s;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f12457f) {
            case 0:
                return this.f12458g.m3487d();
            case 1:
                C2150s c2150s = this.f12458g;
                return new C1687f(c2150s.m3487d(), c2150s.f12513f.getValue());
            case 2:
                C2150s c2150s2 = this.f12458g;
                Object value = c2150s2.f12517j.getValue();
                if (value == null) {
                    float m3729g = c2150s2.f12515h.m3729g();
                    C2361g1 c2361g1 = c2150s2.f12512e;
                    if (!Float.isNaN(m3729g)) {
                        Object value2 = c2361g1.getValue();
                        C2121d0 m3487d = c2150s2.m3487d();
                        float m3474c = m3487d.m3474c(value2);
                        if (m3474c != m3729g && !Float.isNaN(m3474c)) {
                            if (m3474c < m3729g) {
                                Object m3473b = m3487d.m3473b(m3729g, true);
                                if (m3473b != null) {
                                    return m3473b;
                                }
                            } else {
                                Object m3473b2 = m3487d.m3473b(m3729g, false);
                                if (m3473b2 != null) {
                                    return m3473b2;
                                }
                            }
                        }
                        return value2;
                    }
                    return c2361g1.getValue();
                }
                return value;
            case 3:
                C2150s c2150s3 = this.f12458g;
                float m3474c2 = c2150s3.m3487d().m3474c(c2150s3.f12512e.getValue());
                float m3474c3 = c2150s3.m3487d().m3474c(c2150s3.f12514g.getValue()) - m3474c2;
                float abs = Math.abs(m3474c3);
                float f7 = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float m3488e = (c2150s3.m3488e() - m3474c2) / m3474c3;
                    if (m3488e < 1.0E-6f) {
                        f7 = 0.0f;
                    } else if (m3488e <= 0.999999f) {
                        f7 = m3488e;
                    }
                }
                return Float.valueOf(f7);
            default:
                C2150s c2150s4 = this.f12458g;
                Object value3 = c2150s4.f12517j.getValue();
                if (value3 == null) {
                    float m3729g2 = c2150s4.f12515h.m3729g();
                    C2361g1 c2361g12 = c2150s4.f12512e;
                    if (!Float.isNaN(m3729g2)) {
                        return c2150s4.m3486c(m3729g2, 0.0f, c2361g12.getValue());
                    }
                    return c2361g12.getValue();
                }
                return value3;
        }
    }
}
