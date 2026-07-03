package p061h6;

import p001a0.C0069r;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.InterfaceC1702d;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h6.h */
/* loaded from: classes.dex */
public final class C1826h extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f10881i = 0;

    /* renamed from: j */
    public int f10882j;

    /* renamed from: k */
    public /* synthetic */ Object f10883k;

    /* renamed from: l */
    public final /* synthetic */ C1828j f10884l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC1704e f10885m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826h(C1828j c1828j, InterfaceC1704e interfaceC1704e, Object obj, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f10884l = c1828j;
        this.f10885m = interfaceC1704e;
        this.f10883k = obj;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f10881i) {
            case 0:
                return ((C1826h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1826h) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10881i) {
            case 0:
                return new C1826h(this.f10884l, this.f10885m, this.f10883k, interfaceC2313c);
            default:
                C1826h c1826h = new C1826h(this.f10884l, this.f10885m, interfaceC2313c);
                c1826h.f10883k = obj;
                return c1826h;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [m5.j, t5.f] */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    public final Object mo29m(Object obj) {
        switch (this.f10881i) {
            case 0:
                int i7 = this.f10882j;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    ?? r9 = this.f10884l.f10891i;
                    Object obj2 = this.f10883k;
                    this.f10882j = 1;
                    Object mo24c = r9.mo24c(this.f10885m, obj2, this);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (mo24c == enumC2465a) {
                        return enumC2465a;
                    }
                }
                return C1694m.f10482a;
            default:
                int i8 = this.f10882j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f10883k;
                    Object obj3 = new Object();
                    C1828j c1828j = this.f10884l;
                    InterfaceC1702d interfaceC1702d = c1828j.f10880h;
                    C0069r c0069r = new C0069r(obj3, interfaceC0516a0, c1828j, this.f10885m, 1);
                    this.f10882j = 1;
                    Object mo35f = interfaceC1702d.mo35f(c0069r, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo35f == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826h(C1828j c1828j, InterfaceC1704e interfaceC1704e, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f10884l = c1828j;
        this.f10885m = interfaceC1704e;
    }
}
