package p079k1;

import android.graphics.PathMeasure;
import p035e1.C0662k;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.f */
/* loaded from: classes.dex */
public final class C2268f extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: g */
    public static final C2268f f13148g;

    /* renamed from: h */
    public static final C2268f f13149h;

    /* renamed from: f */
    public final /* synthetic */ int f13150f;

    static {
        int i7 = 0;
        f13148g = new C2268f(i7, 0);
        f13149h = new C2268f(i7, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2268f(int i7, int i8) {
        super(i7);
        this.f13150f = i8;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f13150f) {
            case 0:
                return new C0662k(new PathMeasure());
            default:
                return C1694m.f10482a;
        }
    }
}
