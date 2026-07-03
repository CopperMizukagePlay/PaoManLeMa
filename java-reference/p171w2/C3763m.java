package p171w2;

import p053g5.C1694m;
import p085l0.C2395p;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.m */
/* loaded from: classes.dex */
public final class C3763m extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: g */
    public static final C3763m f17855g;

    /* renamed from: h */
    public static final C3763m f17856h;

    /* renamed from: f */
    public final /* synthetic */ int f17857f;

    static {
        int i7 = 2;
        f17855g = new C3763m(i7, 0);
        f17856h = new C3763m(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3763m(int i7, int i8) {
        super(i7);
        this.f17857f = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        boolean z7;
        boolean z8;
        switch (this.f17857f) {
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
