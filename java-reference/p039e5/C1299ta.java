package p039e5;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import p014b5.C0293g;
import p032d6.C0548l;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p161v0.AbstractC3465l;
import p161v0.C3452b;
import p161v0.C3463j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ta */
/* loaded from: classes.dex */
public final class C1299ta implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7776e;

    /* renamed from: f */
    public final /* synthetic */ Object f7777f;

    /* renamed from: g */
    public final /* synthetic */ Object f7778g;

    public /* synthetic */ C1299ta(int i7, Object obj, Object obj2) {
        this.f7776e = i7;
        this.f7777f = obj;
        this.f7778g = obj2;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        LinkedHashSet m2964D;
        long j6;
        switch (this.f7776e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = ((C0877fn) this.f7777f).f4045a;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f7778g;
                if (booleanValue) {
                    m2964D = AbstractC1793a0.m2966F((Set) interfaceC2425y0.getValue(), str);
                } else {
                    m2964D = AbstractC1793a0.m2964D((Set) interfaceC2425y0.getValue(), str);
                }
                interfaceC2425y0.setValue(m2964D);
                return C1694m.f10482a;
            case 1:
                ((Boolean) obj).booleanValue();
                ((InterfaceC3279c) this.f7777f).mo23f(Integer.valueOf(((C1189po) this.f7778g).f6926a));
                return C1694m.f10482a;
            case 2:
                C0293g c0293g = (C0293g) this.f7777f;
                Object obj2 = c0293g.f1068b;
                C0548l c0548l = (C0548l) this.f7778g;
                synchronized (obj2) {
                    ((ArrayList) c0293g.f1069c).remove(c0548l);
                }
                return C1694m.f10482a;
            default:
                C3463j c3463j = (C3463j) obj;
                synchronized (AbstractC3465l.f16721c) {
                    j6 = AbstractC3465l.f16723e;
                    AbstractC3465l.f16723e = 1 + j6;
                }
                return new C3452b(j6, c3463j, (InterfaceC3279c) this.f7777f, (InterfaceC3279c) this.f7778g);
        }
    }
}
