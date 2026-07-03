package p039e5;

import android.view.View;
import java.util.List;
import p053g5.C1694m;
import p085l0.C2364h0;
import p085l0.InterfaceC2425y0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.a3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0698a3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f2313e;

    /* renamed from: f */
    public final /* synthetic */ boolean f2314f;

    /* renamed from: g */
    public final /* synthetic */ Object f2315g;

    /* renamed from: h */
    public final /* synthetic */ Object f2316h;

    public /* synthetic */ C0698a3(View view, boolean z7, InterfaceC2425y0 interfaceC2425y0) {
        this.f2313e = 2;
        this.f2315g = view;
        this.f2314f = z7;
        this.f2316h = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean z7;
        switch (this.f2313e) {
            case 0:
                List list = (List) this.f2315g;
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f2316h;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (this.f2314f && list.size() > 1) {
                    interfaceC2425y0.setValue(bool);
                }
                return C1694m.f10482a;
            case 1:
                InterfaceC3279c interfaceC3279c = (InterfaceC3279c) this.f2315g;
                EnumC0748bl enumC0748bl = (EnumC0748bl) this.f2316h;
                ((Boolean) obj).booleanValue();
                if (this.f2314f) {
                    interfaceC3279c.mo23f(enumC0748bl);
                }
                return C1694m.f10482a;
            default:
                View view = (View) this.f2315g;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f2316h;
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                boolean keepScreenOn = view.getKeepScreenOn();
                if (((Boolean) interfaceC2425y02.getValue()).booleanValue() && this.f2314f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                view.setKeepScreenOn(z7);
                return new C1308tj(view, keepScreenOn);
        }
    }

    public /* synthetic */ C0698a3(boolean z7, Object obj, Object obj2, int i7) {
        this.f2313e = i7;
        this.f2314f = z7;
        this.f2315g = obj;
        this.f2316h = obj2;
    }
}
