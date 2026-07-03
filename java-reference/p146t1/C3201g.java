package p146t1;

import p053g5.C1694m;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.g */
/* loaded from: classes.dex */
public final class C3201g extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: f */
    public static final C3201g f15953f = new AbstractC3368k(2);

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        C2395p c2395p = (C2395p) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!c2395p.m3849R(intValue & 1, z7)) {
            c2395p.m3852U();
        }
        return C1694m.f10482a;
    }
}
