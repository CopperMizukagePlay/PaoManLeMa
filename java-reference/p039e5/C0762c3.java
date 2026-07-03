package p039e5;

import p017c.C0323h;
import p017c.C0325j;
import p053g5.C1694m;
import p085l0.InterfaceC2425y0;
import p118p3.C2878c;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.c3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0762c3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f2963e;

    /* renamed from: f */
    public final /* synthetic */ boolean f2964f;

    /* renamed from: g */
    public final /* synthetic */ Object f2965g;

    public /* synthetic */ C0762c3(C0325j c0325j, boolean z7) {
        this.f2963e = 6;
        this.f2965g = c0325j;
        this.f2964f = z7;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f2963e) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f2965g;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y0.setValue(bool);
                }
                return C1694m.f10482a;
            case 1:
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) this.f2965g;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y02.setValue(bool2);
                }
                return C1694m.f10482a;
            case 2:
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) this.f2965g;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y03.setValue(bool3);
                }
                return C1694m.f10482a;
            case 3:
                InterfaceC2425y0 interfaceC2425y04 = (InterfaceC2425y0) this.f2965g;
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y04.setValue(bool4);
                }
                return C1694m.f10482a;
            case 4:
                InterfaceC2425y0 interfaceC2425y05 = (InterfaceC2425y0) this.f2965g;
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y05.setValue(bool5);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                InterfaceC2425y0 interfaceC2425y06 = (InterfaceC2425y0) this.f2965g;
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                if (this.f2964f) {
                    interfaceC2425y06.setValue(bool6);
                }
                return C1694m.f10482a;
            default:
                C0325j c0325j = (C0325j) this.f2965g;
                c0325j.m674a(this.f2964f);
                return new C0323h((C2878c) obj, c0325j);
        }
    }

    public /* synthetic */ C0762c3(boolean z7, InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f2963e = i7;
        this.f2964f = z7;
        this.f2965g = interfaceC2425y0;
    }
}
