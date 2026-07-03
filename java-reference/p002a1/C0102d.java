package p002a1;

import p001a0.C0019e1;
import p117p1.C2862m;
import p139s1.AbstractC3088a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p158u5.C3374q;
import p162v1.EnumC3483a2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a1.d */
/* loaded from: classes.dex */
public final class C0102d extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f471f = 0;

    /* renamed from: g */
    public final /* synthetic */ C3374q f472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102d(C0019e1 c0019e1, C0103e c0103e, C3374q c3374q) {
        super(1);
        this.f472g = c3374q;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f471f) {
            case 0:
                C0103e c0103e = (C0103e) obj;
                if (!c0103e.f18005r) {
                    return EnumC3483a2.f16783f;
                }
                if (c0103e.f474t != null) {
                    AbstractC3088a.m4750b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                c0103e.f474t = null;
                C3374q c3374q = this.f472g;
                c3374q.f16446e = c3374q.f16446e;
                return EnumC3483a2.f16782e;
            default:
                if (((C2862m) obj).f15000t) {
                    this.f472g.f16446e = false;
                    return EnumC3483a2.f16784g;
                }
                return EnumC3483a2.f16782e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0102d(C3374q c3374q) {
        super(1);
        this.f472g = c3374q;
    }
}
