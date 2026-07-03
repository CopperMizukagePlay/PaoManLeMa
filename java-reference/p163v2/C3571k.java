package p163v2;

import androidx.compose.p007ui.viewinterop.AbstractC0174a;
import androidx.lifecycle.InterfaceC0213t;
import p053g5.C1694m;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3368k;
import p162v1.C3502g0;
import p172w3.InterfaceC3782f;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.k */
/* loaded from: classes.dex */
public final class C3571k extends AbstractC3368k implements InterfaceC3281e {

    /* renamed from: g */
    public static final C3571k f17160g;

    /* renamed from: h */
    public static final C3571k f17161h;

    /* renamed from: i */
    public static final C3571k f17162i;

    /* renamed from: j */
    public static final C3571k f17163j;

    /* renamed from: k */
    public static final C3571k f17164k;

    /* renamed from: l */
    public static final C3571k f17165l;

    /* renamed from: m */
    public static final C3571k f17166m;

    /* renamed from: f */
    public final /* synthetic */ int f17167f;

    static {
        int i7 = 2;
        f17160g = new C3571k(i7, 0);
        f17161h = new C3571k(i7, 1);
        f17162i = new C3571k(i7, 2);
        f17163j = new C3571k(i7, 3);
        f17164k = new C3571k(i7, 4);
        f17165l = new C3571k(i7, 5);
        f17166m = new C3571k(i7, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3571k(int i7, int i8) {
        super(i7);
        this.f17167f = i8;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        int i7;
        switch (this.f17167f) {
            case 0:
                AbstractC0174a.m405c((C3502g0) obj).setUpdateBlock((InterfaceC3279c) obj2);
                return C1694m.f10482a;
            case 1:
                AbstractC0174a.m405c((C3502g0) obj).setReleaseBlock((InterfaceC3279c) obj2);
                return C1694m.f10482a;
            case 2:
                AbstractC0174a.m405c((C3502g0) obj).setModifier((InterfaceC3810r) obj2);
                return C1694m.f10482a;
            case 3:
                AbstractC0174a.m405c((C3502g0) obj).setDensity((InterfaceC3093c) obj2);
                return C1694m.f10482a;
            case 4:
                AbstractC0174a.m405c((C3502g0) obj).setLifecycleOwner((InterfaceC0213t) obj2);
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                AbstractC0174a.m405c((C3502g0) obj).setSavedStateRegistryOwner((InterfaceC3782f) obj2);
                return C1694m.f10482a;
            default:
                C3576p m405c = AbstractC0174a.m405c((C3502g0) obj);
                int ordinal = ((EnumC3103m) obj2).ordinal();
                if (ordinal != 0) {
                    i7 = 1;
                    if (ordinal != 1) {
                        throw new RuntimeException();
                    }
                } else {
                    i7 = 0;
                }
                m405c.setLayoutDirection(i7);
                return C1694m.f10482a;
        }
    }
}
