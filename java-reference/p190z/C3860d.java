package p190z;

import p000a.AbstractC0000a;
import p027d1.C0465c;
import p027d1.C0466d;
import p027d1.C0467e;
import p035e1.AbstractC0655g0;
import p035e1.C0651e0;
import p035e1.C0653f0;
import p035e1.InterfaceC0667m0;
import p060h5.AbstractC1793a0;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z.d */
/* loaded from: classes.dex */
public final class C3860d implements InterfaceC0667m0 {

    /* renamed from: a */
    public final InterfaceC3857a f18092a;

    /* renamed from: b */
    public final InterfaceC3857a f18093b;

    /* renamed from: c */
    public final InterfaceC3857a f18094c;

    /* renamed from: d */
    public final InterfaceC3857a f18095d;

    public C3860d(InterfaceC3857a interfaceC3857a, InterfaceC3857a interfaceC3857a2, InterfaceC3857a interfaceC3857a3, InterfaceC3857a interfaceC3857a4) {
        this.f18092a = interfaceC3857a;
        this.f18093b = interfaceC3857a2;
        this.f18094c = interfaceC3857a3;
        this.f18095d = interfaceC3857a4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [z.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [z.a] */
    /* renamed from: b */
    public static C3860d m5872b(C3860d c3860d, C3858b c3858b, C3858b c3858b2, C3858b c3858b3, int i7) {
        C3858b c3858b4 = c3858b;
        if ((i7 & 1) != 0) {
            c3858b4 = c3860d.f18092a;
        }
        InterfaceC3857a interfaceC3857a = c3860d.f18093b;
        C3858b c3858b5 = c3858b2;
        if ((i7 & 4) != 0) {
            c3858b5 = c3860d.f18094c;
        }
        c3860d.getClass();
        return new C3860d(c3858b4, interfaceC3857a, c3858b5, c3858b3);
    }

    @Override // p035e1.InterfaceC0667m0
    /* renamed from: a */
    public final AbstractC0655g0 mo1393a(long j6, EnumC3103m enumC3103m, InterfaceC3093c interfaceC3093c) {
        float f7;
        float f8;
        float mo5871a = this.f18092a.mo5871a(j6, interfaceC3093c);
        float mo5871a2 = this.f18093b.mo5871a(j6, interfaceC3093c);
        float mo5871a3 = this.f18094c.mo5871a(j6, interfaceC3093c);
        float mo5871a4 = this.f18095d.mo5871a(j6, interfaceC3093c);
        float m1025c = C0467e.m1025c(j6);
        float f9 = mo5871a + mo5871a4;
        if (f9 > m1025c) {
            float f10 = m1025c / f9;
            mo5871a *= f10;
            mo5871a4 *= f10;
        }
        float f11 = mo5871a2 + mo5871a3;
        if (f11 > m1025c) {
            float f12 = m1025c / f11;
            mo5871a2 *= f12;
            mo5871a3 *= f12;
        }
        if (mo5871a >= 0.0f && mo5871a2 >= 0.0f && mo5871a3 >= 0.0f && mo5871a4 >= 0.0f) {
            if (mo5871a + mo5871a2 + mo5871a3 + mo5871a4 == 0.0f) {
                return new C0651e0(AbstractC0000a.m3d(0L, j6));
            }
            C0465c m3d = AbstractC0000a.m3d(0L, j6);
            EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
            if (enumC3103m == enumC3103m2) {
                f7 = mo5871a;
            } else {
                f7 = mo5871a2;
            }
            long m2974b = AbstractC1793a0.m2974b(f7);
            if (enumC3103m == enumC3103m2) {
                mo5871a = mo5871a2;
            }
            long m2974b2 = AbstractC1793a0.m2974b(mo5871a);
            if (enumC3103m == enumC3103m2) {
                f8 = mo5871a3;
            } else {
                f8 = mo5871a4;
            }
            long m2974b3 = AbstractC1793a0.m2974b(f8);
            if (enumC3103m != enumC3103m2) {
                mo5871a4 = mo5871a3;
            }
            return new C0653f0(new C0466d(m3d.f1625a, m3d.f1626b, m3d.f1627c, m3d.f1628d, m2974b, m2974b2, m2974b3, AbstractC1793a0.m2974b(mo5871a4)));
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo5871a + ", topEnd = " + mo5871a2 + ", bottomEnd = " + mo5871a3 + ", bottomStart = " + mo5871a4 + ")!").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3860d)) {
            return false;
        }
        C3860d c3860d = (C3860d) obj;
        if (AbstractC3367j.m5096a(this.f18092a, c3860d.f18092a) && AbstractC3367j.m5096a(this.f18093b, c3860d.f18093b) && AbstractC3367j.m5096a(this.f18094c, c3860d.f18094c) && AbstractC3367j.m5096a(this.f18095d, c3860d.f18095d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18095d.hashCode() + ((this.f18094c.hashCode() + ((this.f18093b.hashCode() + (this.f18092a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f18092a + ", topEnd = " + this.f18093b + ", bottomEnd = " + this.f18094c + ", bottomStart = " + this.f18095d + ')';
    }
}
