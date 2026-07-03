package p001a0;

import p060h5.AbstractC1806n;
import p122q.EnumC2931o0;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.k2 */
/* loaded from: classes.dex */
public final class C0044k2 extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public static final C0044k2 f236f = new AbstractC3368k(2);

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        C0048l2 c0048l2 = (C0048l2) obj2;
        Float valueOf = Float.valueOf(c0048l2.f246a.m3729g());
        if (((EnumC2931o0) c0048l2.f250e.getValue()) == EnumC2931o0.f15240e) {
            z7 = true;
        } else {
            z7 = false;
        }
        return AbstractC1806n.m3067O(valueOf, Boolean.valueOf(z7));
    }
}
