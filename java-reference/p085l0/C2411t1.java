package p085l0;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p001a0.C0068q2;
import p032d6.C0548l;
import p039e5.C1304tf;
import p053g5.C1687f;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p077k.AbstractC2204m0;
import p077k.AbstractC2212q0;
import p077k.C2184c0;
import p077k.C2194h0;
import p077k.C2196i0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p101n0.C2701a;
import p101n0.C2707g;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.t1 */
/* loaded from: classes.dex */
public final class C2411t1 extends AbstractC2590j implements InterfaceC3282f {

    /* renamed from: i */
    public List f13559i;

    /* renamed from: j */
    public List f13560j;

    /* renamed from: k */
    public List f13561k;

    /* renamed from: l */
    public C2196i0 f13562l;

    /* renamed from: m */
    public C2196i0 f13563m;

    /* renamed from: n */
    public C2196i0 f13564n;

    /* renamed from: o */
    public Set f13565o;

    /* renamed from: p */
    public C2196i0 f13566p;

    /* renamed from: q */
    public int f13567q;

    /* renamed from: r */
    public /* synthetic */ InterfaceC2416v0 f13568r;

    /* renamed from: s */
    public final /* synthetic */ C2414u1 f13569s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2411t1(C2414u1 c2414u1, InterfaceC2313c interfaceC2313c) {
        super(3, interfaceC2313c);
        this.f13569s = c2414u1;
    }

