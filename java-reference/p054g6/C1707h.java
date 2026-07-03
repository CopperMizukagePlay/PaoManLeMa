package p054g6;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import p001a0.C0062p0;
import p001a0.C0070r0;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p039e5.C0990jb;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p061h6.AbstractC1821c;
import p063i0.C1881e2;
import p069i6.AbstractC2088a;
import p071j0.C2134k;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p085l0.C2393o1;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p100n.C2643f1;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p150t5.InterfaceC3281e;
import p158u5.C3374q;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g6.h */
/* loaded from: classes.dex */
public final class C1707h implements InterfaceC1704e {

    /* renamed from: e */
    public final /* synthetic */ int f10515e;

    /* renamed from: f */
    public final Object f10516f;

    /* renamed from: g */
    public final Object f10517g;

    /* renamed from: h */
    public final Object f10518h;

    public /* synthetic */ C1707h(Object obj, Object obj2, Object obj3, int i7) {
        this.f10515e = i7;
        this.f10516f = obj;
        this.f10517g = obj2;
        this.f10518h = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        C1706g c1706g;
        Object obj2;
        int i7;
        C1707h c1707h;
        C2134k c2134k;
        int i8;
        C1707h c1707h2;
        boolean z7;
        switch (this.f10515e) {
            case 0:
                if (interfaceC2313c instanceof C1706g) {
                    c1706g = (C1706g) interfaceC2313c;
                    int i9 = c1706g.f10514l;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c1706g.f10514l = i9 - Integer.MIN_VALUE;
                        obj2 = c1706g.f10512j;
                        i7 = c1706g.f10514l;
                        C1694m c1694m = C1694m.f10482a;
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    obj = c1706g.f10511i;
                                    c1707h = c1706g.f10510h;
                                    AbstractC1793a0.m2972L(obj2);
                                }
                            }
                            AbstractC1793a0.m2972L(obj2);
                            return c1694m;
                        }
                        AbstractC1793a0.m2972L(obj2);
                        if (((C3374q) this.f10516f).f16446e) {
                            InterfaceC1704e interfaceC1704e = (InterfaceC1704e) this.f10517g;
                            c1706g.f10514l = 1;
                            if (interfaceC1704e.mo160h(obj, c1706g) != enumC2465a) {
                                return c1694m;
                            }
                        } else {
                            C0990jb c0990jb = (C0990jb) this.f10518h;
                            c1706g.f10510h = this;
                            c1706g.f10511i = obj;
                            c1706g.f10514l = 2;
                            obj2 = c0990jb.mo22d(obj, c1706g);
                            if (obj2 != enumC2465a) {
                                c1707h = this;
                            }
                        }
                        return enumC2465a;
                        if (((Boolean) obj2).booleanValue()) {
                            ((C3374q) c1707h.f10516f).f16446e = true;
                            InterfaceC1704e interfaceC1704e2 = (InterfaceC1704e) c1707h.f10517g;
                            c1706g.f10510h = null;
                            c1706g.f10511i = null;
                            c1706g.f10514l = 3;
                            if (interfaceC1704e2.mo160h(obj, c1706g) != enumC2465a) {
                                return c1694m;
                            }
                            return enumC2465a;
                        }
                        return c1694m;
                    }
                }
                c1706g = new C1706g(this, interfaceC2313c);
                obj2 = c1706g.f10512j;
                i7 = c1706g.f10514l;
                C1694m c1694m2 = C1694m.f10482a;
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (i7 == 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case 1:
                Object m3094a = AbstractC1821c.m3094a((InterfaceC2318h) this.f10516f, obj, this.f10517g, (C0062p0) this.f10518h, interfaceC2313c);
                if (m3094a != EnumC2465a.f13750e) {
                    return C1694m.f10482a;
                }
                return m3094a;
            case 2:
                InterfaceC3079h interfaceC3079h = (InterfaceC3079h) obj;
                ArrayList arrayList = (ArrayList) this.f10516f;
                if (interfaceC3079h instanceof C3077f) {
                    arrayList.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3078g) {
                    arrayList.remove(((C3078g) interfaceC3079h).f15678a);
                } else if (interfaceC3079h instanceof C3075d) {
                    arrayList.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3076e) {
                    arrayList.remove(((C3076e) interfaceC3079h).f15677a);
                } else if (interfaceC3079h instanceof C3083l) {
                    arrayList.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3084m) {
                    arrayList.remove(((C3084m) interfaceC3079h).f15682a);
                } else if (interfaceC3079h instanceof C3082k) {
                    arrayList.remove(((C3082k) interfaceC3079h).f15680a);
                }
                AbstractC0525d0.m1141s((InterfaceC0516a0) this.f10517g, null, new C0062p0((C1881e2) this.f10518h, (InterfaceC3079h) AbstractC1805m.m3053q0(arrayList), (InterfaceC2313c) null, 24), 3);
                return C1694m.f10482a;
            case 3:
                if (interfaceC2313c instanceof C2134k) {
                    c2134k = (C2134k) interfaceC2313c;
                    int i10 = c2134k.f12449l;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2134k.f12449l = i10 - Integer.MIN_VALUE;
                        Object obj3 = c2134k.f12447j;
                        i8 = c2134k.f12449l;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                obj = c2134k.f12446i;
                                c1707h2 = c2134k.f12445h;
                                AbstractC1793a0.m2972L(obj3);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj3);
                            InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) ((C3379v) this.f10516f).f16451e;
                            if (interfaceC0520b1 != null) {
                                interfaceC0520b1.mo1114c(new CancellationException());
                                c2134k.f12445h = this;
                                c2134k.f12446i = obj;
                                c2134k.f12449l = 1;
                                Object mo1116s = interfaceC0520b1.mo1116s(c2134k);
                                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                                if (mo1116s == enumC2465a3) {
                                    return enumC2465a3;
                                }
                            }
                            c1707h2 = this;
                        }
                        C3379v c3379v = (C3379v) c1707h2.f10516f;
                        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) c1707h2.f10517g;
                        c3379v.f16451e = AbstractC0525d0.m1141s(interfaceC0516a0, null, new C0070r0((InterfaceC3281e) c1707h2.f10518h, obj, interfaceC0516a0, (InterfaceC2313c) null), 1);
                        return C1694m.f10482a;
                    }
                }
                c2134k = new C2134k(this, interfaceC2313c);
                Object obj32 = c2134k.f12447j;
                i8 = c2134k.f12449l;
                if (i8 == 0) {
                }
                C3379v c3379v2 = (C3379v) c1707h2.f10516f;
                InterfaceC0516a0 interfaceC0516a02 = (InterfaceC0516a0) c1707h2.f10517g;
                c3379v2.f16451e = AbstractC0525d0.m1141s(interfaceC0516a02, null, new C0070r0((InterfaceC3281e) c1707h2.f10518h, obj, interfaceC0516a02, (InterfaceC2313c) null), 1);
                return C1694m.f10482a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C2643f1 c2643f1 = (C2643f1) this.f10517g;
                C2393o1 c2393o1 = (C2393o1) this.f10516f;
                if (booleanValue) {
                    z7 = ((Boolean) ((InterfaceC3281e) ((InterfaceC2425y0) this.f10518h).getValue()).mo22d(c2643f1.m4238c(), c2643f1.f14308d.getValue())).booleanValue();
                } else {
                    z7 = false;
                }
                c2393o1.setValue(Boolean.valueOf(z7));
                return C1694m.f10482a;
        }
    }

    public C1707h(InterfaceC1704e interfaceC1704e, InterfaceC2318h interfaceC2318h) {
        this.f10515e = 1;
        this.f10516f = interfaceC2318h;
        this.f10517g = AbstractC2088a.m3440k(interfaceC2318h);
        this.f10518h = new C0062p0(interfaceC1704e, null, 20);
    }
}
