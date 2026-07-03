package p039e5;

import android.content.Context;
import java.util.List;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ws */
/* loaded from: classes.dex */
public final class C1410ws extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f8522i;

    /* renamed from: j */
    public int f8523j;

    /* renamed from: k */
    public final /* synthetic */ C0883ft f8524k;

    /* renamed from: l */
    public final /* synthetic */ Context f8525l;

    /* renamed from: m */
    public final /* synthetic */ List f8526m;

    /* renamed from: n */
    public final /* synthetic */ C1224qs f8527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1410ws(C0883ft c0883ft, Context context, List list, C1224qs c1224qs, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f8522i = i7;
        this.f8524k = c0883ft;
        this.f8525l = context;
        this.f8526m = list;
        this.f8527n = c1224qs;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f8522i) {
            case 0:
                return ((C1410ws) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1410ws) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f8522i) {
            case 0:
                return new C1410ws(this.f8524k, this.f8525l, this.f8526m, this.f8527n, interfaceC2313c, 0);
            default:
                return new C1410ws(this.f8524k, this.f8525l, this.f8526m, this.f8527n, interfaceC2313c, 1);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f8522i) {
            case 0:
                int i7 = this.f8523j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f8523j = 1;
                    Object m1530c = C0883ft.m1530c(this.f8524k, this.f8525l, this.f8526m, this.f8527n, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1530c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f8523j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f8523j = 1;
                    Object m1528a = C0883ft.m1528a(this.f8524k, this.f8525l, this.f8526m, this.f8527n, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m1528a == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }
}
