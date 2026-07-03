package p085l0;

import p053g5.C1694m;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.g */
/* loaded from: classes.dex */
public final class C2359g implements InterfaceC3281e {

    /* renamed from: f */
    public static final C2359g f13398f = new C2359g(0);

    /* renamed from: g */
    public static final C2359g f13399g = new C2359g(1);

    /* renamed from: e */
    public final /* synthetic */ int f13400e;

    public /* synthetic */ C2359g(int i7) {
        this.f13400e = i7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        switch (this.f13400e) {
            case 0:
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
            default:
                C2395p c2395p2 = (C2395p) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!c2395p2.m3849R(intValue2 & 1, z8)) {
                    c2395p2.m3852U();
                }
                return C1694m.f10482a;
        }
    }
}
