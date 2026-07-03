package p171w2;

import java.util.UUID;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.c */
/* loaded from: classes.dex */
public final class C3753c extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: g */
    public static final C3753c f17830g;

    /* renamed from: h */
    public static final C3753c f17831h;

    /* renamed from: i */
    public static final C3753c f17832i;

    /* renamed from: f */
    public final /* synthetic */ int f17833f;

    static {
        int i7 = 0;
        f17830g = new C3753c(i7, 0);
        f17831h = new C3753c(i7, 1);
        f17832i = new C3753c(i7, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3753c(int i7, int i8) {
        super(i7);
        this.f17833f = i8;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        switch (this.f17833f) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
