package p093m0;

import java.util.List;
import p022c4.AbstractC0398h;
import p034e0.C0619n;
import p085l0.C2350d2;
import p085l0.InterfaceC2343c;
import p145t0.C3174e;
import p145t0.C3179j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m0.g */
/* loaded from: classes.dex */
public final class C2523g extends AbstractC0398h {

    /* renamed from: d */
    public static final C2523g f13883d = new AbstractC0398h(0, 2, 1);

    @Override // p022c4.AbstractC0398h
    /* renamed from: a */
    public final void mo873a(C0619n c0619n, InterfaceC2343c interfaceC2343c, C2350d2 c2350d2, C3179j c3179j, InterfaceC2528i0 interfaceC2528i0) {
        int i7 = ((C3174e) c0619n.m1277d(0)).f15887a;
        List list = (List) c0619n.m1277d(1);
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            int i9 = i7 + i8;
            interfaceC2343c.mo88a(i9, obj);
            interfaceC2343c.mo93f(i9, obj);
        }
    }
}