    /* renamed from: q */
    public static final void m3911q(C2414u1 c2414u1, List list, List list2, List list3, C2196i0 c2196i0, C2196i0 c2196i02, C2196i0 c2196i03, C2196i0 c2196i04) {
        char c7;
        long j6;
        long j7;
        synchronized (c2414u1.f13580b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C2415v c2415v = (C2415v) list3.get(i7);
                    c2415v.m3927a();
                    c2414u1.m3918C(c2415v);
                }
                list3.clear();
                Object[] objArr = c2196i0.f12685b;
                long[] jArr = c2196i0.f12684a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    j6 = 255;
                    while (true) {
                        long j8 = jArr[i8];
                        c7 = 7;
                        j7 = -9187201950435737472L;
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j8 & 255) < 128) {
                                    C2415v c2415v2 = (C2415v) objArr[(i8 << 3) + i10];
                                    c2415v2.m3927a();
                                    c2414u1.m3918C(c2415v2);
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    c7 = 7;
                    j6 = 255;
                    j7 = -9187201950435737472L;
                }
                c2196i0.m3600b();
                Object[] objArr2 = c2196i02.f12685b;
                long[] jArr2 = c2196i02.f12684a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j9 = jArr2[i11];
                        if ((((~j9) << c7) & j9 & j7) != j7) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j9 & j6) < 128) {
                                    ((C2415v) objArr2[(i11 << 3) + i13]).m3933g();
                                }
                                j9 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length2) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                c2196i02.m3600b();
                c2196i03.m3600b();
                Object[] objArr3 = c2196i04.f12685b;
                long[] jArr3 = c2196i04.f12684a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j10 = jArr3[i14];
                        if ((((~j10) << c7) & j10 & j7) != j7) {
                            int i15 = 8 - ((~(i14 - length3)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j10 & j6) < 128) {
                                    C2415v c2415v3 = (C2415v) objArr3[(i14 << 3) + i16];
                                    c2415v3.m3927a();
                                    c2414u1.m3918C(c2415v3);
                                }
                                j10 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length3) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                }
                c2196i04.m3600b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: s */
    public static final void m3912s(List list, C2414u1 c2414u1) {
        list.clear();
        synchronized (c2414u1.f13580b) {
            try {
                ArrayList arrayList = c2414u1.f13588j;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((AbstractC2422x0) arrayList.get(i7));
                }
                c2414u1.f13588j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        C2411t1 c2411t1 = new C2411t1(this.f13569s, (InterfaceC2313c) obj3);
        c2411t1.f13568r = (InterfaceC2416v0) obj2;
        c2411t1.mo29m(C1694m.f10482a);
        return EnumC2465a.f13750e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0125 -> B:6:0x012d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c5 -> B:20:0x0094). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC2416v0 interfaceC2416v0;
        C2196i0 c2196i0;
        C2196i0 c2196i02;
        List list;
        Set set;
        List list2;
        C2196i0 c2196i03;
        List list3;
        C2196i0 c2196i04;
        List list4;
        C2196i0 c2196i05;
        List list5;
        C2196i0 c2196i06;
        C2414u1 c2414u1;
        Object obj2;
        C0548l c0548l;
        EnumC2465a enumC2465a;
        InterfaceC2416v0 interfaceC2416v02;
        C2184c0 c2184c0;
        C2411t1 c2411t1 = this;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        int i7 = c2411t1.f13567q;
        int i8 = 2;
        int i9 = 1;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    C2196i0 c2196i07 = c2411t1.f13566p;
                    set = c2411t1.f13565o;
                    c2196i03 = c2411t1.f13564n;
                    c2196i04 = c2411t1.f13563m;
                    c2196i0 = c2411t1.f13562l;
                    list3 = c2411t1.f13561k;
                    list2 = c2411t1.f13560j;
                    list = c2411t1.f13559i;
                    InterfaceC2416v0 interfaceC2416v03 = c2411t1.f13568r;
                    AbstractC1793a0.m2972L(obj);
                    c2196i02 = c2196i07;
                    interfaceC2416v0 = interfaceC2416v03;
                    C2414u1 c2414u12 = c2411t1.f13569s;
                    synchronized (c2414u12.f13580b) {
                        try {
                            if (c2414u12.f13589k.m3595j()) {
                                C2184c0 m4298b = C2701a.m4298b(c2414u12.f13589k);
                                c2414u12.f13589k.m3586a();
                                C0068q2 c0068q2 = c2414u12.f13590l;
                                ((C2194h0) c0068q2.f344f).m3586a();
                                ((C2194h0) c0068q2.f345g).m3586a();
                                c2414u12.f13592n.m3586a();
                                c2184c0 = new C2184c0(m4298b.f12629b);
                                Object[] objArr = m4298b.f12628a;
                                int i10 = m4298b.f12629b;
                                enumC2465a = enumC2465a2;
                                int i11 = 0;
                                while (i11 < i10) {
                                    int i12 = i11;
                                    AbstractC2422x0 abstractC2422x0 = (AbstractC2422x0) objArr[i11];
                                    c2184c0.m3556a(new C1687f(abstractC2422x0, c2414u12.f13591m.m3592g(abstractC2422x0)));
                                    i11 = i12 + 1;
                                    interfaceC2416v0 = interfaceC2416v0;
                                }
                                interfaceC2416v02 = interfaceC2416v0;
                                c2414u12.f13591m.m3586a();
                            } else {
                                enumC2465a = enumC2465a2;
                                interfaceC2416v02 = interfaceC2416v0;
                                c2184c0 = AbstractC2204m0.f12713b;
                                AbstractC3367j.m5098c(c2184c0, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Object[] objArr2 = c2184c0.f12628a;
                    int i13 = c2184c0.f12629b;
                    for (int i14 = 0; i14 < i13; i14++) {
                        C1687f c1687f = (C1687f) objArr2[i14];
                    }
                    i8 = 2;
                    i9 = 1;
                    c2411t1 = this;
                    enumC2465a2 = enumC2465a;
                    interfaceC2416v0 = interfaceC2416v02;
                    synchronized (c2411t1.f13569s.f13580b) {
                    }
                    C2414u1 c2414u13 = c2411t1.f13569s;
                    c2411t1.f13568r = interfaceC2416v0;
                    c2411t1.f13559i = list;
                    c2411t1.f13560j = list2;
                    c2411t1.f13561k = list3;
                    c2411t1.f13562l = c2196i0;
                    c2411t1.f13563m = c2196i04;
                    c2411t1.f13564n = c2196i03;
                    c2411t1.f13565o = set;
                    c2411t1.f13566p = c2196i02;
                    c2411t1.f13567q = i9;
                    if (!c2414u13.m3922v()) {
                        C0548l c0548l2 = new C0548l(i9, AbstractC2064e.m3250x(c2411t1));
                        c0548l2.m1222u();
                        synchronized (c2414u13.f13580b) {
                            if (c2414u13.m3922v()) {
                                c0548l = c0548l2;
                            } else {
                                c2414u13.f13595q = c0548l2;
                                c0548l = null;
                            }
                        }
                        if (c0548l != null) {
                            c0548l.mo663n(C1694m.f10482a);
                        }
                        obj2 = c0548l2.m1221t();
                        if (obj2 != EnumC2465a.f13750e) {
                            obj2 = C1694m.f10482a;
                        }
                    } else {
                        obj2 = C1694m.f10482a;
                    }
                    if (obj2 != enumC2465a2) {
                        List list6 = list;
                        c2196i05 = c2196i0;
                        c2196i06 = c2196i02;
                        list4 = list3;
                        list5 = list6;
                        Set set2 = set;
                        C2196i0 c2196i08 = c2196i04;
                        C2196i0 c2196i09 = c2196i03;
                        c2414u1 = c2411t1.f13569s;
                        C1701c0 c1701c0 = C2414u1.f13577x;
                        if (!c2414u1.m3917B()) {
                            C1304tf c1304tf = new C1304tf(c2411t1.f13569s, c2196i09, c2196i06, list5, list2, c2196i05, list4, c2196i08, set2);
                            c2411t1.f13568r = interfaceC2416v0;
                            c2411t1.f13559i = list5;
                            c2411t1.f13560j = list2;
                            c2411t1.f13561k = list4;
                            c2411t1.f13562l = c2196i05;
                            c2411t1.f13563m = c2196i08;
                            c2411t1.f13564n = c2196i09;
                            c2411t1.f13565o = set2;
                            c2411t1.f13566p = c2196i06;
                            c2411t1.f13567q = i8;
                            if (interfaceC2416v0.mo3790m(c1304tf, c2411t1) != enumC2465a2) {
                                List list7 = list4;
                                c2196i02 = c2196i06;
                                c2196i0 = c2196i05;
                                list = list5;
                                list3 = list7;
                                c2196i03 = c2196i09;
                                c2196i04 = c2196i08;
                                set = set2;
                                C2414u1 c2414u122 = c2411t1.f13569s;
                                synchronized (c2414u122.f13580b) {
                                }
                            }
                        } else {
                            List list8 = list4;
                            c2196i02 = c2196i06;
                            c2196i0 = c2196i05;
                            list = list5;
                            list3 = list8;
                            c2411t1 = this;
                            c2196i03 = c2196i09;
                            c2196i04 = c2196i08;
                            set = set2;
                            synchronized (c2411t1.f13569s.f13580b) {
                            }
                        }
                    }
                    return enumC2465a2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2196i0 c2196i010 = c2411t1.f13566p;
            set = c2411t1.f13565o;
            c2196i03 = c2411t1.f13564n;
            c2196i04 = c2411t1.f13563m;
            C2196i0 c2196i011 = c2411t1.f13562l;
            List list9 = c2411t1.f13561k;
            list2 = c2411t1.f13560j;
            List list10 = c2411t1.f13559i;
            InterfaceC2416v0 interfaceC2416v04 = c2411t1.f13568r;
            AbstractC1793a0.m2972L(obj);
            c2196i06 = c2196i010;
            interfaceC2416v0 = interfaceC2416v04;
            list4 = list9;
            list5 = list10;
            c2196i05 = c2196i011;
            Set set22 = set;
            C2196i0 c2196i082 = c2196i04;
            C2196i0 c2196i092 = c2196i03;
            c2414u1 = c2411t1.f13569s;
            C1701c0 c1701c02 = C2414u1.f13577x;
            if (!c2414u1.m3917B()) {
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC2416v0 = c2411t1.f13568r;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i15 = AbstractC2212q0.f12726a;
            c2196i0 = new C2196i0();
            C2196i0 c2196i012 = new C2196i0();
            C2196i0 c2196i013 = new C2196i0();
            C2707g c2707g = new C2707g(c2196i013);
            c2196i02 = new C2196i0();
            list = arrayList;
            set = c2707g;
            list2 = arrayList2;
            c2196i03 = c2196i013;
            list3 = arrayList3;
            c2196i04 = c2196i012;
            synchronized (c2411t1.f13569s.f13580b) {
            }
        }
    }
}
