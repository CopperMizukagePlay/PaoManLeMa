package p001a0;

import p018c0.C0335e;
import p019c1.C0370n;
import p019c1.C0373q;
import p053g5.C1694m;
import p054g6.C1718s;
import p054g6.InterfaceC1713n;
import p087l2.C2447k;
import p100n.C2639e0;
import p100n.C2642f0;
import p100n.C2700z0;
import p140s2.EnumC3103m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p171w2.C3767q;
import p171w2.DialogC3769s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.k0 */
/* loaded from: classes.dex */
public final class C0042k0 extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f206f;

    /* renamed from: g */
    public final /* synthetic */ Object f207g;

    /* renamed from: h */
    public final /* synthetic */ Object f208h;

    /* renamed from: i */
    public final /* synthetic */ Object f209i;

    /* renamed from: j */
    public final /* synthetic */ Object f210j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0042k0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        super(0);
        this.f206f = i7;
        this.f207g = obj;
        this.f208h = obj2;
        this.f209i = obj3;
        this.f210j = obj4;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        InterfaceC1713n m690i;
        switch (this.f206f) {
            case 0:
                if (!((C0043k1) this.f207g).m118b()) {
                    C0373q c0373q = (C0373q) this.f208h;
                    c0373q.getClass();
                    c0373q.m843a(new C0370n(1, 3));
                }
                int i7 = ((C2447k) this.f209i).f13702d;
                if (i7 != 7 && i7 != 8 && (m690i = ((C0335e) this.f210j).m690i()) != null) {
                    ((C1718s) m690i).m2764q(C1694m.f10482a);
                }
                return Boolean.TRUE;
            case 1:
                Number number = (Number) this.f209i;
                Number number2 = (Number) this.f207g;
                C2642f0 c2642f0 = (C2642f0) this.f208h;
                if (!number2.equals(c2642f0.f14296e) || !number.equals(c2642f0.f14297f)) {
                    C2639e0 c2639e0 = (C2639e0) this.f210j;
                    c2642f0.f14296e = number2;
                    c2642f0.f14297f = number;
                    c2642f0.f14300i = new C2700z0(c2639e0, c2642f0.f14298g, number2, number, null);
                    c2642f0.f14304m.f14320b.setValue(Boolean.TRUE);
                    c2642f0.f14301j = false;
                    c2642f0.f14302k = true;
                }
                return C1694m.f10482a;
            default:
                ((DialogC3769s) this.f207g).m5768h((InterfaceC3277a) this.f208h, (C3767q) this.f209i, (EnumC3103m) this.f210j);
                return C1694m.f10482a;
        }
    }
}
