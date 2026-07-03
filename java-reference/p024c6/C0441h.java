package p024c6;

import java.io.Serializable;
import java.util.regex.Matcher;
import p015b6.C0306m;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p117p1.AbstractC2866q;
import p117p1.C2855g0;
import p117p1.C2859j;
import p117p1.C2867r;
import p117p1.C2868s;
import p117p1.EnumC2860k;
import p122q.AbstractC2963z;
import p150t5.InterfaceC3281e;
import p158u5.C3379v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.h */
/* loaded from: classes.dex */
public final class C0441h extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public final /* synthetic */ int f1501g;

    /* renamed from: h */
    public int f1502h;

    /* renamed from: i */
    public int f1503i;

    /* renamed from: j */
    public /* synthetic */ Object f1504j;

    /* renamed from: k */
    public Object f1505k;

    /* renamed from: l */
    public final /* synthetic */ Serializable f1506l;

    /* renamed from: m */
    public final /* synthetic */ Serializable f1507m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0441h(Serializable serializable, Serializable serializable2, InterfaceC2313c interfaceC2313c, int i7) {
        super(interfaceC2313c);
        this.f1501g = i7;
        this.f1506l = serializable;
        this.f1507m = serializable2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f1501g) {
            case 0:
                return ((C0441h) mo28k((C0306m) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C0441h) mo28k((C2855g0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f1501g) {
            case 0:
                C0441h c0441h = new C0441h((C0442i) this.f1506l, (String) this.f1507m, interfaceC2313c, 0);
                c0441h.f1504j = obj;
                return c0441h;
            default:
                C0441h c0441h2 = new C0441h((C3379v) this.f1506l, (C3379v) this.f1507m, interfaceC2313c, 1);
                c0441h2.f1504j = obj;
                return c0441h2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:8:0x00c8). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C0306m c0306m;
        Matcher matcher;
        int i7;
        int i8;
        C2855g0 c2855g0;
        int i9;
        Object obj2;
        int size;
        int i10;
        int size2;
        int i11;
        EnumC2465a enumC2465a;
        Object m4514a;
        EnumC2465a enumC2465a2;
        Object obj3;
        Object obj4;
        switch (this.f1501g) {
            case 0:
                String str = (String) this.f1507m;
                int i12 = this.f1503i;
                EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                if (i12 != 0) {
                    C1694m c1694m = C1694m.f10482a;
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            int i13 = this.f1502h;
                            matcher = (Matcher) this.f1505k;
                            c0306m = (C0306m) this.f1504j;
                            AbstractC1793a0.m2972L(obj);
                            i7 = matcher.end();
                            i8 = i13 + 1;
                            if (i8 == -1 || !matcher.find()) {
                                String obj5 = str.subSequence(i7, str.length()).toString();
                                this.f1504j = null;
                                this.f1505k = null;
                                this.f1503i = 3;
                                c0306m.m661b(obj5, this);
                                return enumC2465a3;
                            }
                        }
                    }
                    AbstractC1793a0.m2972L(obj);
                    return c1694m;
                }
                AbstractC1793a0.m2972L(obj);
                c0306m = (C0306m) this.f1504j;
                matcher = ((C0442i) this.f1506l).f1508e.matcher(str);
                if (!matcher.find()) {
                    String obj6 = str.toString();
                    this.f1503i = 1;
                    c0306m.m661b(obj6, this);
                    return enumC2465a3;
                }
                i7 = 0;
                i8 = 0;
                String obj7 = str.subSequence(i7, matcher.start()).toString();
                this.f1504j = c0306m;
                this.f1505k = matcher;
                this.f1502h = i8;
                this.f1503i = 2;
                c0306m.m661b(obj7, this);
                return enumC2465a3;
            default:
                C3379v c3379v = (C3379v) this.f1507m;
                C3379v c3379v2 = (C3379v) this.f1506l;
                int i14 = this.f1503i;
                Object obj8 = null;
                int i15 = 1;
                EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            i9 = this.f1502h;
                            C2859j c2859j = (C2859j) this.f1505k;
                            C2855g0 c2855g02 = (C2855g0) this.f1504j;
                            AbstractC1793a0.m2972L(obj);
                            m4514a = obj;
                            enumC2465a2 = enumC2465a4;
                            ?? r52 = ((C2859j) m4514a).f14991a;
                            int size3 = r52.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size3) {
                                    if (((C2868s) r52.get(i16)).m4551b()) {
                                        i9 = 1;
                                    } else {
                                        i16++;
                                    }
                                }
                            }
                            boolean m4606d = AbstractC2963z.m4606d(c2859j, ((C2868s) c3379v2.f16451e).f15006a);
                            ?? r7 = c2859j.f14991a;
                            if (!m4606d) {
                                int size4 = r7.size();
                                int i17 = 0;
                                while (true) {
                                    if (i17 < size4) {
                                        obj4 = r7.get(i17);
                                        if (!((C2868s) obj4).f15009d) {
                                            i17++;
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                C2868s c2868s = (C2868s) obj4;
                                if (c2868s != null) {
                                    c3379v2.f16451e = c2868s;
                                    c3379v.f16451e = c2868s;
                                } else {
                                    enumC2465a4 = enumC2465a2;
                                    c2855g0 = c2855g02;
                                    i9 = 1;
                                    obj8 = null;
                                    i15 = 1;
                                    if (i9 == 0) {
                                        this.f1504j = c2855g0;
                                        this.f1505k = obj8;
                                        this.f1502h = i9;
                                        this.f1503i = i15;
                                        obj2 = c2855g0.m4514a(EnumC2860k.f14996f, this);
                                        if (obj2 == enumC2465a4) {
                                            enumC2465a2 = enumC2465a4;
                                            return enumC2465a2;
                                        }
                                        C2859j c2859j2 = (C2859j) obj2;
                                        ?? r11 = c2859j2.f14991a;
                                        size = r11.size();
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < size) {
                                                if (AbstractC2866q.m4544c((C2868s) r11.get(i10))) {
                                                    i10++;
                                                }
                                            } else {
                                                i9 = i15;
                                            }
                                        }
                                        ?? r112 = c2859j2.f14991a;
                                        size2 = r112.size();
                                        i11 = 0;
                                        while (i11 < size2) {
                                            C2868s c2868s2 = (C2868s) r112.get(i11);
                                            if (!c2868s2.m4551b()) {
                                                enumC2465a = enumC2465a4;
                                                if (!AbstractC2866q.m4545d(c2868s2, c2855g0.f14969j.f14980C, c2855g0.m4516d())) {
                                                    i11++;
                                                    enumC2465a4 = enumC2465a;
                                                }
                                            } else {
                                                enumC2465a = enumC2465a4;
                                            }
                                            i9 = 1;
                                            this.f1504j = c2855g0;
                                            this.f1505k = c2859j2;
                                            this.f1502h = i9;
                                            this.f1503i = 2;
                                            m4514a = c2855g0.m4514a(EnumC2860k.f14997g, this);
                                            enumC2465a2 = enumC2465a;
                                            if (m4514a != enumC2465a2) {
                                                c2855g02 = c2855g0;
                                                c2859j = c2859j2;
                                                ?? r522 = ((C2859j) m4514a).f14991a;
                                                int size32 = r522.size();
                                                int i162 = 0;
                                                while (true) {
                                                    if (i162 < size32) {
                                                    }
                                                    i162++;
                                                }
                                                boolean m4606d2 = AbstractC2963z.m4606d(c2859j, ((C2868s) c3379v2.f16451e).f15006a);
                                                ?? r72 = c2859j.f14991a;
                                                if (!m4606d2) {
                                                    int size5 = r72.size();
                                                    int i18 = 0;
                                                    while (true) {
                                                        if (i18 < size5) {
                                                            obj3 = r72.get(i18);
                                                            if (!C2867r.m4548a(((C2868s) obj3).f15006a, ((C2868s) c3379v2.f16451e).f15006a)) {
                                                                i18++;
                                                            }
                                                        } else {
                                                            obj3 = null;
                                                        }
                                                    }
                                                    c3379v.f16451e = obj3;
                                                }
                                            }
                                            return enumC2465a2;
                                        }
                                        enumC2465a = enumC2465a4;
                                        this.f1504j = c2855g0;
                                        this.f1505k = c2859j2;
                                        this.f1502h = i9;
                                        this.f1503i = 2;
                                        m4514a = c2855g0.m4514a(EnumC2860k.f14997g, this);
                                        enumC2465a2 = enumC2465a;
                                        if (m4514a != enumC2465a2) {
                                        }
                                        return enumC2465a2;
                                    }
                                    return C1694m.f10482a;
                                }
                            }
                            enumC2465a4 = enumC2465a2;
                            c2855g0 = c2855g02;
                            obj8 = null;
                            i15 = 1;
                            if (i9 == 0) {
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i9 = this.f1502h;
                        c2855g0 = (C2855g0) this.f1504j;
                        AbstractC1793a0.m2972L(obj);
                        obj2 = obj;
                        C2859j c2859j22 = (C2859j) obj2;
                        ?? r113 = c2859j22.f14991a;
                        size = r113.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size) {
                            }
                            i10++;
                        }
                        ?? r1122 = c2859j22.f14991a;
                        size2 = r1122.size();
                        i11 = 0;
                        while (i11 < size2) {
                        }
                        enumC2465a = enumC2465a4;
                        this.f1504j = c2855g0;
                        this.f1505k = c2859j22;
                        this.f1502h = i9;
                        this.f1503i = 2;
                        m4514a = c2855g0.m4514a(EnumC2860k.f14997g, this);
                        enumC2465a2 = enumC2465a;
                        if (m4514a != enumC2465a2) {
                        }
                        return enumC2465a2;
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2855g0 = (C2855g0) this.f1504j;
                    i9 = 0;
                    if (i9 == 0) {
                    }
                }
        }
    }
}
