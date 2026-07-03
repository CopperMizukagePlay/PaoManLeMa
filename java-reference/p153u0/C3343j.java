package p153u0;

import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p161v0.AbstractC3465l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u0.j */
/* loaded from: classes.dex */
public final /* synthetic */ class C3343j implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f16405e;

    public /* synthetic */ C3343j(int i7) {
        this.f16405e = i7;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f16405e) {
            case 0:
                return obj;
            case 1:
                synchronized (AbstractC3465l.f16721c) {
                    ?? r12 = AbstractC3465l.f16727i;
                    int size = r12.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((InterfaceC3279c) r12.get(i7)).mo23f(obj);
                    }
                }
                return C1694m.f10482a;
            default:
                C3343j c3343j = AbstractC3465l.f16719a;
                return C1694m.f10482a;
        }
    }
}
