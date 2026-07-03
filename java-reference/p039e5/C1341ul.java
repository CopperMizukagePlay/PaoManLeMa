package p039e5;

import p053g5.C1694m;
import p117p1.C2874y;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p161v0.AbstractC3465l;
import p161v0.C3458e;
import p161v0.C3463j;
import p196z6.C3887f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ul */
/* loaded from: classes.dex */
public final class C1341ul implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7974e;

    /* renamed from: f */
    public Object f7975f;

    /* JADX WARN: Type inference failed for: r6v7, types: [t5.c, u5.k] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        long j6;
        switch (this.f7974e) {
            case 0:
                ((C3887f) this.f7975f).m5901b("cancelled", 1000);
                return C1694m.f10482a;
            case 1:
                return ((AbstractC3368k) this.f7975f).mo23f(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C2874y c2874y = (C2874y) this.f7975f;
                if (c2874y != null) {
                    c2874y.f15041c = booleanValue;
                }
                return C1694m.f10482a;
            default:
                C3463j c3463j = (C3463j) obj;
                synchronized (AbstractC3465l.f16721c) {
                    j6 = AbstractC3465l.f16723e;
                    AbstractC3465l.f16723e = 1 + j6;
                }
                return new C3458e(j6, c3463j, (InterfaceC3279c) this.f7975f);
        }
    }

    public /* synthetic */ C1341ul(int i7, Object obj) {
        this.f7974e = i7;
        this.f7975f = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1341ul(InterfaceC3279c interfaceC3279c) {
        this.f7974e = 1;
        this.f7975f = (AbstractC3368k) interfaceC3279c;
    }
}
