package p034e0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p027d1.C0464b;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p035e1.C0677s;
import p053g5.C1694m;
import p054g6.C1698b;
import p054g6.C1700c;
import p054g6.C1710k;
import p054g6.InterfaceC1704e;
import p056h0.AbstractC1742p;
import p056h0.AbstractC1746t;
import p056h0.C1727a;
import p056h0.C1732f;
import p056h0.C1738l;
import p056h0.C1740n;
import p056h0.C1748v;
import p060h5.AbstractC1793a0;
import p061h6.AbstractC1821c;
import p061h6.C1819a;
import p063i0.C1868c7;
import p071j0.C2123e0;
import p071j0.C2125f0;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p090l5.EnumC2465a;
import p100n.C2635d;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p137s.InterfaceC3085n;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p158u5.C3377t;
import p158u5.C3379v;
import p162v1.AbstractC3498f;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.d0 */
/* loaded from: classes.dex */
public final class C0600d0 implements InterfaceC1704e {

    /* renamed from: e */
    public final /* synthetic */ int f1973e;

    /* renamed from: f */
    public final /* synthetic */ Object f1974f;

    /* renamed from: g */
    public final /* synthetic */ Object f1975g;

    public /* synthetic */ C0600d0(int i7, Object obj, Object obj2) {
        this.f1973e = i7;
        this.f1974f = obj;
        this.f1975g = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        C1698b c1698b;
        int i7;
        C1710k c1710k;
        Object obj2;
        int i8;
        C0600d0 c0600d0;
        C2123e0 c2123e0;
        int i9;
        InterfaceC3079h interfaceC3079h;
        switch (this.f1973e) {
            case 0:
                long j6 = ((C0464b) obj).f1623a;
                C2635d c2635d = (C2635d) this.f1974f;
                boolean m5815x = AbstractC3784a.m5815x(((C0464b) c2635d.m4206d()).f1623a);
                C1694m c1694m = C1694m.f10482a;
                if (m5815x && AbstractC3784a.m5815x(j6) && C0464b.m1009e(((C0464b) c2635d.m4206d()).f1623a) != C0464b.m1009e(j6)) {
                    AbstractC0525d0.m1141s((InterfaceC0516a0) this.f1975g, null, new C0598c0(c2635d, j6, null, 0), 3);
                    return c1694m;
                }
                Object m4207e = c2635d.m4207e(new C0464b(j6), interfaceC2313c);
                if (m4207e == EnumC2465a.f13750e) {
                    return m4207e;
                }
                return c1694m;
            case 1:
                C3379v c3379v = (C3379v) this.f1974f;
                if (interfaceC2313c instanceof C1698b) {
                    c1698b = (C1698b) interfaceC2313c;
                    int i10 = c1698b.f10491j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1698b.f10491j = i10 - Integer.MIN_VALUE;
                        Object obj3 = c1698b.f10489h;
                        i7 = c1698b.f10491j;
                        C1694m c1694m2 = C1694m.f10482a;
                        if (i7 == 0) {
                            if (i7 == 1) {
                                AbstractC1793a0.m2972L(obj3);
                                return c1694m2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj3);
                        Object obj4 = c3379v.f16451e;
                        if (obj4 == AbstractC1821c.f10872b || !AbstractC3367j.m5096a(obj4, obj)) {
                            c3379v.f16451e = obj;
                            InterfaceC1704e interfaceC1704e = (InterfaceC1704e) this.f1975g;
                            c1698b.f10491j = 1;
                            Object mo160h = interfaceC1704e.mo160h(obj, c1698b);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (mo160h == enumC2465a) {
                                return enumC2465a;
                            }
                            return c1694m2;
                        }
                        return c1694m2;
                    }
                }
                c1698b = new C1698b(this, interfaceC2313c);
                Object obj32 = c1698b.f10489h;
                i7 = c1698b.f10491j;
                C1694m c1694m22 = C1694m.f10482a;
                if (i7 == 0) {
                }
                break;
            case 2:
                if (interfaceC2313c instanceof C1710k) {
                    c1710k = (C1710k) interfaceC2313c;
                    int i11 = c1710k.f10526j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c1710k.f10526j = i11 - Integer.MIN_VALUE;
                        obj2 = c1710k.f10525i;
                        i8 = c1710k.f10526j;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                obj = c1710k.f10528l;
                                c0600d0 = c1710k.f10524h;
                                AbstractC1793a0.m2972L(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj2);
                            InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f1974f;
                            c1710k.f10524h = this;
                            c1710k.f10528l = obj;
                            c1710k.f10526j = 1;
                            obj2 = interfaceC3281e.mo22d(obj, c1710k);
                            EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                            if (obj2 != enumC2465a2) {
                                c0600d0 = this;
                            } else {
                                return enumC2465a2;
                            }
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            return C1694m.f10482a;
                        }
                        ((C3379v) c0600d0.f1975g).f16451e = obj;
                        throw new C1819a(c0600d0);
                    }
                }
                c1710k = new C1710k(this, interfaceC2313c);
                obj2 = c1710k.f10525i;
                i8 = c1710k.f10526j;
                if (i8 == 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
            case 3:
                InterfaceC3079h interfaceC3079h2 = (InterfaceC3079h) obj;
                C1727a c1727a = (C1727a) this.f1974f;
                if (interfaceC3079h2 instanceof C3083l) {
                    C3083l c3083l = (C3083l) interfaceC3079h2;
                    C1738l c1738l = c1727a.f10578l;
                    if (c1738l == null) {
                        c1738l = AbstractC1746t.m2798a(c1727a.f10577k);
                        c1727a.f10578l = c1738l;
                    }
                    C1740n m2791a = c1738l.m2791a(c1727a);
                    m2791a.m2793b(c3083l, c1727a.f10573g, c1727a.f10581o, c1727a.f10582p, ((C0677s) c1727a.f10575i.getValue()).f2211a, ((C1732f) c1727a.f10576j.getValue()).f10594d, c1727a.f10583q);
                    c1727a.f10579m.setValue(m2791a);
                } else if (interfaceC3079h2 instanceof C3084m) {
                    C1740n c1740n = (C1740n) c1727a.f10579m.getValue();
                    if (c1740n != null) {
                        c1740n.m2795d();
                    }
                } else if (interfaceC3079h2 instanceof C3082k) {
                    C1740n c1740n2 = (C1740n) c1727a.f10579m.getValue();
                    if (c1740n2 != null) {
                        c1740n2.m2795d();
                    }
                } else {
                    c1727a.f10572f.m2801b(interfaceC3079h2, (InterfaceC0516a0) this.f1975g);
                }
                return C1694m.f10482a;
            case 4:
                InterfaceC3079h interfaceC3079h3 = (InterfaceC3079h) obj;
                AbstractC1742p abstractC1742p = (AbstractC1742p) this.f1974f;
                if (interfaceC3079h3 instanceof InterfaceC3085n) {
                    if (abstractC1742p.f10630A) {
                        abstractC1742p.m2797M0((InterfaceC3085n) interfaceC3079h3);
                    } else {
                        abstractC1742p.f10631B.m3556a(interfaceC3079h3);
                    }
                } else {
                    InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f1975g;
                    C1748v c1748v = abstractC1742p.f10637x;
                    if (c1748v == null) {
                        c1748v = new C1748v(abstractC1742p.f10636w, abstractC1742p.f10633t);
                        AbstractC3498f.m5373m(abstractC1742p);
                        abstractC1742p.f10637x = c1748v;
                    }
                    c1748v.m2801b(interfaceC3079h3, interfaceC0516a0);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                InterfaceC3079h interfaceC3079h4 = (InterfaceC3079h) obj;
                C3377t c3377t = (C3377t) this.f1974f;
                boolean z7 = true;
                if (interfaceC3079h4 instanceof C3083l) {
                    c3377t.f16449e++;
                } else if (interfaceC3079h4 instanceof C3084m) {
                    c3377t.f16449e--;
                } else if (interfaceC3079h4 instanceof C3082k) {
                    c3377t.f16449e--;
                }
                if (c3377t.f16449e <= 0) {
                    z7 = false;
                }
                C1868c7 c1868c7 = (C1868c7) this.f1975g;
                if (c1868c7.f11025u != z7) {
                    c1868c7.f11025u = z7;
                    AbstractC3498f.m5374n(c1868c7);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                C2125f0 c2125f0 = (C2125f0) this.f1975g;
                LinkedHashMap linkedHashMap = c2125f0.f12426b;
                if (interfaceC2313c instanceof C2123e0) {
                    c2123e0 = (C2123e0) interfaceC2313c;
                    int i12 = c2123e0.f12420i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2123e0.f12420i = i12 - Integer.MIN_VALUE;
                        Object obj5 = c2123e0.f12419h;
                        i9 = c2123e0.f12420i;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                AbstractC1793a0.m2972L(obj5);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj5);
                            InterfaceC1704e interfaceC1704e2 = (InterfaceC1704e) this.f1974f;
                            InterfaceC3079h interfaceC3079h5 = (InterfaceC3079h) obj;
                            if (interfaceC3079h5 instanceof C3083l) {
                                C3083l c3083l2 = new C3083l(C0464b.m1010f(((C3083l) interfaceC3079h5).f15681a, c2125f0.f12425a));
                                linkedHashMap.put(interfaceC3079h5, c3083l2);
                                interfaceC3079h = c3083l2;
                            } else if (interfaceC3079h5 instanceof C3082k) {
                                C3082k c3082k = (C3082k) interfaceC3079h5;
                                C3083l c3083l3 = (C3083l) linkedHashMap.remove(c3082k.f15680a);
                                interfaceC3079h = c3082k;
                                if (c3083l3 != null) {
                                    interfaceC3079h = new C3082k(c3083l3);
                                }
                            } else {
                                boolean z8 = interfaceC3079h5 instanceof C3084m;
                                interfaceC3079h = interfaceC3079h5;
                                if (z8) {
                                    C3084m c3084m = (C3084m) interfaceC3079h5;
                                    C3083l c3083l4 = (C3083l) linkedHashMap.remove(c3084m.f15682a);
                                    interfaceC3079h = c3084m;
                                    if (c3083l4 != null) {
                                        interfaceC3079h = new C3084m(c3083l4);
                                    }
                                }
                            }
                            c2123e0.f12420i = 1;
                            Object mo160h2 = interfaceC1704e2.mo160h(interfaceC3079h, c2123e0);
                            EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                            if (mo160h2 == enumC2465a3) {
                                return enumC2465a3;
                            }
                        }
                        return C1694m.f10482a;
                    }
                }
                c2123e0 = new C2123e0(this, interfaceC2313c);
                Object obj52 = c2123e0.f12419h;
                i9 = c2123e0.f12420i;
                if (i9 == 0) {
                }
                return C1694m.f10482a;
            default:
                InterfaceC3079h interfaceC3079h6 = (InterfaceC3079h) obj;
                ArrayList arrayList = (ArrayList) this.f1974f;
                if (interfaceC3079h6 instanceof C3075d) {
                    arrayList.add(interfaceC3079h6);
                } else if (interfaceC3079h6 instanceof C3076e) {
                    arrayList.remove(((C3076e) interfaceC3079h6).f15677a);
                }
                ((InterfaceC2425y0) this.f1975g).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return C1694m.f10482a;
        }
    }

    public C0600d0(C1700c c1700c, C3379v c3379v, InterfaceC1704e interfaceC1704e) {
        this.f1973e = 1;
        this.f1974f = c3379v;
        this.f1975g = interfaceC1704e;
    }
}
